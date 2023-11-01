<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
    <form action="/users/add" method="post">
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

        <input type="submit" value="Submit">
    </form>

    <form action="/users/edit" method="post">
        <label for="editId">ID to Edit:</label><br>
        <input type="text" id="editId" name="editId"><br>
        <input type="submit" value="Edit">
    </form>

    <form action="/users/delete" method="post">
        <label for="deleteId">ID to Delete:</label><br>
        <input type="text" id="deleteId" name="deleteId"><br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>


    <form action="your_delete_action_url" method="post">
        <label for="deleteId">ID to Delete:</label><br>
        <input type="text" id="deleteId" name="deleteId"><br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>
