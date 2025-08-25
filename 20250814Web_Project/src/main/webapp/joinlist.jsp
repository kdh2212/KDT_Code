<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="navbar.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 & 부서 정보</title>
<style>
    body {
        font-family: sans-serif;
        padding: 20px;
    }

    table {
        width: 100%;
        max-width: 1000px;
        border-collapse: collapse;
        margin: 0;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
        font-size: 14px;
    }

    th {
        background-color: #f2f2f2;
    }

    h2 {
        text-align: left;
        margin-left: 20px;
    }
</style>
</head>
<body>
<table>
    <tr>
        <th>DEPTNO</th>
        <th>EMPNO</th>
        <th>ENAME</th>
        <th>JOB</th>
        <th>MGR</th>
        <th>HIREDATE</th>
        <th>SAL</th>
        <th>COMM</th>
        <th>DNAME</th>
        <th>LOC</th>
    </tr>

    <c:forEach var="joindto" items="${joinlist}">
        <tr>
            <td>${joindto.deptno}</td>
            <td>${joindto.empno}</td>
            <td>${joindto.ename}</td>
            <td>${joindto.job}</td>
            <td>${joindto.mgr}</td>
            <td>${joindto.hiredate}</td>
            <td>${joindto.sal}</td>
            <td>${joindto.comm}</td>
            <td>${joindto.dname}</td>
            <td>${joindto.loc}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>