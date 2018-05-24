package servlets;

import beans.Account;
import beans.Adress;
import dao.DaoFactory;
import dao.list.AccountDAO;
import dao.list.AddressDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CreateAccount extends HttpServlet {
    public static final String VUE          = "/WEB-INF/createAccount.jsp";
    private AccountDAO accountDAO;
    private AddressDAO addressDAO;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.accountDAO = daoFactory.getAccountDAO();
        this.addressDAO = daoFactory.getAdressDAO();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Adress addadress= new Adress();
        Account addaccount= new Account();

        String pseudo = request.getParameter("pseudo");
        String password = request.getParameter("password");
        String passwordControl = request.getParameter("passwordControl");
        int id = accountDAO.lastIDCom(accountDAO.read())+1;
        String name  = request.getParameter("name");;
        String firstName = request.getParameter("firstName");;
        int adresseId = accountDAO.lastIDCom(accountDAO.read())+1;

        int nbStreet = Integer.parseInt(request.getParameter("nbStreet"));
        String street = request.getParameter("street");
        int postalCode = Integer.parseInt(request.getParameter("postalCode"));
        String city = request.getParameter("city");
        String code = request.getParameter("code");
        String infoSub = request.getParameter("infoSub");


        addaccount.setPseudo(pseudo);
        addaccount.setPassword(password);
        addaccount.setId(id);
        addaccount.setName(name);
        addaccount.setFirstName(firstName);

        addaccount.setSex(request.getParameter("sexChoisi"));

        addaccount.setAdressId(adresseId);
        addadress.setAdressId(adresseId);
        addadress.setNbStreet(nbStreet);
        addadress.setStreet(street);
        addadress.setPostalCode(postalCode);
        addadress.setCity(city);
        addadress.setCode(code);
        addadress.setInfoSub(infoSub);

        boolean principalAdress = Boolean.parseBoolean(request.getParameter("principalAdress"));
        addadress.setPrincipalAdress(principalAdress);

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
