/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-21 00:48:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uni.cart.model.vo.Cart;

public final class productPayment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.uni.cart.model.vo.Cart");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Cart c = (Cart)request.getAttribute("c");
	Cart cd = new Cart();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://service.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.getPPrice() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m.getUserName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>\r\n");
      out.write("				    <p>아임 서포트 결제 모듈 테스트 해보기</p>\r\n");
      out.write("				    <button id=\"check_module\" type=\"button\">아임 서포트 결제 모듈 테스트 해보기</button>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><a id=\"continueShoopingBtn\" class=\"goShopping logging\" href=");
      out.print(request.getContextPath());
      out.write(">계속 쇼핑하기</a></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("		$(\"#check_module\").click(function () {\r\n");
      out.write("			\r\n");
      out.write("			var IMP = window.IMP; // 생략가능\r\n");
      out.write("			\r\n");
      out.write("			IMP.init('imp70634783');\r\n");
      out.write("				// 'iamport' 대신 부여받은 \"가맹점 식별코드\"를 사용\r\n");
      out.write("				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드\r\n");
      out.write("				\r\n");
      out.write("			IMP.request_pay({\r\n");
      out.write("				\r\n");
      out.write("					pg: 'inicis', // version 1.1.0부터 지원.\r\n");
      out.write("						/*\r\n");
      out.write("							'kakao':카카오페이,\r\n");
      out.write("							html5_inicis':이니시스(웹표준결제)\r\n");
      out.write("							'nice':나이스페이\r\n");
      out.write("							'jtnet':제이티넷\r\n");
      out.write("							'uplus':LG유플러스\r\n");
      out.write("							'danal':다날\r\n");
      out.write("							'payco':페이코\r\n");
      out.write("							'syrup':시럽페이\r\n");
      out.write("							'paypal':페이팔\r\n");
      out.write("						*/\r\n");
      out.write("					pay_method: 'card',\r\n");
      out.write("						/*\r\n");
      out.write("							'samsung':삼성페이,\r\n");
      out.write("							'card':신용카드,\r\n");
      out.write("							'trans':실시간계좌이체,\r\n");
      out.write("							'vbank':가상계좌,\r\n");
      out.write("							'phone':휴대폰소액결제\r\n");
      out.write("						*/\r\n");
      out.write("					merchant_uid: new Date().getTime(),\r\n");
      out.write("						/*\r\n");
      out.write("							merchant_uid에 경우\r\n");
      out.write("							https://docs.iamport.kr/implementation/payment\r\n");
      out.write("							위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.\r\n");
      out.write("							참고하세요.\r\n");
      out.write("							나중에 포스팅 해볼게요.\r\n");
      out.write("						*/\r\n");
      out.write("						\r\n");
      out.write("					name: '주문명:결제테스트',\r\n");
      out.write("					//결제창에서 보여질 이름\r\n");
      out.write("					\r\n");
      out.write("					amount: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.getPPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(",\r\n");
      out.write("					//가격\r\n");
      out.write("					\r\n");
      out.write("					buyer_email: 'iamport@siot.do',\r\n");
      out.write("					buyer_name: '구매자이름',\r\n");
      out.write("					buyer_tel: '010-1234-5678',\r\n");
      out.write("					buyer_addr: '서울특별시 강남구 삼성동',\r\n");
      out.write("					buyer_postcode: '123-456',\r\n");
      out.write("				\r\n");
      out.write("				}, function (rsp) {\r\n");
      out.write("					console.log(rsp);\r\n");
      out.write("					if (rsp.success) {\r\n");
      out.write("						var msg = '결제가 완료되었습니다.';\r\n");
      out.write("						msg += '고유ID : ' + rsp.imp_uid;\r\n");
      out.write("						msg += '상점 거래ID : ' + rsp.merchant_uid;\r\n");
      out.write("						msg += '결제 금액 : ' + rsp.paid_amount;\r\n");
      out.write("						msg += '카드 승인번호 : ' + rsp.apply_num;\r\n");
      out.write("						\r\n");
      out.write("						console.log(rsp.name)\r\n");
      out.write("				} else {\r\n");
      out.write("				var msg = '결제에 실패하였습니다.';\r\n");
      out.write("				msg += '에러내용 : ' + rsp.error_msg;\r\n");
      out.write("				}\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
