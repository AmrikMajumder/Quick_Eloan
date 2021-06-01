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
	<h1><font color="brown">Hello ${name} your Loan Status is ${status}</font></h1>

	</div>
	<div class="container">
	<h1>Customer Details</h1>
	<br/>
	<table class="table table-bordered">

			<thead>
				<tr>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Phone Number</th>
					<th>Loan Type</th>
					<th>Tenure</th>
					<th>Loan Amount</th>
					<th>Annual Income</th>
					<th>Application Date</th>
					
				</tr>
			</thead>
			<tbody>
			
				<tr>
					<td>${id}</td>
					<td>${name}</td>
					<td>${phone_no}</td>
					<td>${loan_type}</td>
					<td>${tenure}</td>
					<td>${amount}</td>
					<td>${income}</td>
					<td>${l_d}</td>
				</tr>
		</tbody>
	</table>
	<div class="container">
		<h3> Rate of Interest is: ${rate} %</h3>
		<h2>EMI should be paid: Rs ${emi} </h2>
		
	</div>
	</div>
	<div>
		<a class="btn btn-success" href="/payment" role="button">Pay EMI</a>
	</div>
	<div>
	<p style="margin-top : 1cm; margin-left : 5.7cm;">
	<a class="btn btn-danger" href="/login" role="button">Log Out</a>
			<a class="btn btn-success" href="/customer" role="button">back</a>
			</p>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>