import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AloMundoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServeletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Alo, Mundo!</h1>");
    }
}

