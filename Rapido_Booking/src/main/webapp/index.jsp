<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Booking</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #ffcc70, #ff8c42);
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        padding: 35px 45px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
        text-align: center;
        animation: fadeIn 0.7s ease-in-out;
    }

    .card h2 {
        margin-bottom: 20px;
        color: #333;
        font-size: 26px;
    }

    .card a {
        display: inline-block;
        padding: 12px 25px;
        background: #ff8c42;
        color: #ffffff;
        text-decoration: none;
        font-size: 16px;
        font-weight: bold;
        border-radius: 6px;
        transition: background 0.3s, transform 0.2s;
    }

    .card a:hover {
        background: #e6762f;
        transform: translateY(-2px);
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(10px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
</style>

</head>

<body>
    <div class="card">
        <h2>🚕 Rapido Booking</h2>
        <a href="viewBooking">Book Rapido Ride</a>
    </div>
</body>
</html>
