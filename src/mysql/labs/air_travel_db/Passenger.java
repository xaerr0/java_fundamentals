package mysql.labs.air_travel_db;

public class Passenger {
    private Long id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private int points;

    public Passenger(Long id, String first_name, String last_name, String address, String city, String state, int points) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.points = points;
    }

    public Passenger(String first_name, String last_name, String address, String city, String state, int points) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.points = points;
    }

    public Passenger() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "id = " + id + "," + " first name = " + first_name + "," + " last name = " + last_name + "," +
               " address = " + address + "," + " city = " + city + "," + " state = " + state + "," + " points = " + points;
    }
}