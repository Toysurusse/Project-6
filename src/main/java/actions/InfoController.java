package actions;

import beans.Commentaire;
import beans.Information;
import beans.Site;
import beans.Topo;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.CommentaireDAO;
import dao.list.InfoDAO;
import dao.list.SiteDAO;
import dao.list.TopoDAO;

import java.util.List;

public class InfoController extends ActionSupport {

    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private InfoDAO infoDAO;

    private List<Information> listInfo;
    private Information information;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Information getInformation() {
        return information;
    }
    public void setInformation(Information information) {
        this.information = information;
    }
    public List<Information> getListInfo() {
        return listInfo;
    }
    public void setListInfo(List<Information> listInfo) {
        this.listInfo = listInfo;
    }

    public String doListInfo() {
        this.infoDAO = daoFactory.getInfoDAO();
        listInfo = this.infoDAO.read();
        return ActionSupport.SUCCESS;
    }

    public String doAddInfo() {
        this.infoDAO = daoFactory.getInfoDAO();
        listInfo = this.infoDAO.read();
        //this.infoDAO.lastIDInfo(listInfo)
        information.setId(1);
        this.infoDAO.add(information);
        return ActionSupport.SUCCESS;
    }
}
