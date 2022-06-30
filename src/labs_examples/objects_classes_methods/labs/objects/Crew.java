package labs_examples.objects_classes_methods.labs.objects;

public class Crew {
    private int crewSize;
    private boolean isFullyStaffed;

    public Crew(int crewSize, boolean isFullyStaffed) {
        this.crewSize = crewSize;
        this.isFullyStaffed = isFullyStaffed;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public boolean isFullyStaffed() {
        return isFullyStaffed;
    }

    public void setFullyStaffed(boolean fullyStaffed) {
        isFullyStaffed = fullyStaffed;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "crewSize=" + crewSize +
                ", isFullyStaffed=" + isFullyStaffed +
                '}';
    }
}

