<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ride Confirmed</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #43cea2, #185a9d);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .confirmation-box {
        background: #ffffff;
        padding: 35px 45px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
        animation: pop 0.5s ease-in-out;
    }

    .confirmation-box h3 {
        color: #2e7d32;
        font-size: 24px;
        margin-bottom: 15px;
    }

    .confirmation-box p {
        color: #555;
        font-size: 15px;
        margin-bottom: 25px;
    }

    .checkmark {
        font-size: 50px;
        color: #2e7d32;
        margin-bottom: 15px;
    }

    .btn {
        padding: 10px 20px;
        background: #6c63ff;
        color: #ffffff;
        border: none;
        border-radius: 5px;
        text-decoration: none;
        font-weight: bold;
        transition: background 0.3s;
    }

    .btn:hover {
        background: #554eea;
    }

    @keyframes pop {
        0% { transform: scale(0.8); opacity: 0; }
        100% { transform: scale(1); opacity: 1; }
    }
</style>

</head>
<body>

    <div class="confirmation-box">
        <div class="checkmark">✔</div>
        <h3>Ride Confirmed Successfully!</h3>
        <p>Your ride has been booked. Have a safe and pleasant journey.</p>
        <a href="index.jsp" class="btn">Book Another Ride</a>
    </div>

</body>
</html>
