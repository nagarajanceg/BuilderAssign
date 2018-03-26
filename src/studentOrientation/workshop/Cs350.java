package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

public class Cs350 implements AttendingShortLectureI {

	private int time;
    private int cost;
    private int effort;
    private int carbon;
    public Cs350(){
    	System.out.println("time in con =="+ time);
        this.setDuration(UserChoices.Duration.CS350.getVal());
        this.setCost(UserChoices.Cost.CS350.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.CS350.getVal());
        this.setEffort(UserChoices.Effort.CS350.getVal());
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
