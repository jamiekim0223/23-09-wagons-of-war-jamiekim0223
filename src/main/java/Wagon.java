public class Wagon {
    private int milesDriven;
    private int whenToChangeOxen;
    public Wagon(int neededMiles, int oxenChange) {
        milesDriven = neededMiles;
        whenToChangeOxen = oxenChange;
    }
    public boolean timeForOxenChange() {
        if (milesDriven>= whenToChangeOxen) {
            milesDriven=0;
            return true;
        }
        else {
            return false;
        }
    }
    public void addMiles(int additionalMiles){
        milesDriven += additionalMiles;
    }
}
