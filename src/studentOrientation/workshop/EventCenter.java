package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

public class EventCenter implements PickingGiftI {
    private int time;
    private int cost;
    private int effort;
    private int carbon;
    public EventCenter(){
        this.setDuration(UserChoices.Duration.PICKGIFTEC.getVal());
        this.setCost(UserChoices.Cost.PICKGIFTEC.getVal());
        this.setEffort(UserChoices.Effort.PICKGIFTEC.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.PICKGIFTEC.getVal());
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
        this.effort=effort;
    }

    @Override
    public int getCarbonFootprint() {
        return this.carbon;
    }

    @Override
    public void setCarbonFootprint(int carbon) {
        this.carbon=carbon;
    }
}
