package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
        double fuelcap;
        double currentfuel;

        Crew crew;
        MaxAltitude maxAltitude;
        SeatCapacity seatCapacity;
        WeightCapacity weightCapacity;


    public Airplane(double fuelcap, double currentfuel, Crew crew, MaxAltitude maxAltitude, SeatCapacity seatCapacity, WeightCapacity weightCapacity) {
        this.fuelcap = fuelcap;
        this.currentfuel = currentfuel;
        this.crew = crew;
        this.maxAltitude = maxAltitude;
        this.seatCapacity = seatCapacity;
        this.weightCapacity = weightCapacity;
    }

    public double getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(double fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getCurrentfuel() {
        return currentfuel;
    }

    public void setCurrentfuel(double currentfuel) {
        this.currentfuel = currentfuel;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public MaxAltitude getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(MaxAltitude maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public SeatCapacity getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(SeatCapacity seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public WeightCapacity getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(WeightCapacity weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelcap=" + fuelcap +
                ", currentfuel=" + currentfuel +
                ", crew=" + crew +
                ", maxAltitude=" + maxAltitude +
                ", seatCapacity=" + seatCapacity +
                ", weightCapacity=" + weightCapacity +
                '}';
    }
}

