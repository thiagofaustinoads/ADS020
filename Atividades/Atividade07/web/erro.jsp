<%-- 
    Document   : erro
    Created on : 20/04/2020, 13:27:47
    Author     : thiag
--%>
<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deu Ruim!</h1>
        <p>Mensagem do erro: <%=exception.getMessage()%></p>
    </body>
</html>
