<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>product form</h1> <hr/>
<jsp:include page="menu.jsp"/>
<br/>
<form method="post" action="./findProduct">

Product ID: <input name="id"/> <br/>

<button>Find</button>
</form>

</body>
</html>