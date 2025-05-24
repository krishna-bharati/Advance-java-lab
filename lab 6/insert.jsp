<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert Display Page</title>
</head>
<body>
<fieldset>
    <h1>Employee Information</h1>
    <form action="" method="POST">
        <legend>Id:</legend>
        <input type="number" name="eid" required><br><br>
        <legend>Name: </legend>
        <input type="text" name="name" required><br><br>
        <legend>Address:</legend>
        <input type="text" name="address" required><br><br>
        <legend>Salary: </legend>
        <input type="number" name="salary" required><br><br>
        <input type="submit" name="submit" value="Submit">
    </form>
</fieldset>

<%
    if (request.getParameter("submit") != null) {
        try {
            int eid = Integer.parseInt(request.getParameter("eid"));
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            int salary = Integer.parseInt(request.getParameter("salary"));

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
            String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, eid);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setInt(4, salary);

            int row = ps.executeUpdate();
            if (row > 0) {
                String sql2 = "SELECT * FROM employee";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ResultSet row2 = ps2.executeQuery();

                out.println("<h2>Employee Records:</h2>");
                out.println("<table border='1'><tr><th>EID</th><th>Name</th><th>Address</th><th>Salary</th></tr>");
                while (row2.next()) {
                    out.println("<tr>");
                    out.println("<td>" + row2.getInt("eid") + "</td>");
                    out.println("<td>" + row2.getString("name") + "</td>");
                    out.println("<td>" + row2.getString("address") + "</td>");
                    out.println("<td>" + row2.getInt("salary") + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } else {
                out.println("<p style='color:red;'>Error inserting employee record.</p>");
            }

        } catch (NumberFormatException nfe) {
            out.println("<p style='color:red;'>Please enter valid numbers for ID and Salary.</p>");
        } catch (Exception e) {
            e.printStackTrace(new java.io.PrintWriter(out)); // ? Fixed
        }
    }
%>
</body>
</html>
