<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel= "stylesheet" href="/style.css"/>
</head>
<body class="repeat-form">
	<h1>Repeat Form</h1>
	<form action="/repeat-result">
		<p>Word:<input type="text" name = str></p>
		<p>Number of times to repeat:<input type="number" name = num></p>
		<button type="submit">Submit</button>
	</form>
</body>
</html>