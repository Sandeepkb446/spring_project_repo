<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magicpin | Create Profile</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        font-family: Arial, sans-serif;
    }

    .card {
        background: #ffffff;
        padding: 40px 50px;
        border-radius: 12px;
        width: 400px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
        text-align: center;
    }

    h2 {
        margin-bottom: 25px;
        color: #333;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 12px 0;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    button {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        background-color: #28a745;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 15px;
    }

    button:hover {
        background-color: #218838;
        transform: scale(1.03);
    }

    label {
        display: block;
        text-align: left;
        font-weight: bold;
        color: #444;
        margin-top: 10px;
    }
    .btn {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 15px;
        text-decoration: none;
        display: inline-block;
        text-align: center;
    }
    
    .back-btn {
        background-color: #2575fc;
    }
    .back-btn:hover {
        background-color: #1a5fd0;
        transform: scale(1.03);
    }
</style>

</head>
<body>

<div class="card">
    <h2>➕ Create Profile</h2>

    <form action="register" method="post">
        <label>Name</label>
        <input type="text" name="name" placeholder="Enter Your Name" required />

        <label>Email</label>
        <input type="text" name="email" placeholder="Enter Your Email" required />

        <label>Mobile</label>
        <input type="text" name="mobile" placeholder="Enter Your Mobile" required />

        <button type="submit" >Create</button>
    </form>
    <a href="./index.jsp" class="btn back-btn"> Back to Home</a>
</div>

</body>
</html>
