<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is JSP Page</h1>
<!-- declaration tag -->
<%! String username="java";%>
<% 
out.print("Hello world");
%>
<!-- expression tag -->
<%= "This is expression tag" %>

<%= username%>
</body>
</html>