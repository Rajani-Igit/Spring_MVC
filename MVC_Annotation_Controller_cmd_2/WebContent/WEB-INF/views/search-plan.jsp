<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="assets/js/app.js"></script>
</head>
<body>
<div class="container">
<h2 style="text-align:center">Search Plans</h2>
<form action="${pageContext.request.contextPath}/search-recharge.htm">
<div class="form-group">
<label>Plan name</label>
 <input class="form-control"  placeholder=" Enter Plan Name" type="text" name="planName">
</div>
<div class="form-group">
  <label >Select list:</label>
  <select class="form-control" name="planType">
    <option>Post paid</option>
    <option>Pre paid</option>
  </select>
</div>
<div class="form-group">
<label>Validity</label>
<input class="form-control" placeholder="Enter Validity Period" name="validity" type="text">
</div>

<div class="form-group">
<label>Recharge Amount</label>
<input class="form-control" placeholder="Enter Recharge Amount" name="amount" type="text">
</div>
<div class="form-group">
<input class="btn success" type="submit" value="Submit">

</form>
</div>
</body>
</html>