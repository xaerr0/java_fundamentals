package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchyexample;

public class Plate3 extends Plate2 {

    private String meat3;
    private String meat4;

    public String getMeat3() {
        return meat3;
    }

    public String getMeat4() {
        return meat4;
    }

    @Override
    public String toString() {
        return super.getMeat1() + ", " + super.getMeat2() + ", "  + meat3 + " and " + meat4 + " with " + super.getSide1()
                + " and " + super.getSide2();
    }

    public Plate3(String meat1, String side1, String meat2, String side2, String meat3, String meat4) {
        super(meat1, side1, meat2, side2);
        this.meat3 = meat3;
        this.meat4 = meat4;


    }
}
