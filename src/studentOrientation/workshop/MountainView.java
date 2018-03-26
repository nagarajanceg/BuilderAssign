package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

public class MountainView implements SelectingCafeteriaI {
    private int time;
    private int cost;
    private int effort;
    private int carbon;

    public MountainView(){
        this.setDuration(UserChoices.Duration.CAFEMW.getVal());
        this.setCost(UserChoices.Cost.CAFEMW.getVal());
        this.setEffort(UserChoices.Effort.CAFEMW.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.CAFEMW.getVal());
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

    @Override
    public int getEffort() {
        return this.effort;

    }

    @Override
    public void setEffort(int effort) {
        this.effort = effort;
    }

    @Override
    public int getCarbonFootprint() {
        return this.carbon;
    }

    @Override
    public void setCarbonFootprint(int carbon) {
        this.carbon = carbon;
    }
}
