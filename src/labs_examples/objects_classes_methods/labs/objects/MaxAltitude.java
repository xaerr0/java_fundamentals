package labs_examples.objects_classes_methods.labs.objects;

public class MaxAltitude {
    private int maxAlt;

    public MaxAltitude(int maxAlt) {
        this.maxAlt = maxAlt;
    }

    public int getMaxAlt() {
        return maxAlt;
    }

    public void setMaxAlt(int maxAlt) {
        this.maxAlt = maxAlt;
    }

    @Override
    public String toString() {
        return "MaxAltitude{" +
                "maxAlt=" + maxAlt +
                '}';
    }
}
