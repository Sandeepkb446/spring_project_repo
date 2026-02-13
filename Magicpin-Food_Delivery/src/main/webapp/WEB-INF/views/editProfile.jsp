<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile | Magicpin</title>

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
        padding: 35px 45px;
        border-radius: 12px;
        width: 420px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
        color: #444;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        margin-bottom: 18px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        background-color: #2575fc;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #1a5fd0;
        transform: scale(1.03);
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
    <h2>✏️ Edit Profile</h2>

    <form action="<%= request.getContextPath() %>/updateProfile" method="post">

        <!-- Hidden ID -->
        <input type="hidden" name="id" value="${entity.id}" />

        <label>Name</label>
        <input type="text" name="name" value="${entity.name}" />

        <label>Email</label>
        <input type="text" name="email" value="${entity.email}" />

        <label>Mobile</label>
        <input type="text" name="mobile" value="${entity.mobile}" />

        <input type="submit" value="Update Profile" />
    </form>
    <a href="../index.jsp" class="btn back-btn"> Back to Home</a>
</div>

</body>
</html>
