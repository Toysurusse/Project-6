package action.menu;

import action.menu.connect.Connect;
import dao.beans.RentDao;
import entity.RentTopo;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.TopoDao;

import java.sql.Timestamp;
import java.util.List;

/**
 * Class wich load topos
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class TopoShow extends Connect {

    private RentTopo rentTopo;
    public RentTopo getRentTopo() {
        return rentTopo;
    }
    public void setRentTopo(RentTopo rentTopo) {
        this.rentTopo = rentTopo;
    }

    private Timestamp rent;
    public Timestamp getRent() {
        return rent;
    }
    public void setRent(Timestamp rent) {
        this.rent = rent;
    }

    public String execute (){
        this.topoDao=this.daoFactory.getTopoDAO();
        topolist=topoDao.read();
        return "success";
    }

}
