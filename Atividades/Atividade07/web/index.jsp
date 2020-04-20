<%-- 
    Document   : index
    Created on : 20/04/2020, 13:17:19
    Author     : thiag
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="cabecalho.jsp"%>
<%@include file="rodape.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%String msg = "Olá Mundo!";%>
        <h1><%=msg%></h1>
        <p><%= new Date()%></p>

        <%int x = 12 / 1;%>

        <jsp:useBean id="aluno" class="beans.Aluno"/>

        <jsp:setProperty name="aluno" property="matricula" value="2016100"/>
        <jsp:setProperty name="aluno" property="nome" value="JOSE"/>
        
        
        </body>
    </html>
