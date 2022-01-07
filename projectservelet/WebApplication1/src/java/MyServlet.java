import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALFA SHERIA
 */
public class MyServlet extends HttpServlet {
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String empid =request.getParameter("empid");
        String empname =request.getParameter("empname");
        String DOB =request.getParameter("DOB");
        String date_of_joining =request.getParameter("dateofjoining");
        String designation =request.getParameter("designation");
        
        out.print("Employee details:" + empid 
                +" "+ empname +" "+ DOB +" "+" " +date_of_joining+" " + designation+" ");
    }
    }

    
