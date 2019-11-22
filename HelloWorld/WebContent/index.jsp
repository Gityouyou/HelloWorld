<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>哈哈</title>
</head>
<body>

	<form action="helloServlet.action" method="post">
		<input type="text" name='username' placeholder="用户名"></input><br>
		<input type="password" name='pwd' placeholder="密码"></input><br> <input
			type="submit" value="登录"></input>
	</form>


	<a href='login.jsp'>登录</a>

	<a href='HelloWorld.jsp'>struct2</a>


	<h1>Hello World Struts2</h1>
	<form action="hello">
		<label for="name">Please enter your name</label><br />
		<input type="text" name="name" />
		<input type="submit" value="Say Hello"/>
	</form>

	<br>
	<br>

	<form action="something">
		<input type="submit" value="Something" />
	</form>


	<h1>文件上传</h1>
	<form action="upload" method="post" enctype="multipart/form-data">
		<label for="file">Upload your file</label> 
		<input type="file" name="file" /> 
		<input type="submit" value="Upload" />
	</form>
	
	<h1>数据库访问</h1>
	<form action="loginaction" method="post">
      User:<br/><input type="text" name="user"/><br/>
      Password:<br/><input type="password" name="password"/><br/>
      <input type="submit" value="Login"/>		
   </form>

</body>
</html>