/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-29 00:36:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	font-family: SF Pro KR, SF Pro Display, SF Pro Icons, AOS Icons, Apple Gothic, HY Gulim, MalgunGothic, HY Dotum, Lexi Gulim, Helvetica Neue, Helvetica, Arial, sans-serif;\n");
      out.write("	.layerPopup img {\n");
      out.write("		margin-bottom:20px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup:before {\n");
      out.write("		display:block;\n");
      out.write("		content:\"\";\n");
      out.write("		position:fixed;\n");
      out.write("		left:0;\n");
      out.write("		top:0;\n");
      out.write("		width:100%;\n");
      out.write("		height:100%;\n");
      out.write("		background:rgba(0,0,0,.5);\n");
      out.write("		z-index:9000\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup .layerBox {\n");
      out.write("		z-index:10000;   \n");
      out.write("		position:fixed;\n");
      out.write("		left:85%;\n");
      out.write("		top:48%;\n");
      out.write("		transform:translate(-50%, -50%);\n");
      out.write("		padding:30px;\n");
      out.write("		background:#fff;\n");
      out.write("		border-radius:6px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup .layerBox .title {\n");
      out.write("		margin-bottom:10px;\n");
      out.write("		padding-bottom:10px;\n");
      out.write("		font-weight:600;\n");
      out.write("		border-bottom:1px solid #d9d9d9;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup .layerBox .btnTodayHide {\n");
      out.write("		font-size:14px;\n");
      out.write("		font-weight:600;\n");
      out.write("		color:black; \n");
      out.write("		float:left;\n");
      out.write("		text-decoration:none;\n");
      out.write("		width:150px; \n");
      out.write("		height:30px;\n");
      out.write("		line-height:30px;\n");
      out.write("		border:black solid 1px;\n");
      out.write("		text-align:center;\n");
      out.write("		text-decoration:none;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup div {\n");
      out.write("		display: nline;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup form {\n");
      out.write("		margin-top:5px;\n");
      out.write("		font-size:16px; font-weight:600;\n");
      out.write("		weight:100%;\n");
      out.write("		height:30px;\n");
      out.write("		line-height:30px\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup #close {\n");
      out.write("		font-size:16px;\n");
      out.write("		font-weight:600;\n");
      out.write("		width:40px;\n");
      out.write("		height:30px;\n");
      out.write("		color:black;\n");
      out.write("		float:right;\n");
      out.write("		line-height:30px;\n");
      out.write("		text-align:center;\n");
      out.write("		text-decoration:underline;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.layerPopup a {\n");
      out.write("		text-decoration:none;\n");
      out.write("		color:black;\n");
      out.write("		width:50px;\n");
      out.write("		height:40px;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("	// 24?????? ?????? ?????? ?????? ??????\n");
      out.write("	function setCookie( name, value, expiredays ) {\n");
      out.write("		// ?????? ?????? ??????\n");
      out.write("		var todayDate = new Date();\n");
      out.write("		// set ?????? ?????? ?????? ?????? ?????? (+1 ??????)\n");
      out.write("		todayDate.setDate( todayDate.getDate() + expiredays ); \n");
      out.write("		// ?????? ??????\n");
      out.write("		// todayDate.toGMTString() : UTC ????????? ????????? expiredays ?????? ??????????????? ?????? ?????? ?????? ?????? ??????\n");
      out.write("		document.cookie = name + \"=\" + escape( value ) + \"; path=/; expires=\" + todayDate.toGMTString() + \";\"\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	// ?????? ??????\n");
      out.write("	function closePop() {\n");
      out.write("		// ?????? ?????? ??? ?????? ???????????? ?????????\n");
      out.write("        if ( document.pop_form.chkbox.checked ) {\n");
      out.write("            // setCookie() ????????? ???????????? ????????? ??????\n");
      out.write("            // ?????? ??????, ???, ??????(1??? ??????, 7??? ?????????)\n");
      out.write("        	setCookie( \"maindiv\", \"done\" , 1 );\n");
      out.write("        }\n");
      out.write("		// ?????? ???????????????\n");
      out.write("        document.all['layer_popup'].style.visibility = \"hidden\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<!-- layer popup content -->\n");
      out.write("	<div class=\"layerPopup\" id=\"layer_popup\" style=\"visibility: visible;\">\n");
      out.write("    	<div class=\"layerBox\">\n");
      out.write("        	<h4 class=\"title\">????????????</h4>\n");
      out.write("        	<div class=\"cont\">\n");
      out.write("            	<p>\n");
      out.write("            		");
      out.write("\n");
      out.write("            		");
      out.write("\n");
      out.write("					<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/image/popup.jpg\" width=350 height=500 usemap=\"#popup\" alt=\"event page\">\n");
      out.write("            	</p>\n");
      out.write("        	</div>\n");
      out.write("          	<form name=\"pop_form\">\n");
      out.write("	        	<div id=\"check\" >\n");
      out.write("	        		<input type=\"checkbox\" name=\"chkbox\" value=\"checkbox\" id='chkbox' >\n");
      out.write("	        		<label for=\"chkbox\">?????? ???????????? ?????? ??????</label>\n");
      out.write("	       		</div>\n");
      out.write("	       		");
      out.write("\n");
      out.write("				<div id=\"close\" ><a href=\"javascript:closePop();\">??????</a></div>    \n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("		\n");
      out.write("		// ?????? ???????????? ??????\n");
      out.write("		cookiedata = document.cookie;   \n");
      out.write("		// ?????? ????????? ?????? ????????????\n");
      out.write("	    if ( cookiedata.indexOf(\"maindiv=done\") < 0 ) {     \n");
      out.write("	        document.all['layer_popup'].style.visibility = \"visible\";\n");
      out.write("	    // ?????? ????????? ?????? ??? ???????????? ????????? ?????????\n");
      out.write("	    } else {\n");
      out.write("	        document.all['layer_popup'].style.visibility = \"hidden\";\n");
      out.write("	    }\n");
      out.write("	\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("</body>\n");
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
