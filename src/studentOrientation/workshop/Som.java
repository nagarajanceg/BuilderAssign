package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

/**
 * 
 * @author Abhi ,Nagaraj
 *
 * Class which calculates duration, cost, effort and carbon footprint if SOM school is chosen by the user
 */

public class Som implements SchoolBuildingI {

	private int time;
    private int cost;
    private int effort;
    private int carbon;
    
    public Som(){
        this.setDuration(UserChoices.Duration.SOM.getVal());
        this.setCost(UserChoices.Cost.SOM.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.SOM.getVal());
        this.setEffort(UserChoices.Effort.SOM.getVal());
    }
	
    
    @Override
	public String toString() {
		return "Som [time=" + time + ", cost=" + cost + ", effort="
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
