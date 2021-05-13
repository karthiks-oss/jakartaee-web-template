<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Test JSP</h1>
<center>
    <h1>Display Current Date & Time</h1>
</center>
<%
    Date date = new Date();
    out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
%>
</body>
</html>
