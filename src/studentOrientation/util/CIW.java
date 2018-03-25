package studentOrientation.util;

public class CIW implements SelectingCafeteriaI{
    private CampusTourI tourObject;
    private int time;
    private int cost;
    public CIW(){
        this.setDuration(UserChoices.Duration.CAFE.getVal());
        this.setCost(UserChoices.Cost.CAFECIW.getVal());
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void setDuration(int time) {
        this.time = time;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getDuration() {
        return time;
    }
}
