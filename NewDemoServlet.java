//this servlet displays a new message in the client
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class NewDemoServlet extends HttpServlet
{
  public void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();

    pw.println("<html><body>");
    pw.println("This is just a new demo servlet");
    pw.println("</body></html>");

    pw.close();

  }
}
