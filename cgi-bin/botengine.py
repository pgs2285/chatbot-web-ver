import codecs
from bs4 import BeautifulSoup
import urllib.request
from konlpy.tag import Okt
import os, re, json, random
from hanspell import spell_checker
dict_file = "chatbot-data.json"
dic = {}
okt = Okt()

def register_dic(words): #사전에 단어 등록하기
    global dic
    if len(words) == 0: return
    tmp = ['@']
    for i in words:
        word = i[0]
        if word == "" or word =="\r\n" or word == "\n": continue
        tmp.append(word)
        if len(tmp) < 3: continue
        if len(tmp) > 3 : tmp = tmp[1:]
        set_word3(dic, tmp)
        if word == "." or word == "?":
            tmp = ["@"]
            continue

    json.dump(dic, open(dict_file, "w", encoding = "utf-8")) #딕셔너리가 변경될때마다 저장     

def set_word3(dic, s3):
    w1, w2, w3 = s3
    if not w1 in dic: dic[w1] = {}
    if not w2 in dic[w1]: dic[w1][w2] = {}
    if not w3 in dic[w1][w2]: dic[w1][w2][w3] = 0
    dic[w1][w2][w3] += 1

def word_choice(sel):
    keys = sel.keys()
    return random.choice(list(keys))

def make_sentence(head):
    if not head in dic: return ""
    ret = []
    if head != "@": ret.append(head)
    top = dic[head]
    w1 = word_choice(top)
    w2 = word_choice(top[w1])
    ret.append(w1)
    ret.append(w2)
    while True:
        if w1 in dic and w2 in dic[w1]:
            w3 = word_choice(dic[w1][w2])
        else:
            w3 = ""
        ret.append(w3)
        if w3 == "." or w3 == "?" or w3 == "": break
        w1, w2 = w2, w3
    ret = "".join(ret)        
        
    # params = urllib.parse.urlencode({ #urlencode: 딕서너리를 쿼리 문자열로 반환함
    #     "_callback" : "",
    #     "q": ret
    # })
    # print(params)
    # data = urllib.request.urlopen("https://m.search.naver.com/p/csearch/ocontent/spellchecker.nhn"+params)
    # data = data.read().decode("utf-8")[1:-2]
    # data = json.loads(data)
    # data = data["message"]["result"]["html"]
    # data = soup = BeautifulSoup(data, "html.parser").getText()
    spelled_sent = spell_checker.check(ret)
    checked_sent = spelled_sent.checked
    return checked_sent

def make_reply(text):#챗봇 응답 만들기
    if not text[-1] in [".", "?"]: text += "."
    words = okt.pos(text)
    register_dic(words)
    for word in words:
        face = word[0]
        if face in dic: return make_sentence(face)
    return make_sentence("@")

if os.path.exists(dict_file):
    dic = json.load(open(dict_file, "r"))    