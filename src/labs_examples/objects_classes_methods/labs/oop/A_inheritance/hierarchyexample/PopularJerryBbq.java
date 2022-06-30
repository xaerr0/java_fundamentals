package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchyexample;

public class PopularJerryBbq {

    public static void main(String[] args) {

        Plate1 bigBoiPlate = new Plate1("Pulled Pork", "Corn Bread");
        Plate2 biggaBoiPlate = new Plate2("Pulled Pork", "Corn Bread", "Ribs", "Mackin Cheez");
        Plate3 bigginBigPlate = new Plate3("Pulled Pork", "Corn Bread", "Ribs", "Mackin Cheez",
                "Brisket", "Sausage");

        System.out.println("Big Boi Plate: " + bigBoiPlate.toString());
        System.out.println("Bigga' Boi Plate: " + biggaBoiPlate.toString());
        System.out.println("Biggin' Big Plate: " + bigginBigPlate.toString());




    }
}