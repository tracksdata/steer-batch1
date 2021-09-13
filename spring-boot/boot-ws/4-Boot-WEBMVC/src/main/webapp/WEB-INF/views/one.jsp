<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function validateFields(){
	
	let d1=document.getElementById("t1");
	if(d1.value.length===0){
		//alert("Name must not blank")
		document.getElementById("f1Error").innerHTML="Name must not be Blank";
	}else{
		document.getElementById("f1Error").innerHTML="";
	}
	
}

</script>
</head>
<body>

	<h1>Welcome to one.jsp - v1</h1>
	<h2>Hello ${ename}</h2>
	<input type="text" id="t1" onKeyUp="validateFields()" />
	<span id="f1Error"></span>

</body>
</html>