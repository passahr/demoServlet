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



    out.println("<p> Benvenuto " + nome +" "+cognome+ "</p>" + "<br/>" );
    out.println("<a href='/demo/connessi'> clicca qui per vedere tutti gli utenti che si sono connessi </a>");





    out.println("</body>");


    out.println("</html>");
  }
}
