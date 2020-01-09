import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
    //getting name and surname from request sent by Form
    String nome = req.getParameter("nome");
    String cognome = req.getParameter("cognome");

    Cookie cookies[] = req.getCookies();
    Cookie cookie = new Cookie(nome, cognome);
    res.addCookie(cookie);


    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title> Benvenuto </title>");
    out.println("</head>");

    out.println("<body>");

    out.println("<p> Benvenuto " + nome + "</p>" );
    if(cookies != null && cookies.length != 0)
    {
      out.println("<p>");
      for (int i= 0; i<cookies.length; i++)
      {
        out.println(nome+" "+cognome +" ha visitato questa pagina");
      }
      out.println("</p>");
    }
    out.println("<p> Benvenuto " + nome + "</p>" );





    out.println("</body>");


    out.println("</html>");
  }
}
