package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FRUTOSDEGOIAS
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sistema Acadêmico</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Efetuar Login</h1>");
            out.println("<hr>");
            out.println("<form action='./Login' method='post'>");
            out.println("<div>");
            out.println("<label>Matrícula:</label>");
            out.println("<input type='text' name='matricula' size='15' value=''>");
            out.println("</div>");
            out.println("<div>");
            out.println("<label>Senha:</label>");
            out.println("<input type='password' name='senha' size='15' value=''>");
            out.println("</div><br>");
            out.println("<input type='submit' value='Entrar'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");

        if (matricula == "" || senha == "") {
            response.sendRedirect(request.getContextPath() + "/Login");
        } else {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("autenticado", true);
            response.sendRedirect(request.getContextPath() + "/");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}