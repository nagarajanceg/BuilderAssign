package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

/**
 * 
 * @author Abhi ,Nagaraj
 *
 * Class which calculates duration, cost, effort and carbon footprint if Watson school is chosen by the user
 */

public class Watson implements SchoolBuildingI { 

	private int time;
    private int cost;
    private int effort;
    private int carbon;
    
    public Watson(){
        this.setDuration(UserChoices.Duration.WATSON.getVal());
        this.setCost(UserChoices.Cost.WATSON.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.WATSON.getVal());
        this.setEffort(UserChoices.Effort.WATSON.getVal());
    }
	
    
    @Override
	public String toString() {
		return "Watson [time=" + time + ", cost=" + cost + ", effort="
				+ effort + ", carbon=" + carbon + "]";
	}
	
	@Override
	public int getDuration() {
		return this.time;
	}

	@Override
	public void setDuration(int time) {
		this.time = time;
		
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
	public int getCost() {
		return this.cost;
	}

	@Override
	public void setCost(int cost) {
		this.cost = cost;
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
