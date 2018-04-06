package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

/**
 * 
 * @author Abhi ,Nagaraj
 *
 * Class which calculates duration, cost, effort and carbon footprint if Cs240 lecture is chosen by the user
 */

public class Cs240 implements AttendingShortLectureI {

	private int time;
    private int cost;
    private int effort;
    private int carbon;
    
    public Cs240(){
        this.setDuration(UserChoices.Duration.CS240.getVal());
        this.setCost(UserChoices.Cost.CS240.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.CS240.getVal());
        this.setEffort(UserChoices.Effort.CS240.getVal());
    }
    
    @Override
	public String toString() {
		return "Cs240 [time=" + time + ", cost=" + cost + ", effort=" + effort
				+ ", carbon=" + carbon + "]";
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
