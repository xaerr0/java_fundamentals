package mysql.labs.air_travel_db;

public class Airport {
    private Long id;
    private String name;
    private String iata;

    public Airport(Long id, String name, String iata) {
        this.id = id;
        this.name = name;
        this.iata = iata;
    }

    public Airport(String name, String iata) {
        this.name = name;
        this.iata = iata;
    }

    public Airport() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name='" + name + "iata = "  + iata;
    }
}