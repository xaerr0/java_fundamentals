package labs_examples.input_output.labs.top10bbq;

public class Restaurant {

    private int rank;
    private String name;
    private String address;
    private String city;
    private String phoneNum;
    private String hours;

    public Restaurant() {

    }


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
               "rank=" + rank +
               ", name='" + name + '\'' +
               ", address='" + address + '\'' +
               ", city='" + city + '\'' +
               ", phoneNum='" + phoneNum + '\'' +
               ", hours='" + hours + '\'' +
               '}';

    }

    public String toCSV() {
        return rank + "," + name + "," + address + "," + city + "," + phoneNum + "," + hours;

    }


}

