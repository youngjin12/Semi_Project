/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-18 05:12:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.healthInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>칼로리 계산기/일일 권장 영양 섭취 계산기</title>\n");
      out.write("<style>\n");
      out.write(".frms input[type=\"text\"], select {\n");
      out.write("	background: none repeat scroll 0 0 #fff;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("	border-radius: 0.35em;\n");
      out.write("	height: 35px;\n");
      out.write("	margin-bottom: 15px;\n");
      out.write("	margin-top: 5px;\n");
      out.write("	padding: 0 0.5%;\n");
      out.write("	width: 90%;\n");
      out.write("}\n");
      out.write(".resp_code { \n");
      out.write("    background: none repeat scroll 0 0 #f8f8f8;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    border-radius: 0.25em;\n");
      out.write("    color: #333;\n");
      out.write("    font: 1em/1.3em Tahoma,Geneva,sans-serif;\n");
      out.write("    margin: 5px 10px 10px 20%;\n");
      out.write("    overflow: auto;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write(".hidden{\n");
      out.write("	display:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("	<div class='resp_code' align='center'>\n");
      out.write("		<table id ='tab' align='center' style=\"width:60%;\">\n");
      out.write("			<tr>\n");
      out.write("				<td align=center><h3>일일 권장 칼로리 계산기</h3>\n");
      out.write("				<form id =\"frm\" name=\"frm\" action=\"");
      out.print(request.getContextPath());
      out.write("/calResult.do\" method=\"post\" class='frms noborders'>\n");
      out.write("				<input type=\"hidden\" name=\"no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("				<table>\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<p>나이 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<input type=\"text\" name=\"age\" id=\"age\" align=\"left\" size=\"3\" maxlength=\"2\" onKeyPress=\"return cknum(event,age)\">\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<p>세</p>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<p>성별 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							\n");
      out.write("							<input type=\"radio\" class=\"btn-check\" name=\"gen\" id=\"gen1\" value=\"T\" checked> \n");
      out.write("							<label class=\"btn btn-outline-dark btn-sm\" for=\"gen1\">남성</label>\n");
      out.write("							<input type=\"radio\" class=\"btn-check\" name=\"gen\" id=\"gen2\" value=\"F\">\n");
      out.write("							<label class=\"btn btn-outline-dark btn-sm\" for=\"gen2\">여성</label>\n");
      out.write("	\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("					\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<p>키 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td><input type=\"text\" name=\"cen\" id=\"cen\" size=\"4\" ></td>\n");
      out.write("					</tr>\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<p>몸무게 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td><input type=\"text\" name=\"weight\" id=\"weight\" maxlength=\"3\" size=\"3\"></td>\n");
      out.write("						<td>\n");
      out.write("						\n");
      out.write("							<p id=\"kg\">kg</p>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<p>활동량 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<select style='width:150px;' name=\"loa\" id=\"loa\">\n");
      out.write("								<option value=\"1\">좌식</option>\n");
      out.write("								<option value=\"2\">가벼운활동(주 1~3일)</option>\n");
      out.write("								<option value=\"3\">중간정도운동(주 3~5일)</option>\n");
      out.write("								<option value=\"4\">많은운동(주6~7일)</option>\n");
      out.write("								<option value=\"5\">매우힘든운동(스포츠 및 육체노동)</option>\n");
      out.write("							</select>\n");
      out.write("						</td>\n");
      out.write("				</table>\n");
      out.write("				\n");
      out.write("				<div>\n");
      out.write("					<br>\n");
      out.write("					<button type=\"submit\" id=\"save\" class=\"btn btn-outline-success btn-sm\"> 정보저장 </button>\n");
      out.write("					<button type=\"submit\" id=\"delete\" class=\"btn btn-outline-danger btn-sm\" > 정보삭제 </button>\n");
      out.write("				</div>\n");
      out.write("				\n");
      out.write("				</form>\n");
      out.write("			\n");
      out.write("				\n");
      out.write("				<br>\n");
      out.write("				<button type=\"button\" id=\"result\" class=\"btn btn-primary\"> 칼로리 계산 </button>\n");
      out.write("				<table align=\"center\" class=\"frms noborders\">\n");
      out.write("			\n");
      out.write("					<tr>\n");
      out.write("						<td align=\"right\">\n");
      out.write("							<p>일일 권장 칼로리 : </p>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<input type=\"text\" id=\"rc\" style=\"font-size:13px;\" size=\"15\" readonly>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<p>kcal</p>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("				</table>\n");
      out.write("			\n");
      out.write("				<div>\n");
      out.write("					<p>▼일일 권장 영양 섭취▼</p>\n");
      out.write("				<div>\n");
      out.write("				\n");
      out.write("		   		\n");
      out.write("		   		<table class=\"frms noborders\">\n");
      out.write("				<tr>\n");
      out.write("					<td>\n");
      out.write("						<p>지방 : </p>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<input type=\"text\" id=\"rf\" size=\"10\" readonly>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<p>g</p>\n");
      out.write("					</td>\n");
      out.write("					\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td>\n");
      out.write("						<p>단백질 : </p>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<input type=\"text\" id=\"rp\" size=\"10\" readonly>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<p>g</p>\n");
      out.write("					</td>\n");
      out.write("					\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td>\n");
      out.write("						<p>탄수화물 : </p>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<input type=\"text\" id=\"rh\" size=\"10\" readonly>\n");
      out.write("					</td>\n");
      out.write("					<td>\n");
      out.write("						<p>g</p>\n");
      out.write("					</td>\n");
      out.write("					\n");
      out.write("				</tr>\n");
      out.write("				\n");
      out.write("			</table>\n");
      out.write("		</div>\n");
      out.write("	</table>\n");
      out.write("	</div>\n");
      out.write("	<div class='resp_code' align='center'>\n");
      out.write("	<section class=\"py-5\"><h3>추천상품</h3>\n");
      out.write("       <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("           <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\" id=\"list\">\n");
      out.write("           		<!-- 모든상품 삽입 -->\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("   </section>\n");
      out.write("	</div>\n");
      out.write("	<script>\n");
      out.write("		\n");
      out.write("		$(function(){\n");
      out.write("		\n");
      out.write("			let userNo = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("			\n");
      out.write("			if(userNo != 0) { // 회원일때 값이 있으면 불러오기\n");
      out.write("\n");
      out.write("				$.ajax({\n");
      out.write("					\n");
      out.write("					url: \"selectHealthInfo.do\",\n");
      out.write("					\n");
      out.write("					type: \"post\",\n");
      out.write("					\n");
      out.write("					data: {\n");
      out.write("						no: userNo\n");
      out.write("					},\n");
      out.write("					\n");
      out.write("					success:function(h){\n");
      out.write("						\n");
      out.write("						$('input[id=age]').attr('value',h.age);\n");
      out.write("						//$(\"#age\").val(h.age);\n");
      out.write("						$(\"#cen\").val(h.height);\n");
      out.write("						$(\"#weight\").val(h.weight);\n");
      out.write("						$('#loa').val(h.active).prop(\"selected\",true);\n");
      out.write("						$(\":radio[name='gen'][value='\" + h.gen + \"']\").attr('checked', true);\n");
      out.write("\n");
      out.write("					},\n");
      out.write("					\n");
      out.write("				\n");
      out.write("				})\n");
      out.write("				\n");
      out.write("\n");
      out.write("			} else if (userNo == 0){ // 비회원일때 버튼들 안보임\n");
      out.write("				$('#save').hide();\n");
      out.write("				$('#delete').hide(); \n");
      out.write("			\n");
      out.write("			} \n");
      out.write("			\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("   		   		url: \"listProduct.do\",\n");
      out.write("   		   		\n");
      out.write("   		   		type: \"get\",\n");
      out.write("   		   		\n");
      out.write("   		   		success:function(list){\n");
      out.write("   		   	\n");
      out.write("   		   			let value = \"\";\n");
      out.write("   		   			\n");
      out.write("   		   			for(var i in list){\n");
      out.write("   		   				\n");
      out.write("\n");
      out.write("						value += '<div class=\"col mb-5\">'+\n");
      out.write("								'<div class=\"card h-100\">'+\n");
      out.write("								'<a href=\"");
      out.print(request.getContextPath() );
      out.write("/detailProduct.do?no='+list[i].pId+'\"><img class=\"card-img-top\" src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/image/'+list[i].piName+'\" alt=\"상품이미지\" /></a>'+\n");
      out.write("								'<div class=\"card-body p-4\">'+\n");
      out.write("								'<div class=\"text-center\">'+\n");
      out.write("								'<h5 class=\"fw-bolder\">'+list[i].pName+'</h5>'+list[i].pPrice+'</div>'+\n");
      out.write("								'</div>'+\n");
      out.write("								'<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">'+\n");
      out.write("								'<div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"");
      out.print(request.getContextPath() );
      out.write("/detailProduct.do?no='+list[i].pId+'\">상세정보</a></div>'+\n");
      out.write("								'</div></div></div>';\n");
      out.write("		                  \n");
      out.write("					}\n");
      out.write("					$(\"#list\").html(value);\n");
      out.write("   		   		},\n");
      out.write("   		   		\n");
      out.write("   		   		error:function(){\n");
      out.write("   		   			console.log(\"ajax통신실패\");\n");
      out.write("   		   		}\n");
      out.write("   	   		})\n");
      out.write("			\n");
      out.write("		})\n");
      out.write("		\n");
      out.write("		$('#delete').click(function(){\n");
      out.write("			\n");
      out.write("			$(\"#frm\").attr(\"action\", \"");
      out.print(request.getContextPath());
      out.write("/deleteHealthInfo.do\");\n");
      out.write("			$(\"#frm\").submit();\n");
      out.write("			\n");
      out.write("		})\n");
      out.write("		\n");
      out.write("		\n");
      out.write("	\n");
      out.write("		$('#result').click(function(){\n");
      out.write("			\n");
      out.write("			let cneed; // 활동량을 통한 칼로리요구량\n");
      out.write("			let fneed; // 지방\n");
      out.write("			let crneed; // 탄수화물\n");
      out.write("			let pneed; // 단백질\n");
      out.write("			let bmr; // 비만도\n");
      out.write("			\n");
      out.write("			// 나이, 키(cm), 몸부계\n");
      out.write("			let age=parseInt($(\"#age\").val());\n");
      out.write("			let cm =$(\"#cen\").val();\n");
      out.write("			let weight=$(\"#weight\").val();\n");
      out.write("			\n");
      out.write("			if (age!='' && cm!='' && weight!='') {\n");
      out.write("				\n");
      out.write("				let loa=$('#loa').val();\n");
      out.write("				\n");
      out.write("				// 남여체크에 따른 BMR계산 \n");
      out.write("				if($('input[name=gen]:checked').val() == '남') {\n");
      out.write("					bmr=(10*weight)+(6.25*cm)-(5*age)+5;\n");
      out.write("				} else {\n");
      out.write("					bmr=(10*weight)+(6.25*cm)-(5*age)-161;\n");
      out.write("				}\n");
      out.write("				\n");
      out.write("				// Harris-Benedict 방정식 -> 총 일일 칼로리 요구량을 결정\n");
      out.write("				switch(loa) {\n");
      out.write("					case \"1\":\n");
      out.write("					cneed=bmr*1.2;\n");
      out.write("					break;\n");
      out.write("					case \"2\":\n");
      out.write("					cneed=bmr*1.375\n");
      out.write("					break;\n");
      out.write("					case \"3\":\n");
      out.write("					cneed=bmr*1.55;\n");
      out.write("					break;\n");
      out.write("					case \"4\":\n");
      out.write("					cneed=bmr*1.725;\n");
      out.write("					break;\n");
      out.write("					case \"5\":\n");
      out.write("					cneed=bmr*1.9;\n");
      out.write("					break;\n");
      out.write("				}\n");
      out.write("				\n");
      out.write("				// 칼로리 소수점정리\n");
      out.write("				cneed=Math.floor(cneed);\n");
      out.write("				\n");
      out.write("				// 열량 -> g 변환\n");
      out.write("				fneed=Math.floor((cneed*0.25)/9); // 지방\n");
      out.write("				pneed=Math.floor((cneed*0.25)/4); // 단백질\n");
      out.write("				crneed=Math.floor((cneed*0.25)/4); // 탄수화물\n");
      out.write("				$(\"#rc\").val(\" \"+cneed); // 칼로리\n");
      out.write("				$(\"#rf\").val(\" \"+fneed); // 지방\n");
      out.write("				$(\"#rp\").val(\" \"+pneed); // 단백질\n");
      out.write("				$(\"#rh\").val(\" \"+crneed); // 탄수화물\n");
      out.write("				\n");
      out.write("\n");
      out.write("			} else {\n");
      out.write("				alert(\"값을 모두 입력하세요\");\n");
      out.write("				\n");
      out.write("			}\n");
      out.write("\n");
      out.write("		})\n");
      out.write("			\n");
      out.write("		function cknum(event,num) {\n");
      out.write("			\n");
      out.write("			let key;\n");
      out.write("			\n");
      out.write("			if(window.event) { // 숫자를 누를때\n");
      out.write("				key=event.keyCode; // 찍히는 이벤트번호\n");
      out.write("			} else {\n");
      out.write("				key=event.which;\n");
      out.write("			}\n");
      out.write("			console.log(event.keyCode)\n");
      out.write("	\n");
      out.write("			let a = num.value; // 나이입력칸의 값\n");
      out.write("			\n");
      out.write("			if(key==48) { // 0 입력시\n");
      out.write("				\n");
      out.write("				if(a==\"\") { // 빈값에서 처음 0 입력시 \n");
      out.write("					return false; // 불가\n");
      out.write("				} else {\n");
      out.write("					return true;\n");
      out.write("				}\n");
      out.write("				\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			if (key!= 8 && key != 0) { // Backspace 아닐때\n");
      out.write("				\n");
      out.write("				if (key < 49 || key > 57) { // 숫자 0~9가 아닌값은 못들어감\n");
      out.write("					return false;\n");
      out.write("				}\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
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
