
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class Implementing_Servlet_interface extends HttpServlet {

   private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException{
         this.config = config;
    }
   
    @Override
   public void service(ServletRequest request,ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       out.println("<h1>This is First Way to create Servlet</h1>"); 
        }
  @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig(){
        return config;
    }
    @Override
    public String getServletInfo(){
        return "Servlet By Impementing ServletInterface";
    }
 
  
    }
