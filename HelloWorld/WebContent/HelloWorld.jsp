<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>structs使用</title>
</head>
<body>

	Hello world, <s:property value="name"/>
    <!-- 使用 <s:property value="name"/>要加下面这句话 -->
<%-- <%@ taglib prefix="s" uri="/struts-tags"%>   --%>


<%-- “HelloWorld.jsp”页面是“HelloWorldAction”动作返回一个成功的结果页面。
如果指定了<s:property value=”name” />在“HelloWorld.jsp”页面，默认为当前的Action类“HelloWorldAction.getName()”属性。 --%>




</body>
</html>