package beans;

public class Commentaire {

    private String account;
    private String title;
    private String commentary;
    private String comId;
    private String pageId;
    private String siteId;
    private String topoId;

    public String getComId() {
        return comId;
    }
    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommentary() {
        return commentary;
    }
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getPageId() {
        return pageId;
    }
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getTopoId() {
        return topoId;
    }
    public void setTopoId(String topoId) {
        this.topoId = topoId;
    }
}
