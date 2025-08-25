<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="navbar.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 수정</title>
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

<form method="post" action="deptupdate">
    <input type="hidden" name="deptno" value="${deptdto.deptno}" />
    <table>
        <tr>
            <th>DEPTNO</th>
            <td><input type="text" name="deptno" value="${deptdto.deptno}" readonly></td>
        </tr>
        <tr>
            <th>DNAME</th>
            <td><input type="text" name="dname" value="${deptdto.dname}"></td>
        </tr>
        <tr>
            <th>LOC</th>
            <td><input type="text" name="loc" value="${deptdto.loc}"></td>
        </tr>
    </table>

    <div class="buttons">
        <input type="submit" value="저장">
        <input type="button" value="취소" onclick="history.back()">
    </div>
</form>

</body>
</html>