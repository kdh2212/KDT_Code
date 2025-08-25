<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="navbar.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 목록</title>
<style>
    body {
        font-family: sans-serif;
        padding: 20px;
    }

    table {
        width: 100%;
        max-width: 800px;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    th, td {
        border: 1px solid #ccc;
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

    .delete-btn {
        padding: 2px 6px;
        font-size: 12px;
        background-color: #e74c3c;
        color: white;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    .delete-btn:hover {
        background-color: #c0392b;
    }

    .insert-btn {
        padding: 6px 12px;
        background-color: #2ecc71;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    .insert-btn:hover {
        background-color: #27ae60;
    }
</style>
</head>
<body>
<table>
    <tr>
        <th>DEPTNO</th>
        <th>DNAME</th>
        <th>LOC</th>
        <th>삭제</th>
    </tr>

    <c:forEach var="deptdto" items="${deptlist}">
        <tr>
            <td><a href="deptupdateForm?deptno=${deptdto.deptno}">${deptdto.deptno}</a></td>
            <td>${deptdto.dname}</td>
            <td>${deptdto.loc}</td>
            <td>
                <button type="button" class="delete-btn" 
                        onclick="location.href='deptdelete?deptno=${deptdto.deptno}'">삭제</button>
            </td>
        </tr>
    </c:forEach>
</table>

<button type="button" class="insert-btn" onclick="location.href='deptinsertForm'">글쓰기</button>

</body>
</html>