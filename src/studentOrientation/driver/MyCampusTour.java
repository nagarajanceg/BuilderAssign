package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.UserChoices;

public class MyCampusTour implements CampusTourI {
    private String  commute = null;
    private String giftLocation = null;
    private double schoolvisitCost;
    private int commuteDuration = 0;
    private int giftChoosingDuration = 0;
    private int totalPlanDuration =0 ;
    public MyCampusTour(UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter) {
        this.setCommute(commute.toString());
        this.setLocation(eventcenter.toString());
        this.setDuration(commute.toString());
        this.setDuration(eventcenter.toString());
    }

    @Override
    public int getDuration(String type) {
        if(type.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.toString())){
            return commuteDuration;
        }else if(type.equals(UserChoices.GiftShop.EVENTCENTER.toString())){
            return giftChoosingDuration;
        }
        return 0;
    }

    @Override
    public void setDuration(String type) {
        if(type.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.toString())){
            commuteDuration = UserChoices.Duration.SCHOOLVISIT.getVal();
        }else if(type.equals(UserChoices.GiftShop.EVENTCENTER.toString())){
            giftChoosingDuration = UserChoices.Duration.PICKGIFT.getVal();
        }
    }

    @Override
    public int getTotalPlanDuration() {
        return totalPlanDuration;
    }

    @Override
    public void setSchoolVisitCost() {
        if(this.getCommute().equals(UserChoices.SchoolBuildingCommute.BUSRIDE.toString())){
            this.schoolvisitCost = 1.0; //in dollars //todo move this separate constant
        }else{
            this.schoolvisitCost = 0.5;
        }
    }

    @Override
    public void setCommute(String mode) {
        commute = mode;
    }

    @Override
    public String getCommute() {
        return commute;
    }

    @Override
    public void setLocation(String location) {
        this.giftLocation = location;
    }

    @Override
    public String getLocation() {
        return giftLocation;
    }

    public int calculateDurationByEnumType(Enum[] type){
        int subTotal = 0;
        for(Enum ele : type){
            subTotal += this.getDuration(ele.toString());
        }
        return subTotal;
    }
    @Override
    public void buildPlanDuration(){
        totalPlanDuration  = calculateDurationByEnumType(UserChoices.SchoolBuildingCommute.values());
        System.out.println("Plan Duration == "+ totalPlanDuration);
    }
}
