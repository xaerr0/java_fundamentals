package labs_examples.objects_classes_methods.labs.objects;

public class MainPlane {

    public static void main(String[] args) {
        Crew myCrew = new Crew (15, true);
        MaxAltitude maxAlt = new MaxAltitude (45000);
        SeatCapacity seatCapacity = new SeatCapacity(524, 200);
        WeightCapacity weightCapacity = new WeightCapacity(40000, true);

        System.out.println("My plane has a crew size of " + myCrew.getCrewSize() + " and " + myCrew.isFullyStaffed() +
        " it is fully staffed");

        System.out.println(seatCapacity.toString());
    }


}
