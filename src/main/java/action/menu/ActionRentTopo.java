package action.menu;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.RentTopo;
import entity.Topo;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Organise rentTopo
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class ActionRentTopo  extends AbstractDaoAndList{


    /**
     * List<RentTopo> to load RentTopo from the Database
     */
    private List<RentTopo> listrent;
    public List<RentTopo> getListrent() {
        return listrent;
    }
    public void setListrent(List<RentTopo> listrent) {
        this.listrent = listrent;
    }

    /**
     * List<Topo> to load Topo from the Database
     */
    private List<Topo> topoList;
    public List<Topo> getTopoList() {
        return topoList;
    }
    public void setTopoList(List<Topo> topoList) {
        this.topoList = topoList;
    }

    /**
     * RentTopo to add a rentTopo to the data base the Database
     */
    private RentTopo rentTopo;
    public RentTopo getRentTopo() {
        return rentTopo;
    }
    public void setRentTopo(RentTopo rentTopo) {
        this.rentTopo = rentTopo;
    }

    /**
     * integer to load rentid
     */
    public int rentid;
    public int getRentid() {
        return rentid;
    }
    public void setRentid(int rentid) {
        this.rentid = rentid;
    }

    /**
     * Timestamp to define the timeStamp
     */
    private Timestamp rent;
    public Timestamp getRent() {
        return rent;
    }
    public void setRent(Timestamp rent) {
        this.rent = rent;
    }

    /**
     * initialize RentTopo page
     *
     * @return String succes
     */
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


    /**
     * delet au rentTopo
     * @return String succes
     */
    public String delete(){

        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        this.rentDao=daoFactory.getRentDAO();
        this.rentDao.delete(rentid);

        return "success";
    }


    /**
     * Add a RentTopo
     * @return String succes
     */
    public String add(){
        this.clearErrors();
        this.topoDao=daoFactory.getTopoDAO();
        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        this.rentDao=daoFactory.getRentDAO();
        Account account = (Account) this.session.get("user");
        rentTopo.setCompte_id(account.getId());
        rentTopo.setStatut(true);

        System.out.println(rentTopo.getDate());

        if(rentTopo.getTopo_id()!=-1){
            if(controlAvaibility(rentTopo,this.rentDao.read())){
                rentTopo.setTitleTopo(this.topoDao.topoSelectbyid(rentTopo.getTopo_id()).getLocation());
                this.rentDao.add(rentTopo);
            }
            else{
                this.addActionError(getText("error.Date"));
            }
        }
        else{
            this.addActionError(getText("error.RentTopo"));
        }
        rentTopo=null;
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Add a RentTopo
     * @return String succes
     */
    public boolean controlAvaibility(RentTopo rentTopo,List<RentTopo> rentTopos) {
        boolean control = true;
        java.sql.Date proposal = rentTopo.getDate();
        java.sql.Date data;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < rentTopos.size(); i++) {
            data = (Date) rentTopos.get(i).getDate();
            if (proposal.compareTo(data) == 0) {
                if (rentTopo.getTopo_id() == rentTopos.get(i).getTopo_id()) {
                    control = false;
                }
            }
        }
        return control;
    }
}
