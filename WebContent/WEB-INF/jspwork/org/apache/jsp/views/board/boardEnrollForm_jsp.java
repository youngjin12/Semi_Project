/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-30 10:41:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardEnrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/SemiProject/PleaseCal/pleaseCal_Backup/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/SemiProject/PleaseCal/pleaseCal_Backup/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647475557049L));
    _jspx_dependants.put("jar:file:/C:/SemiProject/PleaseCal/pleaseCal_Backup/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

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
      out.write('\n');
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>게시글 작성 폼</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	\n");
      out.write("	.outer{\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top:50px;\n");
      out.write("		margin-bottom:50px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm{\n");
      out.write("		width:60%;\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top:50px;\n");
      out.write("		margin-bottom:50px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm>table{\n");
      out.write("		border:1px solid black;\n");
      out.write("	\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm>table input, #enrollForm>table textarea{\n");
      out.write("		width:100%;\n");
      out.write("		box-sizing:border-box;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.btns{margin:auto; margin-bottom:20px}\n");
      out.write("	\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<!-- menu -->\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("	\n");
      out.write("	<div>\n");
      out.write("		<br>\n");
      out.write("		\n");
      out.write("		<h2 align=\"center\">질문 게시글 작성하기</h2>\n");
      out.write("		\n");
      out.write("		");
      out.write("\n");
      out.write("		<form id=\"enrollForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/boardInsert.do\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("			\n");
      out.write("			<table align=\"center\">\n");
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<th width=\"100\">카테고리</th>\n");
      out.write("					<td width=\"500\">\n");
      out.write("						<select id=\"category\" name=\"category\">\n");
      out.write("							<option>상품 문의</option>\n");
      out.write("							<option>배송 문의</option>\n");
      out.write("							<option>기타 문의</option>\n");
      out.write("						</select>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>내용</th>\n");
      out.write("					<td>\n");
      out.write("						<textarea rows=\"15\" id=\"content\" name=\"content\" style=\"resize:none;\"></textarea>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>첨부파일</th>\n");
      out.write("					<td><input type=\"file\" name=\"upfile\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>비밀번호</th>\n");
      out.write("					<td><input tyle=\"text\" id=\"pwd\" name=\"pwd\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>비밀글 설정</th>\n");
      out.write("					<td>\n");
      out.write("						<label>\n");
      out.write("					    	<input type=\"radio\" id=\"public\" name=\"public\" disabled> 공개글\n");
      out.write("					    	<input type=\"radio\" id=\"secret\" name=\"secret\" checked> 비밀글\n");
      out.write("					  	</label>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				\n");
      out.write("			</table>\n");
      out.write("			\n");
      out.write("			<br>\n");
      out.write("			\n");
      out.write("			<div class=\"btns\" align=\"center\">\n");
      out.write("				<button type=\"submit\" id=\"insert\">등록하기</button>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("		</form>\n");
      out.write("	\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("	\n");
      out.write("		// 폼 제출 시 카테고리, 내용, 비밀번호 비어 있으면 알림창 띄우기\n");
      out.write("		$(\"form\").submit(function() {\n");
      out.write("			// 내용, 비밀번호 값을 변수에 담아서\n");
      out.write("			var content = $(\"#content\").val();\n");
      out.write("			var pwd = $(\"#pwd\").val();\n");
      out.write("			\n");
      out.write("			// 내용이 비어있는 경우\n");
      out.write("			if(content == \"\" || content == null) {\n");
      out.write("				// 폼의 액션 태그 제거 (서블릿으로 넘어가 게시글 등록 막기 위해)\n");
      out.write("				$(this).removeAttr(\"action\");\n");
      out.write("				// 알림 띄우기\n");
      out.write("				alert(\"내용을 작성해주세요.\");\n");
      out.write("				// 해당 입력창에 포커스 주기\n");
      out.write("				$(\"#content\").attr(\"tabindex\", -1).focus();\n");
      out.write("				\n");
      out.write("				return false;\n");
      out.write("			\n");
      out.write("			// 비밀번호가 비어있는 경우\n");
      out.write("			} else if(pwd == \"\" || pwd == null) {\n");
      out.write("				// 폼의 액션 태그 제거 (서블릿으로 넘어가 게시글 등록 막기 위해)\n");
      out.write("				$(this).removeAttr(\"action\");\n");
      out.write("				// 알림 띄우기\n");
      out.write("				alert(\"비밀번호를 작성해주세요.\");\n");
      out.write("				// 해당 입력창에 포커스 주기\n");
      out.write("				$(\"#pwd\").focus();\n");
      out.write("				\n");
      out.write("				return false;\n");
      out.write("			\n");
      out.write("			// 잘 작성이 되어있으면\n");
      out.write("			} else {\n");
      out.write("				// 제거했던 액션 태그 다시 추가해서 잘 진행되도록\n");
      out.write("				$(this).attr(\"action\", \"");
      out.print(request.getContextPath());
      out.write("/boardInsert.do\");\n");
      out.write("			}	\n");
      out.write("		})\n");
      out.write("		\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	<!-- footer-->\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
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
