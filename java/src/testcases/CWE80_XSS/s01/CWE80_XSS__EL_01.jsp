<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>Localized Dates</title></head>
<body bgcolor="white">


<%
  // 파라미터(name)에 <script>alert(document.cookie);</script>와 같은
  // 스크립트 코드가 입력되면 공격자에게 피해자의 쿠키정보가 전송될 수 있다.
  String name = request.getParameter("name");
%>
<p>Name:<%=name%></p>
</body>
</html>

<jsp:useBean id="m" scope="application" class="mypkg.MyLocales"/>
<p>Address: ${m.address}</p>
<%
  String name = request.getParameter(""name"");
  if ( name != null ) {
    // 스크립트 생성에 사용되는 문자열을 치환하여 입력값에 악성 코드가 포함되더라도 실행되지 않는다.
    name = name.replaceAll(""<"", ""&lt;"");
    name = name.replaceAll("">"", ""&gt;"");
    name = name.replaceAll(""&"", ""&amp;"");
    name = name.replaceAll(""\"""", ""&quot;"");
  }
  else { return; }
%>
<p>Name:<%=name%></p>

<!-- 방법 2: 출력값에 JSTL HTML 인코딩 -->
<p>Address:${fn:escapeXml(m.address)}</p>

<!-- 방법 3: 출력값에 JSTL Core 출력 포맷을 사용하여 텍스트로 처리 -->
<p>Address:<c:out value=""${m.address}""/></p>

// 방법 4: 외부 라이브러리를 활용하여 출력값에 필터링
// XssFilter 사용하는 방법
XssFilter filter = XssFilter.getInstance(""lucy-xss-superset.xml"");
Out.append(filter.doFilter(name));

// OWASP ESAPI(Enterprise Security API)를 사용하는 방법
<%
    name = ESAPI.encoder().encodeForHTML(name);
%>
<p>Name:<%=name%></p>