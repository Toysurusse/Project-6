package action.menu;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Class wich load sites and sectors
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class SiteShow extends AbstractDaoAndList {

    private String locationlist;

    /**
     * initialize Site page
     *
     * @return String succes
     */
    public String execute() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();
        this.commentaireDao = this.daoFactory.getCommentaireDAO();
        this.accountDAO = this.daoFactory.getAccountDAO();
        hashMap.clear();
        topolist = topoDao.read();

        if (siteid == null) {
            listeSiteByLocation();
        }
        else if (siteid == 0) {
            sitelist = this.siteDao.topoSiteSelect(topoid);
            commentaireList = this.commentaireDao.readTopo(topoid);
            for (int i = 0; i < commentaireList.size(); i++) {
                hashMap.put(commentaireList.get(i), this.accountDAO.findAccount(commentaireList.get(i).getAccount()));
            }
        } else {
            sitelist = this.siteDao.siteTopoSelect(siteid);
            commentaireList = this.commentaireDao.readWay(siteid);
            for (int i = 0; i < commentaireList.size(); i++) {
                hashMap.put(commentaireList.get(i), this.accountDAO.findAccount(commentaireList.get(i).getAccount()));
            }
        }
        return "success";
    }

    /**
     * initialize Site page from sector list in filter
     *
     * @return String succes
     */
    public String listeSiteByLocation() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.commentaireDao = this.daoFactory.getCommentaireDAO();
        this.accountDAO = this.daoFactory.getAccountDAO();
        hashMap.clear();
        sitelist = this.siteDao.siteSelectByString(location);
        return "success";
    }

    /**
     * add a commentary
     *
     * @return String succes
     */
    public String addcom() {
        Date date = new Date();
        this.commentaireDao = daoFactory.getCommentaireDAO();
        commentaire.setComId(this.commentaireDao.lastIDCom(this.commentaireDao.read()) + 1);
        commentaire.setCreateAt(new Timestamp(date.getTime()));
        commentaire.setPageId(commentaire.getComId());
        this.commentaireDao.add(commentaire);
        commentaire = null;
        return "success";
    }

    /**
     * delete a commentary
     *
     * @return String succes
     */
    public String deletecom() {
        this.commentaireDao = daoFactory.getCommentaireDAO();
        this.commentaireDao.deleteTime(id);
        return "success";
    }

    public void setLocationlist(String locationlist) {
        this.locationlist = locationlist;
    }

    public String getLocationlist() {
        return locationlist;
    }
}
