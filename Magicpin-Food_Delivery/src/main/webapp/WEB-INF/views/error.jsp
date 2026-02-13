<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #ffecd2, #fcb69f);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .error-container {
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
        text-align: center;
        max-width: 400px;
        width: 100%;
    }

    .error-container h2 {
        color: #e74c3c;
        margin-bottom: 15px;
    }

    .error-container h3 {
        color: #555;
        margin-bottom: 25px;
        font-weight: normal;
    }

    .home-link {
        text-decoration: none;
        background: #3498db;
        color: #ffffff;
        padding: 10px 18px;
        border-radius: 6px;
        font-size: 15px;
        transition: background 0.3s ease;
    }

    .home-link:hover {
        background: #217dbb;
    }
</style>

</head>
<body>

    <div class="error-container">
        <h2>⚠️ Oops! Something went wrong</h2>
        <h3>${errorMesg}</h3>
        <h3>${errorMesgage}</h3>
        <a class="home-link" href="index.jsp">🏠 Back to Home</a>
    </div>

</body>
</html>
