import dao.DaoFactory;
import dao.list.TopoDAO;

public class main {

    public static void main (String [] args) {

        DaoFactory daoFactory = (DaoFactory) DaoFactory.getInstance();
        TopoDAO topoDAO = daoFactory.getTopoDAO();

    }

}
