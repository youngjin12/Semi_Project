/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-25 05:59:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uni.member.model.vo.*;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("com.uni.member.model.vo");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('	');

	 Member m = (Member)request.getAttribute("loginUser");
	 String username=m.getUserName();
	 String userPwd = m.getUserPwd();
	 int mileage = m.getMilege();
	
      out.write("\n");
      out.write("	\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>mypage</title>\n");
      out.write("<style>\n");
      out.write("#Members {\n");
      out.write("	margin-left: 12%;\n");
      out.write("	margin-top: 5%;\n");
      out.write("	height: 200px;\n");
      out.write("	width: 1500px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#membut {\n");
      out.write("	height: 200px;\n");
      out.write("	width: 300px;\n");
      out.write("	 background-color:white;\n");
      out.write("}\n");
      out.write("#memdel{\n");
      out.write("    height: 200px;\n");
      out.write("	width: 300px;\n");
      out.write("	 background-color:white;\n");
      out.write("}\n");
      out.write("#memup{\n");
      out.write(" height: 200px;\n");
      out.write(" width: 300px;\n");
      out.write(" background-color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#mil {\n");
      out.write("	margin-top: 5%;\n");
      out.write("	width: 1400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h5 {\n");
      out.write("	display: inline;\n");
      out.write("}\n");
      out.write("#名前{\n");
      out.write("margin-top: 5%;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("background-image:url('https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20150404_201%2Fbbilla_1428082120293qFxQp_JPEG%2F%25C7%25CF%25B3%25AA%25BE%25B2%25B9%25D9%25C5%25C1%25C8%25AD%25B8%25E9_05_1920x1080_20150402-01.jpg&type=a340')\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("<div id=\"名前\">\n");
      out.write("	<strong><h3 style=\"display:inline\">\n");
      out.write("			");
      out.print(username);
      out.write("님의MyPage\n");
      out.write("			</h3></strong>\n");
      out.write("			</div>\n");
      out.write("			<input type=\"hidden\" id = \"originPwd\" name = \"originPwd\" value = \"");
      out.print(userPwd);
      out.write("\">\n");
      out.write("			\n");
      out.write("	<div id=\"mil\">\n");
      out.write("\n");
      out.write("		<strong><h5 style=\"margin-left: 250px\">Milege</h5></strong> \n");
      out.write("		<strong><h5	style=\"margin-left: 470px\">");
      out.print(mileage);
      out.write("원</h5></strong> \n");
      out.write("		<strong><h5 style=\"margin-left: 100px\">Coupon</h5></strong>\n");
      out.write("		<input type =\"button\" style=\"margin-left: 200px\" value=\"조회\" onClick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/coupon.do'\"></input>		\n");
      out.write("		<input type =\"button\"  value=\"쿠폰받기\" onClick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/howcoupon.do'\"></input>		\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("        <hr  style=\"border: solid 2px black;\" >\n");
      out.write("       \n");
      out.write("	<div id=\"Members\">\n");
      out.write("	<table>\n");
      out.write("		<tr>\n");
      out.write("		<td><a href=\"");
      out.print(request.getContextPath());
      out.write("/myOrderList.do\" id=\"membut\" type=\"button\" ><h4>주문목록</h4><small>고객님의소중한상품을담고있어요(≧∇≦)/</small></button> </td>\n");
      out.write("		<td><button id=\"memup\" style=\"margin-left: 200px;\" onClick=\"memberupdate();\"><h4>정보수정</h4><small>고객님의주소및비밀번호를변경할수있어요<br>ヾ(・ᆺ・✿)ﾉﾞ</small></button></td>\n");
      out.write("		<form id=\"memdelete\">	\n");
      out.write("		<td><button id=\"memdel\" style=\"margin-left: 200px;\" onclick=\"deleteMember();\"><h4>회원탈퇴</h4><small>정말로..탈퇴할건가요｡ﾟ( ﾟஇ‸இﾟ+)ﾟ｡</small></button>		</td>\n");
      out.write("		</form>	\n");
      out.write("		</tr>	\n");
      out.write("	</table>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<br><br>\n");
      out.write("	\n");
      out.write("	<div id=\"Members\">\n");
      out.write("		<input id=\"membut\" type=\"button\" value=\"나의 후기\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/myReviewForm.do'\"></input> \n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("	 function memberupdate(){\n");
      out.write("         location.href = \"");
      out.print( request.getContextPath());
      out.write("/memberupdate.do\"; \n");
      out.write("                }     \n");
      out.write("	\n");
      out.write("	\n");
      out.write("	     function deleteMember(){\n");
      out.write("	    	  var  pwd = prompt(\"현재 비밀번호를 입력해주세요\")\n");
      out.write("	    	  var op = $(\"#originPwd\").val();\n");
      out.write("	    	  \n");
      out.write("	    	  if(op === pwd){\n");
      out.write("	    	  	    	  \n");
      out.write("	    	  var val = confirm(\"한번만 다시 생각하면 안될까요?˚‧º·(˚ ˃̣̣̥᷄⌓˂̣̣̥᷅ )‧º·˚\");\n");
      out.write("	    	      	  \n");
      out.write("	    	  if(val){\n");
      out.write("	    		  alert(\"잘가요.( ˃̣̣̥᷄⌓˂̣̣̥᷅ )\");\n");
      out.write("	    		  $(\"#memdelete\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/deleteMember.do\");\n");
      out.write("	    		  $(\"#memdelete\").submit();	    		  \n");
      out.write("	    	  }else{\n");
      out.write("	    		  alert(\"취소했어요.ヾ(๑ㆁᗜㆁ๑)ﾉ”\");\n");
      out.write("	    	  }\n");
      out.write("	      }\n");
      out.write("	      }\n");
      out.write("	     </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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