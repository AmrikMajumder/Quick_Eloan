<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<h1>Customer Details</h1>
	<br/>
<table class="table table-bordered">

			<thead>
				<tr class="success">
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Phone Number</th>
					<th>Loan Type</th>
					<th>Loan Amount</th>
					<th>Annual Income</th>
					<th>Loan Status</th>
					<th>Status Approval</th>
					
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${custdetails}" var="cust">
					<tr class="success">
						<td>${cust.id}</td>
						<td>${cust.name}</td>
						<td>${cust.phone_no}</td>
						<td>${cust.loan_type}</td>
						<td>${cust.loan_amount}</td>
						<td>${cust.annual_income}</td>
						<td>${cust.loan_status}</td>
						<td>
							<a type="button" class="btn btn-primary" 
								href="/approve?id=${cust.id}">Approve</a>

							<a type="button" class="btn btn-warning" 
								href="/reject?id=${cust.id}">Reject</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		<p style="margin-left : 5.5cm;">
		<a class="btn btn-danger" href="/login" role="button">Log Out</a>
		<a class="btn btn-success" href="/admin" role="button">back</a>
			</p>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>