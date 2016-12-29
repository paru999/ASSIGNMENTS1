<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">
</script>
<!-- <script src="javascript/facebook.js"> -->
<script src="javascript/jsajx.js">
</script>
<link href="css/facebook.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">



</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="abcd">
<div class="container-fluid">

	 	<div id="background">
	 	
			<div class="row">
			<div class="col-md-1"> </div>
			<div class="col-md-2">
			<font color="#ffffff" size="10" face="verdana"> Facebook</font>
			</div>
			<div class="col-md-4"> </div>
			<div class="col-md-1">
			<label  for="email"><font color="white">Email</font></label>
			</div>
			<div class="col-md-1"></div>
			<div class="col-md-2">
			<label for="pwd"><font color="white">Password</font></label><br>
			</div>
			</div>
			<div class="row">
			<div class="col-md-7"> </div>
			<div class="col-md-2">
			<input  type="text" id="email" name="email" data-toggle="tooltip" data-placement="top" title="Email"  style="position: absolute;margin-top:-30px;"><label id="lblemail"></label>
			<input type="checkbox"><a href="#"  >Keep Me logged in</a>
			</div>
			<div class="col-md-2">
			<input type="password"  id="pwd" name="password" data-toggle="tooltip" data-placement="top" title="Password" style="position: absolute;margin-top:-30px;">
			<a href="#" >Forgotten password</a>
	 			</div>
	 		<button type="button" class="btn btn-primary" id="btnlogin" style="position: absolute;margin-top:-35px;margin-left: -35px;">Login</button><br>
	 			</div>
	 			</div>
	 			
	 		
<class="row">
		<div  class="col-xs-12 col-md-6 col-lg-2">
		 	<div id="img">
		 		<h2>Connect with friends and the world around you on <br>facebook</h2><br> 
    			<img src="image/fbb.jpg" height="50%" width="90%">
   			 </div>
    	</div>
    </div>
		
		
			<div class="row">
				<div  class="col-xs-12 col-md-6 col-lg-2">
		 			<div id="regform">
   						<b><font size="6">Create an account </font><br></b><br>
   						<b><font size="4">It's free and always will be</font><br></b><br>
						 <label id="fname" class="uname"></label><input type="text" id="uname" placeholder="First Name" size="20" maxlength="10" name="firstnane" >
						  
						 <input type="text" id="lname" placeholder="Last Name" size="20" maxlength="10" name="lastname"><br><br>
						 <label id="laname" class="lalname"></label>
						 <label id="pheno" class="ph"></label><input type="text" id="number" placeholder="Mobile Number" size="47" maxlength="10" name="phno" ><br><br>
						 <label id="ema" class="e"></label><input type="text" id="mail" placeholder="Email" size="47" maxlength="30"  name="mail"><br><br>
						 <label id="paswd" class="pa"></label><input type="password" id="psw" placeholder="Password" size="47" maxlength="10" name="pass">
						 <h2>Birthday</h2><label id="dys" class="dys"></label><br>
						
						<select id="Day" name="dy">
							   <option value="">Date</option>
						        <option value="sun">Sunday</option>
						        <option value="mon">Monday</option>
						        <option value="tue">Tuesday</option>
						        <option value="wed">Wednesday</option>
						        <option value="thu">Thursday</option>
						        <option value="fri">Friday</option>
						        <option value="sat">Saturday</option>
						    </select>
						      <select id="Month" name="mn">
						        <option value="">Month</option>
						        <option value="jan">Jan</option>
						        <option value="feb">feb</option>
						        <option value="march">March</option>
						        <option value="april">april</option>
						        <option value="may">may</option>
						        <option value="june">june</option>
						        <option value="july">july</option>
						    </select>
						      <select id="Year" name="yr">
						        <option value="">Year</option>
						        <option value="90">1990</option>
						        <option value="91">1991</option>
						        <option value="92">1992</option>
						        <option value="93">1993</option>
						        <option value="94">1994</option>
						        <option value="89">1989</option>
						        <option value="88">1988</option>
						    </select>
						    <font size="2" color="blue">Why do I need to provide my date of birth</font> <br>
							<input type="Radio" id="gender" value="female"> Female
							<input type="Radio" id="gender" value="male"> Male <label id="fm" class="fm"></label> <br>
							<font size="2" color="grey">By Clicking Create an account,you agree to our <a href="#">Terms </a> </font>
							<font size="2" color="grey">and that you have read our <a href="#"> Data Policy</a>,including our cookie use</font> <br>
							<hr>
							<input type="button"   value="Create an account" id="account" align="center" style="color:white; background-color:green;button-radius:6px"></td>		
						</div>
					</div>
				</div>
</body>
</html>