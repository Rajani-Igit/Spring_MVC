<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Form control: input</h2>
 
  <form action="${pageContext.request.contextPath}/getProduct.mvc">
    <div class="form-group">
      <label for="usr">Product Name:</label>
      <input type="text" class="form-control" name="usrname">
    </div>
    <div class="form-group">
      <label for="pwd">Product Brand:</label>
      <input type="password" class="form-control" name="brandname">
    </div>
    <div class="form-group">
      <label for="pwd">Price:</label>
      <input type="password" class="form-control" name="price">
    </div>
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
  </form>
</div>
</body>
</html>