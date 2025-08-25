<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${fac = (n) -> n == 1 ? 1 : n * fac(n-1);'' }
${fac(5) }<br/>
${greaterThan = (x,y)-> (x > y) ? true : false;'' }
${greaterThan(10,30) }

</body>
</html>