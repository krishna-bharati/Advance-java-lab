import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {
    // Add doGet method to display the form when accessed via GET
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Employee Registration</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Employee Registration Form</h2>");
        out.println("<form action=\"InsertServlet\" method=\"POST\">");
        out.println("<div>");
        out.println("<label for=\"eid\">Employee ID:</label>");
        out.println("<input type=\"number\" id=\"eid\" name=\"eid\" required>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=\"name\">Name:</label>");
        out.println("<input type=\"text\" id=\"name\" name=\"name\" required>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=\"address\">Address:</label>");
        out.println("<input type=\"text\" id=\"address\" name=\"address\" required>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=\"salary\">Salary:</label>");
        out.println("<input type=\"number\" id=\"salary\" name=\"salary\" required>");
        out.println("</div>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        try {
            int eid = Integer.parseInt(req.getParameter("eid"));
            String name = req.getParameter("name");
            String address = req.getParameter("address");
            int salary = Integer.parseInt(req.getParameter("salary"));
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
            String sql = "INSERT INTO employee(eid,name,address,salary) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, eid);
            ps.setString(2, name); 
            ps.setString(3, address); 
            ps.setInt(4, salary);
            
            int row = ps.executeUpdate();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Result</title>");
            out.println("</head>");
            out.println("<body>");
            
            if(row > 0) {
                out.println("<h2>Employee Added Successfully!</h2>");
                out.println("<p>Employee ID: " + eid + "</p>");
                out.println("<p>Name: " + name + "</p>");
                out.println("<p>Address: " + address + "</p>");
                out.println("<p>Salary: " + salary + "</p>");
            } else {
                out.println("<h2>Error: Failed to insert employee data</h2>");
            }
            
            out.println("<div><a href=\"InsertServlet\">Add Another Employee</a></div>");
            out.println("</body>");
            out.println("</html>");
            
            // Close resources
            ps.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Error</title></head>");
            out.println("<body>");
            out.println("<h2>Error Processing Request</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
            out.println("<div><a href=\"InsertServlet\">Try Again</a></div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}