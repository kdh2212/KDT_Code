<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="navbar.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록</title>
<style>
    /* 기존 스타일 유지 */
    body {
        font-family: sans-serif;
        padding: 20px;
    }

    table {
        width: 100%;
        max-width: 1000px;
        border-collapse: collapse;
        margin-bottom: 0px;
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

    a {
        color: #3498db;
        text-decoration: none;
    }

    /* 삭제 버튼만 작게 */
    .delete-btn {
        padding: 2px 6px;
        font-size: 12px;
        line-height: 1;
        background-color: #e74c3c;
        color: white;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    .delete-btn:hover {
        background-color: #c0392b;
    }

    .register-btn {
        padding: 6px 12px;
        background-color: #2ecc71;
        color: white;
        border: none;
        border-radius: 4px;
    }

    .register-btn:hover {
        background-color: #27ae60;
    }
</style>
</head>
<body>
<table>
    <tr>
        <th>EMPNO</th>
        <th>ENAME</th>
        <th>JOB</th>
        <th>MGR</th>
        <th>HIREDATE</th>
        <th>SAL</th>
        <th>COMM</th>
        <th>DEPTNO</th>
        <th>삭제</th>
    </tr>

    <c:forEach var="empdto" items="${emplist}">
        <tr>
            <td><a href="empupdateForm?empno=${empdto.empno}">${empdto.empno}</a></td>
            <td>${empdto.ename}</td>
            <td>${empdto.job}</td>
            <td>${empdto.mgr}</td>
            <td>${empdto.hiredate}</td>
            <td>${empdto.sal}</td>
            <td>${empdto.comm}</td>
            <td>${empdto.deptno}</td>
            <td>
                <button type="button" class="delete-btn"onclick="location.href='empdelete?empno=${empdto.empno}'">삭제</button>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- 등록 버튼 왼쪽 정렬 -->
<button type="button" class="register-btn" onclick="location.href='empinsertForm'">등록</button>

</body>
</html>