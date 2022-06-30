package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchyexample;

public class Plate1 {

    private String meat1;
    private String side1;

    public Plate1(String meat1, String side1) {
        this.meat1 = meat1;
        this.side1 = side1;


    }

    public String getMeat1() {
        return meat1;
    }

    public String getSide1() {
        return side1;
    }

    @Override
    public String toString() {
        return meat1 + " and " + side1;
    }

}


