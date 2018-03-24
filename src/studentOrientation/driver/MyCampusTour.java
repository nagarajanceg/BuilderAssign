package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.UserChoices;

public class MyCampusTour implements CampusTourI {
    private String  commute = null;
    private String giftLocation = null;
    private double schoolvisitCost;

    public MyCampusTour(UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter) {
        this.setCommute(commute.toString());
        this.setLocation(eventcenter.toString());
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
}
