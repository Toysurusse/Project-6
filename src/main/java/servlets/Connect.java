package servlets;

import dao.DaoFactory;
import dao.list.AccountDAO;
import dao.list.CommentaireDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Connect extends HttpServlet {
    public static final String VUE          = "/WEB-INF/seconnecter.jsp";
    private AccountDAO accountDAO;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.accountDAO = daoFactory.getAccountDAO();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pseudo = request.getParameter("pseudo");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        request.setAttribute("accounts", accountDAO.read());



        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
