<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book My Ride</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #74ebd5, #9face6);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .ride-form {
        background: #ffffff;
        padding: 30px 40px;
        width: 350px;
        border-radius: 10px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
    }

    .ride-form h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        font-weight: bold;
        display: block;
        margin-bottom: 6px;
        color: #555;
    }

    input[type="text"],
    select {
        width: 100%;
        padding: 10px;
        margin-bottom: 18px;
        border-radius: 5px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    input[type="text"]:focus,
    select:focus {
        outline: none;
        border-color: #6c63ff;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #6c63ff;
        color: white;
        font-size: 16px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-weight: bold;
        transition: background 0.3s;
    }

    .btn:hover {
        background: #554eea;
    }
</style>

</head>
<body>

    <form action="bookMyRide" method="post" class="ride-form">
        <h2>🚕 Book My Ride</h2>

        <label>Source</label>
        <input type="text" name="source" placeholder="Enter source location" required>

        <label>Destination</label>
        <input type="text" name="destination" placeholder="Enter destination" required>

        <label>Ride Type</label>
        <select name="type" id="type" required>
            <option value="">-- Select Vehicle --</option>
            <option value="bike">Bike</option>
            <option value="car">Car</option>
            <option value="auto">Auto</option>
        </select>

        <input type="submit" value="Book Ride" class="btn">
    </form>

</body>
</html>
