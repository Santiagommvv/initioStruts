<%-- 
    Document   : saludador
    Created on : 14 mar. 2023, 19:07:21
    Author     : manitu
--%>

<!-- el uri va a ser buscado en la dependencia struts2-core-(version) -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP saluda con struts2</title>
    </head>
    <body>
        <!-- el atributo definido en InitioAction-->
        <h1><s:property value="saludosAtr"></s:property></h1>
    </body>
</html>
