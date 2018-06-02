package entity;

public class RentTopo {

    private int id;
    private int compte_id;
    private int topo_id;
    private boolean statut;
    private String title;
    private String resume;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompte_id() {
        return compte_id;
    }

    public void setCompte_id(int compte_id) {
        this.compte_id = compte_id;
    }

    public int getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(int topo_id) {
        this.topo_id = topo_id;
    }

    public boolean getStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

}
