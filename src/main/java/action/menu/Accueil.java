package action.menu;

import com.opensymphony.xwork2.ActionSupport;
import dao.beans.InfoDao;
import entity.Information;

import java.util.List;

/**
 * Classe initiant l'accueil
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */


public class Accueil extends AbstractDaoAndList {

    /**
     * init information
     */
    private Information info;

    /**
     * init infoDao loader
     */
    private InfoDao infoDao;

    /**
     * init infoDao loader
     */
    private List<Information> informationList;

    public String execute() {

        informationList=null;
        this.infoDao=this.daoFactory.getInfoDAO();
        informationList=this.infoDao.read();

        return ActionSupport.SUCCESS;
    }

    public InfoDao getInfoDao() {
        return infoDao;
    }

    public void setInfoDao(InfoDao infoDao) {
        this.infoDao = infoDao;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        this.info = info;
    }


    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }
}