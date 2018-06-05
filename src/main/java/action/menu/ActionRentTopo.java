package action.menu;

import action.menu.connect.Connect;
import dao.beans.RentDao;
import dao.beans.TopoDao;
import entity.Account;
import entity.RentTopo;
import entity.Topo;

import java.util.List;

public class ActionRentTopo  extends Connect {

    protected RentDao rentDao;
    public RentDao getRentDao() {
        return rentDao;
    }
    public void setRentDao(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    protected TopoDao topoDao;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    private List<RentTopo> listrent;
    public List<RentTopo> getListrent() {
        return listrent;
    }
    public void setListrent(List<RentTopo> listrent) {
        this.listrent = listrent;
    }

    private List<Topo> topoList;
    public List<Topo> getTopoList() {
        return topoList;
    }
    public void setTopoList(List<Topo> topoList) {
        this.topoList = topoList;
    }

    private RentTopo rentTopo;
    public RentTopo getRentTopo() {
        return rentTopo;
    }
    public void setRentTopo(RentTopo rentTopo) {
        this.rentTopo = rentTopo;
    }

    public int rentid;
    public int getRentid() {
        return rentid;
    }
    public void setRentid(int rentid) {
        this.rentid = rentid;
    }

    public String execute(){

        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        this.rentDao=daoFactory.getRentDAO();
        this.topoDao=daoFactory.getTopoDAO();

        Account account = (Account) this.session.get("user");
        topoList=this.topoDao.read();
        listrent = this.rentDao.read();

        return "success";
    }

    public String delete(){

        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        this.rentDao=daoFactory.getRentDAO();

        this.rentDao.delete(rentid);

        return "success";
    }

    public String add(){

        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        this.rentDao=daoFactory.getRentDAO();
        Account account = (Account) this.session.get("user");
        rentTopo.setCompte_id(account.getId());
        rentTopo.setStatut(true);

        if (controlAddRent(rentTopo)){
            this.rentDao.add(rentTopo);
        }

        return "success";
    }

    private boolean controlAddRent(RentTopo rentTopo){

        boolean test = true;

        if(rentTopo.getTitle().length()>99) {
            this.addActionError(getText("error.TitreRentTopoTooLong"));
            test = false;
        }
        if(rentTopo.getResume().length()>49000) {
            this.addActionError(getText("error.ResumeRentTopoTooLong"));
            test = false;
        }

        return test;
    }

}