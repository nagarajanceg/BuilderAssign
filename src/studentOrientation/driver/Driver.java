package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.CampusTourWorkshop;
import studentOrientation.util.CampusTourWorkshopI;
import studentOrientation.util.UserChoices;

public class Driver {

    public static void main(String[] args) {
//        System.out.println(UserChoices.SchoolBuildingCommute.BUSRIDE +" "+ UserChoices.GiftShop.EVENTCENTER + " "
//                +UserChoices.Cafe.CIW + UserChoices.Lecture.CS240);
//        System.out.println(UserChoices.SchoolBuildingCommute.BUSRIDE.getClass().getSimpleName());

        CampusTourI cti = new MyCampusTour(UserChoices.SchoolBuildingCommute.BUSRIDE, UserChoices.GiftShop.EVENTCENTER, UserChoices.Cafe.CIW);
        System.out.println(cti.getLocation());
        System.out.println(cti.getCommute());

        CampusTourWorkshopI Events = new CampusTourWorkshop();
        Events.construct(cti);
        System.out.println(cti.getTotalPlanDuration());
    }
}
