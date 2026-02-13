<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created | Magicpin</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #43cea2, #185a9d);
        font-family: Arial, sans-serif;
    }

    .card {
        background: white;
        padding: 35px 45px;
        border-radius: 12px;
        text-align: center;
        width: 420px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
    }

    h3 {
        color: #2e7d32;
        margin-bottom: 25px;
        font-size: 22px;
    }

    a {
        display: inline-block;
        text-decoration: none;
        padding: 12px 28px;
        background-color: #2575fc;
        color: white;
        border-radius: 6px;
        font-weight: bold;
        transition: 0.3s;
    }

    a:hover {
        background-color: #1a5fd0;
        transform: scale(1.05);
    }
</style>

</head>
<body>

<div class="card">
    <h3> Profile Created Successfully</h3>
    <a href="index.jsp">Go to Home</a>
</div>

</body>
</html>
