<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center;">Test JSP</h1>
<div style="text-align: center;">
    <h2>Display Current Date & Time</h2>
</div>
<%
    Date date = new Date();
    out.print("<h3 align = \"center\">" + date + "</h3>");
%>
</body>
</html>
