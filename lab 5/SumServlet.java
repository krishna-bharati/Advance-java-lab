
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Acer
 */
public class SumServlet extends HttpServlet {

 

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         int num = Integer.parseInt(request.getParameter("num"));
         int sum = 0;
         while(num>0){
             sum += num %10;
             num /=10;
         }
            out.println("<h1>Sum Of Individual:"+sum +"</h1>");
        
    }



}