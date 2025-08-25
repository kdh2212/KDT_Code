<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="navbar.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 입력</title>
<style>
    body {
        font-family: sans-serif;
        margin: 20px;
    }

    table {
        width: 400px;
        border-collapse: collapse;
        margin: 0;
    }

    th, td {
        padding: 6px 8px;
        text-align: left;
    }

    input[type="text"], input[type="date"] {
        width: 100%;
        padding: 6px;
        box-sizing: border-box;
    }

    .buttons {
        margin-top: 15px;
        text-align: left;
    }

    input[type="submit"], input[type="button"] {
        padding: 6px 12px;
        margin-right: 10px;
    }
</style>
</head>
<body>

<form method="post" action="empinsert">
    <table>
        <tr><th>EMPNO</th>   <td><input type="text" name="empno"></td></tr>
        <tr><th>ENAME</th>   <td><input type="text" name="ename"></td></tr>
        <tr><th>JOB</th>     <td><input type="text" name="job"></td></tr>
        <tr><th>MGR</th>     <td><input type="text" name="mgr"></td></tr>
        <tr><th>HIREDATE</th><td><input type="date" name="hiredate"></td></tr>
        <tr><th>SAL</th>     <td><input type="text" name="sal"></td></tr>
        <tr><th>COMM</th>    <td><input type="text" name="comm"></td></tr>
        <tr><th>DEPTNO</th>  <td><input type="text" name="deptno"></td></tr>
    </table>

    <div class="buttons">
        <input type="submit" value="저장">
        <input type="button" value="취소" onclick="history.back()">
    </div>
</form>

</body>
</html>