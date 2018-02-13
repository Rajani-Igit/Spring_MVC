<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Products</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Product Details</h1>
 <table class="table table-bordered">
    <thead>
      <tr>
        <th>ProductId</th>
        <th>Product Name</th>
        <th>Product Catagory</th>
        <th>Product Brand</th>
           <th>Product Price</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="iteam">
    <tr>
    <td>${iteam.product_id}</td>
     <td>${iteam.product_name}</td>
      <td>${iteam.product_category}</td>
       <td>${iteam.product_brand}</td>
        <td>${iteam.product_price}</td>
    </tr>
    </c:forEach>
     </tbody>
  </table>
</body>
</html>