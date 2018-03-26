package studentOrientation.workshop;

import studentOrientation.util.UserChoices;

public class OnFoot implements VisitSchoolBuildingI {
    
	private int time;
    private int cost;
    private int effort;
    private int carbon;
    public OnFoot(){
        this.setDuration(UserChoices.Duration.ONFOOT.getVal());
        this.setCost(UserChoices.Cost.ONFOOT.getVal());
        this.setCarbonFootprint(UserChoices.Carbon.FOOT.getVal());
        this.setEffort(UserChoices.Effort.FOOT.getVal());
    }
	
	
	@Override
	public int getDuration() {
		
		return this.time;
	}

	@Override
	public void setDuration(int time) {
		this.time=time;
		
	}

	@Override
	public int getEffort() {
		return this.effort;
		
	}

	@Override
	public void setEffort(int effort) {
		// TODO Auto-generated method stub
		this.effort=effort;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
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
		this.carbon=carbon;
		
	}

}
