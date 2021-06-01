<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Easy Loan</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
    crossorigin="anonymous">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ekko-lightbox/5.3.0/ekko-lightbox.css" />
  <link rel="stylesheet" href="./css/style.css">
</head>
<body style="background-color:powderblue;">
<nav role="navigation" class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
	<i><font color="red"><b>E-Loan Corner</b></font></i>
	 <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarmenu">
      <span class="navbar-toggler-icon"></span>
    </button>

	<div class="collapse navbar-collapse" id="navbarmenu">

      <ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link active" href="/login">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/bankpolicy">Bank Policy for Loan Approval</a></li>
		</ul>
	</div>
</div>
</nav>
	<div class="container">
	<h1><font color="brown">Register your Loan Application</font></h1>
	<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form action="/Customer-register" method="POST">
			<fieldset class="form-group">
				<label>Name</label> <input name="name" type="text"
					class="form-control" required />
			</fieldset>
			<fieldset class="form-group">
				<label>Phone Number</label> <input name="phone" type="number"
					class="form-control" required />
			</fieldset>
			<fieldset class="form-group">
				<label>Gender</label> <div class="col-md-6">
				  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
				  <label class="form-control" for="flexRadioDefault1">
				    Female
				  </label>
				  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
				  <label class="form-control" for="flexRadioDefault2">
				    Male
				  </label>
				</div>
			</fieldset>
			<fieldset class="form-group">
				<label>Date of Birth</label> <input name="dob" type="date"
					class="form-control" required/>
			</fieldset>
			<fieldset class="form-group">
				<label>State</label> <input name="state" type="text"
					class="form-control" required />
			</fieldset>
			<fieldset class="form-group">
				<label>Occupation</label> <input name="occupation" type="text"
					class="form-control" required />
			</fieldset>
			<fieldset class="form-group">
				<label>E-mail</label> <input name="mail" type="text"
					class="form-control" required />
			</fieldset>
			<fieldset class="form-group">
				<label>Password</label> <input name="password" type="password"
					class="form-control" required />
			</fieldset>
			
			<button type="submit" class="btn btn-success">Submit</button>
			<button type="reset" class="btn btn-success">Reset</button><br>
		<p style="margin-top : 1cm;">
			<a class="btn btn-success" href="/login" role="button">back</a>
			</p>
		</form>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>