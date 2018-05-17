package servlets;

import dao.DaoFactory;
import dao.list.SiteDAO;
import dao.list.TopoDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Filter extends HttpServlet {

    public static final String VUE          = "/WEB-INF/filter.jsp";
    private TopoDAO topoDAO;
    private SiteDAO siteDAO;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.topoDAO = daoFactory.getTopoDAO();
        this.siteDAO= daoFactory.getSiteDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("topos", topoDAO.read());
        request.setAttribute("sites", siteDAO.read());

        String topoChoix = request.getParameter("topochoisi");
        String siteChoix = request.getParameter("sitechoisi");

        request.setAttribute("topoChoix", topoDAO.topoSelect(Integer.parseInt(topoChoix)));
        request.setAttribute("siteChoix", siteDAO.topoSiteSelect(Integer.parseInt(siteChoix)));
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("topos", topoDAO.read());
        request.setAttribute("sites", siteDAO.read());

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
