//this servlet displays a message in the client
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();

    pw.println("<html><body>");
    pw.println("This is just a demo servlet");
    pw.println("</body></html>");

    pw.close();

  }
}
