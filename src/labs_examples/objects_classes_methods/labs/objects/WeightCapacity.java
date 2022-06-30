package labs_examples.objects_classes_methods.labs.objects;

public class WeightCapacity {
    private int maxWeight;
    private boolean isSafe;

    public WeightCapacity(int maxWeight, boolean isSafe) {
        this.maxWeight = maxWeight;
        this.isSafe = isSafe;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean safe) {
        isSafe = safe;
    }

    @Override
    public String toString() {
        return "WeightCapacity{" +
                "maxWeight=" + maxWeight +
                ", isSafe=" + isSafe +
                '}';
    }
}
