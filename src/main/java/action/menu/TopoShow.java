package action.menu;

import action.menu.connect.Connect;
import entity.RentTopo;

import java.sql.Timestamp;

/**
 * Class wich load topos
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class TopoShow extends Connect {

    /**
     * RentTopo entity
     */
    private RentTopo rentTopo;
    public RentTopo getRentTopo() {
        return rentTopo;
    }
    public void setRentTopo(RentTopo rentTopo) {
        this.rentTopo = rentTopo;
    }

    /**
     * TimeStamp of a topo
     */
    private Timestamp rent;
    public Timestamp getRent() {
        return rent;
    }
    public void setRent(Timestamp rent) {
        this.rent = rent;
    }

    /**
     * initialize Topo page
     * @return String succes
     */
    public String execute (){
        this.topoDao=this.daoFactory.getTopoDAO();
        topolist=topoDao.read();
        return "success";
    }

}
