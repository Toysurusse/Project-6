package servlets;

import dao.DaoFactory;
import dao.list.CommentaireDAO;
import dao.list.TopoDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class Topo extends HttpServlet {

    public static final String VUE          = "/WEB-INF/topo.jsp";
    private TopoDAO topoDAO;
    private CommentaireDAO commentaireDAO;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.topoDAO = daoFactory.getTopoDAO();
        this.commentaireDAO=daoFactory.getCommentaireDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("topos", topoDAO.lister());
        request.setAttribute("commentaires", commentaireDAO.lister());

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }
}
