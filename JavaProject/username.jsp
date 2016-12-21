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
 </div>
 
 <div class="col-md-8">
 </div>
  <div class="col-md-8">
  <div id="box">
  <div id="xyz">
  
 <label><font size="5">Facebook Login</font></label><hr>
 </div>
 <div class="row">
 <div class="col-md-2"></div>
 <div class=" col-md-3">
<label>Email or Phone</label></div>
 <div class=" col-md-7" >
<input type="text" name="email" style="border-color: red"  size="45" data-toggle="tooltip" data-placement="top" title="The email address thar you've entered doesnn't match any Sign up for an Account">
<span class="glyphicon glyphicon-warning-sign" style="color: red; right:25px;" >
</span>
 </div>
 </div><br>
 

  <div class="row">
 <div class=" col-md-2"></div>
 <div class=" col-md-3">
 <label>Password:</label></div>
 <div class=" col-md-7">
<input type="password" name="password" size="45"></div>
  </div> <br><br>
 <div class="row">
 <div class=" col-md-5"></div>
 <div class=" col-md-6">
<input type="checkbox">Keep me logged in</div>
 </div><br>
  <div class="row">
 <div class=" col-md-5"></div>
 <div class=" col-md-6">
 <input type="submit" class=" btn btn-primary" value="Login" > or 
 <a href="home.jsp"> Sign up for Facebook</a></div>
 </div><br>
 <div class="row">
 <div class=" col-md-5"></div>
 <div class=" col-md-6">
 <a href=""> Forgotten Password??</a></div>
 
 </div>
 </div>
 </div>
 
</form>
</body>
</html>