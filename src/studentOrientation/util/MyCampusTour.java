package studentOrientation.util;

import studentOrientation.workshop.CIW;
import studentOrientation.workshop.SelectingCafeteriaI;

public class MyCampusTour implements CampusTourI {

    private String cafeName = null;
    private int totalPlanDuration =0 ;
    private SelectingCafeteriaI cafeI = null;

    public MyCampusTour(UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter, UserChoices.Cafe cafe) {
        this.setCafe(cafe.toString());
    }

    private void setCafe(String name){
        this.cafeName = name;
    }
    public String getCafe(){
        return this.cafeName;
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
        duration= this.getTotalPlanDuration()+ cafeI.getDuration();
        System.out.println("Plan Duration == "+ duration);
        this.setTotalPlanDuration(duration);
    }
    @Override
    public void buildPlanCafe(){
        System.out.println("value::"+UserChoices.Cafe.CIW.name());
        if(cafeName.equals(UserChoices.Cafe.CIW.toString())){
            cafeI = new CIW();
            System.out.println(cafeI.getDuration() + " "+ cafeI.getCost());
        }
    }
}
