/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.48
 * Generated at: 2021-06-24 14:43:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Jisung Photofolio</title>  \n");
      out.write("        <meta charset = \"utf-8\">\n");
      out.write("        <!-- <meta name =\"viewport\" content =\"width=device-width, initial-scale = 1\" > -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js\" integrity=\"sha384-LtrjvnR4Twt/qOuYxE721u19sVFLVSA4hf/rRt6PrZTmiPltdZcI7q7PXQBYTKyf\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fadein.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <a class=\"choice2\" href=\"index.html\" style=\"margin-left:2%\"><i class=\"fa fa-home fa-2x\" aria-hidden=\"true\"> </i></a>\n");
      out.write("            <a class= \"choice2\" href=\"myInfo.html\" style=\"margin-left:8%\"> <i class=\"fa fa-user-o\" aria-hidden=\"true\"> </i> <b> My Infomation</b></a>\n");
      out.write("            <a class= \"choice2\" href=\"whatido.html\" style=\"margin-left:15%\"><i class=\"fa fa-question-circle\" aria-hidden=\"true\"></i><b> What did i do?</b></a>\n");
      out.write("            <a class= \"choice2\" href=\"feedback.jsp\" style=\"margin-left: 15%;\"> <i class=\"fa fa-comment\" aria-hidden=\"true\"></i> <b> Feedback</b></a>\n");
      out.write("            <a class= \"choice2\" href=\"https://github.com/pgs2285\" style=\"margin-left:15%\"><i class=\"fa fa-github\" aria-hidden=\"true\"></i><b> My Github</b></a>            \n");
      out.write("        </div>\n");
      out.write("        <hr class=\"line2\" style=\"width:200%; border:none; height:3px; background-color:black;\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <b style=\"font-size: 20px; margin-left:5%\">앞서 구현한 웹사이트 방문자들이 작성 할 수 있는 피드백 혹은 방명록 입니다.</b><br>\n");
      out.write("        <b style=\"font-size: 20px; margin-left:5%\">편하게 작성해 주셔도 됩니다.</b><br><br><br>\n");
      out.write("\n");
      out.write("        <div class = \"container\">\n");
      out.write("            <div class = \"row\">\n");
      out.write("                <form method=\"post\" action=\"write.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <thead style=\"color:white; font-size:25px\">\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody style=\"color:white; font-size:20px\">\n");
      out.write("                        \n");
      out.write("                            <tr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <td><input type = \"text\" class = \"form-control\" placeholder=\"제목입력\" maxlength=\"50\" name=\"feedbackTitle\" style=\"font-size: 20px;\"></td>\n");
      out.write("                                    <td><input type = \"text\" class = \"form-control\" placeholder=\"작성자 입력\" maxlength=\"32\" name=\"feedbackId\" style=\"font-size: 20px; \"></td>        \n");
      out.write("                                </div>    \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <textarea type=\"text\" class=\"form-control\" placeholder=\"글 내용\" name=\"feedbackContent\"maxlength=\"2048\"style=\"font-size: 20px;\"></textarea>\n");
      out.write("                        \n");
      out.write("                        </tbody>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" class = \"btn btn-primary pull-right\" style=\"font-size:15px;\" value=\"작성하기!\"></input>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class = \"container\">\n");
      out.write("            <table class=\"table table-black\">\n");
      out.write("                <thead style=\"color:white; font-size:25px\">\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">작성일자</th>\n");
      out.write("                    <th scope=\"col\">이름</th>\n");
      out.write("                    <th scope=\"col\">제목</th>\n");
      out.write("                    <th scope=\"col\">내용</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody style=\"color:white; font-size:20px\">\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"row\">1</th>\n");
      out.write("                    <td>Larry</td>\n");
      out.write("                    <td>the Bird</td>\n");
      out.write("                    <td>test</td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("              <br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
