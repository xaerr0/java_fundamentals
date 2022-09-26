package labs_examples.enumerations.labs;

public enum Meat {

    BRISKET("Brisket", 15),
    PULLEDPORK("Pulled Pork", 10),
    SAUSAGE("Jalapeno Cheddar Sausage", 2),
    RIBS("Ribs", 10),
    CHICKEN("Chicken", 10);

    private String name;
    private int price;

    Meat(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(String name, int price) {
        this.price = price;
    }

    Meat(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " $" + price;
    }
}