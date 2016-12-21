<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">
</script>
<script src="javascript/facebook.js">
</script>
<link href="css/facebook.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="abcd">
<div id="background">
<form action="submit.jsp">
<div class="row">
 <div class="col-md-2">
 </div>
 
 <div>
 <font color="#ffffff" size="10" face="verdana"> Facebook</font> 
 <input type="button" id="sup" class="btn btn-success" value="SignUp">
 </div>
 </div>
 </div>
 
 <div class="row">
  <div class="col-md-8">
 </div>
  <div class="col-md-8">
  <div id="box">
  <div id="xyz">
  <label><font size="5">Facebook Login</font></label><hr>
 </div>
 
 <div class="row">
 <div class="col-md-2"></div>
 <div class=" col-md-2">
<label>Login as:</label></div>
<div class=" col-md-5" >
<img src="akh.jpg" width= "20%"><br>
<input type="hidden" name="email" value="akhila" >
</div>
<div class=" col-md-2">
<label style="margin-left:-230px">Haris NP</label><br>
<label style="margin-left:-230px">Haris.np@gmail.com</label></div>
</div>
<div class="row">
 <div class=" col-md-2"></div>
 <div class=" col-md-2"><br>
 <label>Password:</label></div>
 <div class=" col-md-5">
 <div>Not Haris?</div>
<input type="password" name="password" size="45" data-toggle="tooltip" data-placement="top" title="The Password you've entered incorrect Forgotten Password"></div>
  </div> <br><br>
  
 <div class="row">
 <div class=" col-md-4"></div>
 <div class=" col-md-5">
<input type="checkbox">Keep me logged in</div>
 </div><br>
 
  <div class="row">
 <div class=" col-md-4"></div>
 <div class=" col-md-5">
 <input type="submit" class=" btn btn-primary" value="Login" > or 
 <a href="home.jsp"> Sign up for Facebook</a></div>
 </div><br>
 
 <div class="row">
 <div class=" col-md-4"></div>
 <div class=" col-md-5">
 <a href=""> Forgotten Password??</a></div>
 </div>
 </div>
 
 </div>
 </div>
 </form>
</body>
</html>