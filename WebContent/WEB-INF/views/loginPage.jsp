<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Flat HTML5/CSS3 Login Form</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
  
</head>
<body>
<!-- partial:index.partial.html -->
<div class="login-page">
  <div class="form">
    <form>
      <input type="text" placeholder="name" name="memberId"/>
      <input type="password" placeholder="password" name="passwd"/>
      <input type="text" placeholder="email address" name="email"/>
      <button>create</button>
      <p class="message">Already registered? <a href="${pageContext.request.contextPath}/login.do">Sign In</a></p>
    </form>
  </div>
</div>
<!-- partial -->
<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>


</body>
</html>
