<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>


<div class="login">
    <div class="top">登录</div>
    <div class="content">
        <form action="loginServlet.do" method="post">
            <input type="text" name="username" placeholder="用户名" class="username">
            <input type="password" name="password" placeholder="密码" class="pwd">
            <div class="remember_pwd">
                <input id="checkbox" type="checkbox" name="check" value="1">
                <label for="checkbox">下次自动登录</label>
            </div>
            <input type="submit" value="登录" class="submit">
        </form>
    </div>
</div>

</body>
</html>