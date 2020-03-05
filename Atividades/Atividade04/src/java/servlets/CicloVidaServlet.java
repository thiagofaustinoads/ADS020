package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CicloVidaServet", urlPatterns = "/CicloVidaServlet")
public class CicloVidaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath()+"/index.html");
        System.out.println("Executando CicloVidaServlet...");
        
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Iniciando CicloVidaServlet...");
    }

    @Override
    public void destroy() {
        System.out.println("Finalizando CicloVidaServlet...");
    }
    
}
