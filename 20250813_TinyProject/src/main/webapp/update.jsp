<%@page import="dto.TinyDTO"%>
<%@page import="dao.TinyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String content = request.getParameter("content");
String num = request.getParameter("num");
TinyDAO dao = new TinyDAO();
//dao.updateOne(new TinyDTO(num,content));

response.sendRedirect("list.jsp");
%>
