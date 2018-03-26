package studentOrientation.util;

import studentOrientation.workshop.*;

public class MyCampusTour implements CampusTourI {

    private String cafeName = null;
    private String commute = null;
    private int totalPlanDuration =0 ;
    private SelectingCafeteriaI cafeI = null;
    private VisitSchoolBuildingI schoolI=null;

    public MyCampusTour(UserChoices.SchoolTypes school,UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter, UserChoices.Cafe cafe) {
        this.setCafe(cafe.toString());
        this.setCommute(commute.toString());
    }

    private void setCafe(String name){
        this.cafeName = name;
    }
    public String getCafe(){
        return this.cafeName;
    }
    private void setCommute(String name){
        this.commute = name;
    }
    public String getCommute(){
        return this.commute;
    }

    public int getTotalPlanDuration() {
        return totalPlanDuration;
    }

    public void setTotalPlanDuration(int totalPlanDuration) {
        this.totalPlanDuration = totalPlanDuration;
    }


    @Override
    public void buildPlanEstimate(){
        int duration;
        duration= this.getTotalPlanDuration()+ cafeI.getDuration() +schoolI.getDuration();
        System.out.println("Plan Duration == "+ duration);
        this.setTotalPlanDuration(duration);
    }
    @Override
    public void buildPlanCafe(){
        System.out.println("value::"+UserChoices.Cafe.CIW.name());
        if(cafeName.equals(UserChoices.Cafe.CIW.toString())){
            cafeI = new CIW();
            System.out.println(cafeI.getDuration() + " "+ cafeI.getCost());
        }else if(cafeName.equals(UserChoices.Cafe.MOUNTAINVIEW.toString())){
            cafeI = new MountainView();
            System.out.println(cafeI.getDuration() + " "+ cafeI.getCost());
        }
    }

	@Override
	public void buildPlanSchool() {
		 System.out.println("value::"+UserChoices.SchoolBuildingCommute.BUSRIDE.name());
		 System.out.println(commute);
	        if(commute.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.name())){
	        	System.out.println("inside");
	            schoolI = new BusRide();
	            System.out.println(schoolI.getDuration() + " "+ schoolI.getCost());
	        }
	        else if(commute.equals(UserChoices.SchoolBuildingCommute.ONFOOT.name())){
	            schoolI = new OnFoot();
	            System.out.println(schoolI.getDuration() + " "+ schoolI.getCost());
	        } 
		
	}
  
}
