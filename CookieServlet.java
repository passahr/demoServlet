import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

			Cookie cookies[]= req.getCookies();

			resp.setContentType("text/html");
			PrintWriter out= resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Benvenuto </title>");
			out.println("</head>");

			out.println("<body>");
			out.println("<p>");
			if (cookies != null && cookies.length !=0)
				for (int i=0; i< cookies.length; i++) {
					out.println(cookies[i].getName() + " " + cookies[i].getValue() + "<br/>");
				}
			out.println("</p>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
}
