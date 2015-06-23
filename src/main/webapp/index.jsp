<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
<%
Enumeration enumeration =  session.getAttributeNames();
while(enumeration.hasMoreElements()) {
	String key = (String) enumeration.nextElement();
	System.out.println(key+":"+session.getAttribute(key));
}
%>
