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
    <form action="<c:url value='/index.do'/>" class="register-form">
      <input type="text" placeholder="name"/>
      <input type="password" placeholder="password"/>
      <input type="text" placeholder="email address"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form class="login-form">
      <input type="text" placeholder="username" name="memberId"/>
      <input type="password" placeholder="password" name="passwd"/>
      <button>login</button>
      <p class="message">Not registered? <a href="${pageContext.request.contextPath}/loginPage.do ">Create an account</a></p>
    </form>
  </div>
</div>
<!-- partial -->
<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="${pageContext.request.contextPath}/resources/js/script.js"></script>

</body>
</html>
