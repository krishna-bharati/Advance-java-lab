<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update and Delete Employee</title>
</head>
<body>
    <h2>Employee Update and Delete</h2>

    <%
        try {
            String idStr = request.getParameter("eid");
            if (idStr != null) {
                int id = Integer.parseInt(idStr);
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");

                    String sql = "SELECT * FROM employee WHERE eid=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        String empName = rs.getString("name");
                        String empAddress = rs.getString("address");
                        float salary = rs.getFloat("salary");

                        out.println("<h3>Employee Details:</h3>");
                        out.println("<p>ID: " + id + "</p>");
                        out.println("<p>Name: " + empName + "</p>");
                        out.println("<p>Address: " + empAddress + "</p>");
                        out.println("<p>Salary: " + salary + "</p><br>");

                        if (request.getParameter("d") != null) {
                            // Deletion
                            if (salary < 5000) {
                                sql = "DELETE FROM employee WHERE eid=?";
                                ps = conn.prepareStatement(sql);
                                ps.setInt(1, id);
                                int row = ps.executeUpdate(); 
                                if (row > 0) {
                                    out.println("<p>Employee Deleted Successfully.</p>");
                                } else {
                                    out.println("<p>Error deleting employee.</p>");
                                }
                            } else {
                                out.println("<p>You Cannot Delete  Salary more then 5000.</p>");
                            }
                        } else if (
                            request.getParameter("name") != null &&
                            request.getParameter("address") != null &&
                            request.getParameter("salary") != null) {

                            String newName = request.getParameter("name");
                            String newAddress = request.getParameter("address");
                            float newSalary = Float.parseFloat(request.getParameter("salary"));

                            if (salary < 5000) {
                                sql = "UPDATE employee SET name=?, address=?, salary=? WHERE eid=?";
                                ps = conn.prepareStatement(sql);
                                ps.setString(1, newName);
                                ps.setString(2, newAddress);
                                ps.setFloat(3, newSalary);
                                ps.setInt(4, id);
                                int row = ps.executeUpdate();

                                if (row > 0) {
                                    out.println("<p>Employee Updated Successfully.</p>");
                                } else {
                                    out.println("<p>Error updating employee.</p>");
                                }
                            } else {
                                out.println("<p>You Cannot Update Salary more then 5000.</p>");
                            }
                    } else {
                        out.println("<p>No employee found with ID " + id + "</p>");
                    }
                }
            }
        } catch (Exception ex) {
            out.println("<p>Error: " + ex.getMessage() + "</p>");
        }
    %>

    <button onclick="updateUser();">Update Employee</button>
    <button onclick="deleteUser();">Delete Employee</button>

    <script>
        function updateUser() {
            let id = prompt("Enter the Employee ID:");
            if (!id) return;

            let name = prompt("Enter the Name:");
            if (!name) return;

            let address = prompt("Enter the Address:");
            if (!address) return;

            let salary = prompt("Enter the Salary:");
            if (!salary) return;

            if (confirm("Do you want to update ID " + id + "?")) {
                window.location.href = "update.jsp?eid=" + id + "&name=" + encodeURIComponent(name)
                    + "&address=" + encodeURIComponent(address) + "&salary=" + encodeURIComponent(salary);
            }
        }

        function deleteUser() {
            let id = prompt("Enter the Id delete:");
            if (!id) return;

            if (confirm("Do you want to delete  ID " + id + "?")) {
                window.location.href = "update.jsp?eid=" + id + "&d=delete";
            }
        }
    </script>
</body>
</html>





