package beans;

public class Site {

    private String id;
    private String location;

    private String way;
    private String height;
    private String hardness;
    private String points_nb;
    private String topos;

    public Site(String id, String secteur, String voie, String hauteur, String cotation, String nb_points, String topo){
        this.id=id;
        this.location = secteur;
        this.way= voie;
        this.height=hauteur;
        this.hardness=cotation;
        this.points_nb=nb_points;
        this.topos=topo;
        }

    public String getNb() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public String getWay() {
        return way;
    }
    public String getHeight() {
        return height;
    }
    public String getHardness() {
        return hardness;
    }
    public String getPoints_nb() {
        return points_nb;
    }
    public String getTopos() {
        return topos;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setWay(String way) {
        this.way = way;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setHardness(String hardness) {
        this.hardness = hardness;
    }
    public void setPoints_nb(String points_nb) {
        this.points_nb = points_nb;
    }
    public void setTopos(String topos) {
        this.topos = topos;
    }

}
