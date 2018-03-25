package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.MyCampusTour;
import studentOrientation.workshop.CampusTourWorkshop;
import studentOrientation.workshop.CampusTourWorkshopI;
import studentOrientation.util.UserChoices;


public class Driver {

    public static void main(String[] args) {
        CampusTourI cti = new MyCampusTour(UserChoices.SchoolBuildingCommute.BUSRIDE, UserChoices.GiftShop.EVENTCENTER, UserChoices.Cafe.CIW);

        CampusTourWorkshopI Events = new CampusTourWorkshop();
        Events.construct(cti);
//        System.out.println(cti.getTotalPlanDuration());
    }
}
