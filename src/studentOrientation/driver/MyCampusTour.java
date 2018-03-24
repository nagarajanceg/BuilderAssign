package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.UserChoices;

public class MyCampusTour implements CampusTourI {
    private String  commute = null;
    private String giftLocation = null;

    public MyCampusTour(UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter) {
        this.setCommute(commute.toString());
        this.setLocation(eventcenter.toString());
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
