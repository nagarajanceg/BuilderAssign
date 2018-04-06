package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

/**
 * 
 * @author Abhi ,Nagaraj
 *
 * Class which calculates duration, cost, effort and carbon footprint if union is chosen by the user to pick gift
 */

public class UniversityUnion implements PickingGiftI {
    private int time;
    private int cost;
    private int effort;
    private int carbon;
    
    public UniversityUnion(){
        this.setDuration(UserChoices.Duration.PICKGIFTUU.getVal());
        this.setCost(UserChoices.Cost.PICKGIFTUU.getVal());
        this.setEffort(UserChoices.Effort.PICKGIFTUU.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.PICKGIFTUU.getVal());
    }

    
    @Override
	public String toString() {
		return "UniversityUnion [time=" + time + ", cost=" + cost + ", effort="
				+ effort + ", carbon=" + carbon + "]";
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
