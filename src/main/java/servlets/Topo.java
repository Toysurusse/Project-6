package servlets;

import beans.Commentaire;
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

        int Compteid = 1;
        String Commentary = request.getParameter("Commentary");
        String title = request.getParameter("Title");
        Commentaire addCom = new Commentaire();

        addCom.setPageId(String.valueOf(commentaireDAO.lastIDCom(commentaireDAO.read())+1));
        addCom.setComId(String.valueOf(commentaireDAO.lastIDCom(commentaireDAO.read())+1));
        addCom.setSiteId("0");
        addCom.setTopoId("0");
        addCom.setAccount(String.valueOf(Compteid));
        addCom.setTitle(title);
        addCom.setCommentary(Commentary);

        commentaireDAO.add(addCom);

        request.setAttribute("topos", topoDAO.read());
        request.setAttribute("commentaires", commentaireDAO.read());
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("topos", topoDAO.read());
        request.setAttribute("commentaires", commentaireDAO.read());

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
