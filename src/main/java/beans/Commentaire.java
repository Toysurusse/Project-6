package entity;

public class Commentaire {

    private String comId;
    private String compteId;
    private String title;
    private String commentary;

    public Commentaire(String id, String compteid, String titre, String commentary) {
        this.comId=id;
        this.compteId=compteid;
        this.title=titre;
        this.commentary=commentary;
    }

    public String getComId() {
        return comId;
    }
    public String getCompteId() {
        return compteId;
    }
    public String getTitle() {
        return title;
    }
    public String getCommentary() {
        return commentary;
    }
}
