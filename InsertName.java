import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class InsertName extends HttpServlet
{
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title> Form </title>");
    out.println("</head>");

    out.println("<body>");
    out.println("<form action='/demo/welcome' method='post'>");
    out.println("<input type='text' name='nome'> </input>");
    out.println("<input type='text' name='cognome'> </input>");
    out.println("<input type='submit' value='Clicca qui coglione'>");
    out.println("</form>");
    out.println("</body>");


    out.println("</html>");
  }
}
