package studentOrientation.driver;

import studentOrientation.util.*;
import studentOrientation.workshop.CampusTourWorkshop;
import studentOrientation.workshop.CampusTourWorkshopI;
import studentOrientation.workshop.VisitSchoolBuildingI;

public class Driver {

    public static void main(String[] args) {
        CampusTourI cti = new MyCampusTour(VisitSchoolBuildingI.UserChoices.SchoolBuildingCommute.BUSRIDE, VisitSchoolBuildingI.UserChoices.GiftShop.EVENTCENTER, VisitSchoolBuildingI.UserChoices.Cafe.CIW);
        System.out.println(cti.getLocation());
        System.out.println(cti.getCommute());

        CampusTourWorkshopI Events = new CampusTourWorkshop();
        Events.construct(cti);
        System.out.println(cti.getTotalPlanDuration());
    }
}
