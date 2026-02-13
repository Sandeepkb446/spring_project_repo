<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magicpin | Home</title>

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

    .container {
        background: white;
        padding: 40px;
        border-radius: 12px;
        text-align: center;
        width: 350px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
    }

    h2 {
        margin-bottom: 30px;
        color: #333;
    }

    a {
        display: block;
        text-decoration: none;
        padding: 12px;
        margin: 12px 0;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
        color: white;
        transition: 0.3s;
    }

    .create {
        background-color: #28a745;
    }

    .view {
        background-color: #007bff;
    }

    a:hover {
        opacity: 0.85;
        transform: scale(1.03);
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome to <span style="color:#2575fc;">Magicpin</span></h2>

    <a class="create" href="createAcc"> Create Account</a>
    <a class="view" href="viewAllProfiles"> View All Profiles</a>
</div>

</body>
</html>
