package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchyexample;

public class Plate2 extends Plate1 {

    private final String meat2;
    private final String side2;

    @Override
    public String toString() {
        return super.getMeat1() + " and " + meat2 + " with " + super.getSide1() + " and " + side2;
    }

    public Plate2(String meat1, String side1, String meat2, String side2) {
        super(meat1, side1);
        this.meat2 = meat2;
        this.side2 = side2;
    }

    public String getMeat2() {
        return meat2;
    }

    public String getSide2() {
        return side2;
    }
}
