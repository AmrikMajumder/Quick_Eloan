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
<br/>
	<div class="container">
	<h1><font color="brown">Update your Loan Application</font></h1>
	<p>
			<font color="red">${errorMessage}</font>
		</p>
		
		<form action="${pageContext.request.contextPath}/updationsuccess" method="POST">
			<fieldset class="form-group">
				<label>Customer Id</label> <input name="id" type="text"
				class="form-control"  value="${id}" />
			</fieldset>
			<fieldset class="form-group">
				<label>Full Name</label> <input name="name" type="text"
					class="form-control" value="${name}"/>
			</fieldset>
			<fieldset class="form-group">
				<label>Date of Birth</label> <input name="dob" type="date"
					class="form-control" value="${dob}"/>
			</fieldset>
			<fieldset class="form-group">
				<label>Phone Number</label> <input name="phone" type="number"
					class="form-control" value="${phone_no}" />
			</fieldset>
			<fieldset class="form-group">
				<label>E-mail</label> <input name="mail" type="text"
					class="form-control" value="${e_mail}" />
			</fieldset>
			<fieldset class="form-group">
				<label  class="form-label">Type of Loan <i> (Home Loan, Personal Loan, Student Loan, Car Loan) </i> </label> <input name="loan_type" type="text"
						class="form-control" value="${loan_type}" />  
			</fieldset>
			<fieldset class="form-group">
				<label>Loan Amount</label> <input name="loan_amount" type="number"
					class="form-control" value="${amount}"  />
			</fieldset>
			<fieldset class="form-group">
				<label>Tenure <i>(in year)</i></label> <input name="tenure" type="number"
					class="form-control" value="${tenure}" />
			</fieldset>
			<fieldset class="form-group">
				<label>Annual Income</label> <input name="annual_income" type="number"
					class="form-control" value="${income}" />
			</fieldset>
			<fieldset class="form-group">
				<label>Aadhaar Number</label> <input name="aadhaar" type="number"
					class="form-control" value="${aadhaar}" />
			</fieldset>
			<fieldset class="form-group">
				<label>Pan Number</label> <input name="pan" type="text"
					class="form-control" value="${pan}" />
			</fieldset>
			
			
			<div class="col-12">
			  <div class="form-check">
			    
			      <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required>
			      <label class="form-check-label" for="invalidCheck3">
			        Agree to <a href="/bankpolicy" class="alert-link">terms and conditions</a>
			      </label>
			      
			      <div id="invalidCheck3Feedback" class="invalid-feedback">
			        You must agree before submitting.
			      </div>
			    </div>
			  </div>
			  <br/>
			  
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