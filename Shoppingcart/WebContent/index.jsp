<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
    overflow: hidden;
    background-color: white;
    font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: black;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: blue;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}




</style>
</head>
<body>
<marquee><h1>Boxadd.com</h1></marquee>

<a href=Login.html><h4>SignIn&SignUp</h4></a>

<a href=Logout.jsp><h4>Logout.</h4></a>
 <form class="example" action="search.jsp">
  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
 
<div class="navbar">
  <a href="#home">Home</a>
  
  <div class="dropdown">
    <button class="dropbtn">Kids
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href=toys.jsp>Toys</a>
      <a href="#">Kids Clothings</a>
      <a href="#">Kids Footwear</a>
    </div>
  </div> 
  
  <div class="dropdown">
    <button class="dropbtn">Mens wear
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">TopWear</a>
      <a href="#">BottomWear</a>
      <a href="#">FootWear</a>
    </div>
  </div> 
  
  <div class="dropdown">
    <button class="dropbtn">Womens wear
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">FasionWear</a>
      <a href="#">WestornWear</a>
      <a href="#">FootWear</a>
    </div>
  </div> 
  
  <div class="dropdown">
    <button class="dropbtn">Electronics
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Mobailes</a>
      <a href="#">Laptop</a>
      <a href="#">Televison</a>
    </div>
  </div> 
  
  
</div>

<h3>  </h3>
<img src=images/abc.jpg>


</body>
</html>
