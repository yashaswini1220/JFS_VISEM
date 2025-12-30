<%@ page import="java.util.*, com.skillnext.*, com.skillnext.StudentDAO" %>
<html>
<head>
    <title>View Students</title>
</head>
<body>
<center>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Semester</th>
            <th>Department</th>
        </tr>

        <%
            StudentDAO dao = new StudentDAO();
            List<Student> students = dao.getAllStudents();
            for(Student s : students){
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getSem() %></td>
            <td><%= s.getDepartment() %></td>
        </tr>
        <% } %>
    </table>
</center>
</body>
</html>
