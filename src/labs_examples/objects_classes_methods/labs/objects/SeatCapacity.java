package labs_examples.objects_classes_methods.labs.objects;

public class SeatCapacity {
    private int maxCap;
    private int minCap;

    public SeatCapacity(int maxCap, int minCap) {
        this.maxCap = maxCap;
        this.minCap = minCap;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public int getMinCap() {
        return minCap;
    }

    public void setMinCap(int minCap) {
        this.minCap = minCap;
    }

    @Override
    public String toString() {
        return "SeatCapacity{" +
                "maxCap=" + maxCap +
                ", minCap=" + minCap +
                '}';
    }
}
