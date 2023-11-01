<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>
    <form action="/users/update" method="post">
        <label for="id">ID:</label><br>
        <input type="text" id="id" name="id"><br>
        
        <label for="firstname">First Name:</label><br>
        <input type="text" id="firstname" name="firstname"><br>

        <label for="lastname">Last Name:</label><br>
        <input type="text" id="lastname" name="lastname"><br>

        <label for="age">Age:</label><br>
        <input type="text" id="age" name="age"><br>

        <label for="town">Town:</label><br>
        <input type="text" id="town" name="town"><br>

        <label for="gender">Gender:</label><br>
        <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br>

        <input type="submit" value="Update">
    </form>
</body>
</html>
