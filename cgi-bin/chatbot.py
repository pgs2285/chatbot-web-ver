#!/usr/bin/env python3
import cgi
from botengine import make_reply

form = cgi.FieldStorage()

def main():
    m = form.getvalue("m", default="")
    if   m == "" : show_form()
    elif m == "say" : api_say()

def api_say():
    print("Content-Type: text/plain; charset=utf-8")
    print("")
    text = form.getvalue("text", default="")
    if text == "": return
    res = make_reply(text)
    print(res)

def show_form():
    print("Content-Type: text/html; charset=utf-8")
    print("")
    print("""
    <html><meta charset="utf-8"><body>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <style>
        h1   { background-color: #ffe0e0; }
        div  { padding:10px; }
        span { border-radius: 10px; background-color: #ffe0e0; padding:8px; }
        .bot { text-align: left; }
        .usr { text-align: right; }
    </style>
    <h1>JS Test Chatbot</h1>
    <div id="chat"></div>
    <div class='usr'><input id="text" size="40">
    <button onclick="say()">보내기</button></div>
    <script>
    var url = "./chatbot.py";
    function say() {
      var text = $('#text').val();
      $.get(url, {"m":"say","text":text},
        function(res) {
          var html = "<div class='usr'><span>" + esc(text) +
            "</span>: 나</div><div class='bot'> 봇:<span>" + 
            esc(res) + "</span></div>";
          $('#chat').html($('#chat').html()+html);
          $('#text').val('').focus();
        });
    }
    function esc(s) {
        return s.replace('&', '&amp;').replace('<','&lt;')
                .replace('>', '&gt;');
    }
    </script></body></html>
    """)
main()
