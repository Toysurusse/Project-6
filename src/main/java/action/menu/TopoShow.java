package action.menu;

import entity.Topo;
import dao.DaoFactory;
import dao.beans.TopoDao;

import java.util.List;

public class TopoShow {

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

    private List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    public String execute (){
        this.topoDao=this.daoFactory.getTopoDAO();
        topolist=topoDao.read();
        return "success";
    }
}
