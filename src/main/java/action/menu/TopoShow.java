package action.menu;

import action.menu.connect.Connect;
import dao.beans.RentDao;
import entity.RentTopo;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.TopoDao;

import java.sql.Timestamp;
import java.util.List;

public class TopoShow extends Connect {

    private DaoFactory daoFactory;
    public DaoFactory getDaoFactory() {
        return daoFactory;
    }
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    private TopoDao topoDao ;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    private RentDao rentDao;
    public RentDao getRentDao() {
        return rentDao;
    }
    public void setRentDao(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    private List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

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
