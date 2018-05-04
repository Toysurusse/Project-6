package entity;

public class Site {

    private String nb;
    private String location;
    private String way;
    private String height;
    private String hardness;
    private String points_nb;
    private String topos;

    public Site(String id, String secteur, String voie, String hauteur, String cotation, String nb_points, String topo){
        this.nb=id;
        this.location = secteur;
        this.way= voie;
        this.height=hauteur;
        this.hardness=cotation;
        this.points_nb=nb_points;
        this.topos=topo;
        }

    public String getNb() {
        return nb;
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

}
