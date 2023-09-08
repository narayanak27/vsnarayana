<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>

<head>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300&display=swap" rel="stylesheet" />
<link href="style.css" rel="stylesheet" />
<title>Login Form</title>

</head>

<body>
    <style>
        :root {
--green-color: #1abc9c;
--blue-color: rgb(57, 35, 252);
--light-gray: rgb(197, 197, 197);
}

* {
margin: 0;
padding: 0;
box-sizing: border-box;
}
body {
background-color: var(--green-color);
font-family: "Source Sans Pro", sans-serif;
}

.main-container {
position: absolute;
left: 50%;
top: 50%;
transform: translate(-50%, -50%);
background: white;
}

.container {
width: 400px;
height: 300px;
border-radius: 7px;
box-shadow: 0 6px 12px rgba(179, 179, 179, 0.7);
z-index: 1;
overflow: hidden;
}

form {
width: 100%;
height: 100%;
display: flex;
padding: 0px !important;
flex-direction: column;
align-items: center;
background-color: white;
justify-content: space-evenly;
}

a {
text-decoration: none;
cursor: pointer;
color: black;
}

a:focus,
a:hover {
color: var(--blue-color);
font-weight: bold;
}

.input {
position: relative;
}

.input input,
.login-btn {
width: 260px;
height: 45px;
outline: none;
padding: 0 0.7rem;
border-radius: 3px;
transition: 0.2s;
font-weight: bold;
z-index: 1;
}

.input input {
border: none;
border-bottom: 1px solid #8c8c8c;
}
.login-btn {
border: 1px solid #8c8c8c;
background: var(--green-color);
cursor: pointer;
font-size: 20px;
color: #fff;
text-transform: uppercase;
}

.login-btn:focus,
.login-btn:hover {
background: #fff;
cursor: pointer;
color: var(--green-color);
text-transform: uppercase;
border: 1px solid var(--green-color);
transition: ease-in-out 0.2s;
}

.input label {
position: absolute;
top: 28%;
left: 10px;
font-size: 0.9rem;
 transition: 0.2s; 
font-weight: bold;
padding: 0 0.1rem;
}

.input input:focus {
border-bottom: 1px solid var(--green-color);
}

.input input:focus ~ label,
.input input:valid ~ label {
transform: translateY(-25px);
font-size: 15px;
color: var(--green-color);
background: #fff;
}
    </style>
<div class="main-container">
<div class="container">
<div>
<form action="register.jsp">
<center>
<h1>USER LOGIN</h1>
</center>

<div class="input">
<input type="text" name="username" id="username" required
title="Please enter your Username here" />
<label for="username">Username</label>
</div>

<div class="input">
<input type="password" name="password" id="password" required
title="Please enter your Password here" />
<label for="username">Password</label>
</div>



<input type="submit" value="Login" class="login-btn" />

</form>
</div>
</div>
</div>
</body>

</html>