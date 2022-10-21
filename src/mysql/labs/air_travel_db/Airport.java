package mysql.labs.air_travel_db;

public class Airport {
    private int id;
    private String name;
    private String iata;

    public Airport(int id, String name, String iata) {
        this.id = id;
        this.name = name;
        this.iata = iata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}