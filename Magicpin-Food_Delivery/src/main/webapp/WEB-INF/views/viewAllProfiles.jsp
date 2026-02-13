<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.magicpin.profile.entity.ProfileEntity" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magicpin | All Profiles</title>

<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #43cea2, #185a9d);
        color: #333;
    }

    h2 {
        text-align: center;
        margin: 30px 0;
        color: #fff;
        text-shadow: 1px 1px 2px rgba(0,0,0,0.3);
    }

    table {
        border-collapse: collapse;
        width: 90%;
        margin: auto;
        background: #fff;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }

    th, td {
        padding: 12px 15px;
        text-align: center;
    }

    th {
        background-color: #2575fc;
        color: white;
        font-weight: bold;
    }

    tr:nth-child(even) {
        background-color: #f4f6f8;
    }

    tr:hover {
        background-color: #e0e7ff;
        transform: scale(1.01);
        transition: 0.2s;
    }

    a.btn {
        padding: 6px 12px;
        text-decoration: none;
        color: white;
        border-radius: 5px;
        font-size: 14px;
        font-weight: bold;
        transition: 0.3s;
    }

    .edit {
        background-color: #4CAF50;
    }

    .edit:hover {
        background-color: #45a049;
    }

    .delete {
        background-color: #f44336;
    }

    .delete:hover {
        background-color: #da190b;
    }

    .home-link {
        display: block;
        width: 120px;
        margin: 30px auto;
        padding: 12px;
        text-align: center;
        background-color: #2575fc;
        color: white;
        border-radius: 6px;
        text-decoration: none;
        font-weight: bold;
        transition: 0.3s;
    }

    .home-link:hover {
        background-color: #1a5fd0;
    }
</style>

</head>
<body>

<h2>📋 All Profiles</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

<%
    List<ProfileEntity> profiles =
        (List<ProfileEntity>) request.getAttribute("profiles");

    if (profiles != null && !profiles.isEmpty()) {
        for (ProfileEntity p : profiles) {
%>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getEmail() %></td>
        <td><%= p.getMobile() %></td>

        <!-- Edit Button -->
        <td>
            <a class="btn edit" href="editProfile/<%= p.getId() %>">
                ✏️ Edit
            </a>
        </td>

        <!-- Delete Button -->
        <td>
            <a class="btn delete"
               href="deleteProfile/<%= p.getId() %>"
               onclick="return confirm('Are you sure you want to delete this profile?');">
                🗑️ Delete
            </a>
        </td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="6">No profiles found</td>
    </tr>
<%
    }
%>
</table>

<a class="home-link" href="index.jsp">🏠 Home Page</a>

</body>
</html>
