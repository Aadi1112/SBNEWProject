<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Student</title>
</head>
<body>

<h2>Add a New Student</h2>

<!-- Form for adding a student -->
<form action="add" method="POST">
    <label for="id">Student ID:</label>
    <input type="text" id="id" name="id" required><br><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="marks">Marks:</label>
    <input type="number" id="marks" name="marks" required><br><br>

    <input type="submit" value="Add Student">
</form>

</body>
</html>
