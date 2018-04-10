package studentOrientation.driver;

import studentOrientation.CampusTourPlanner.CampusTourI;
import studentOrientation.CampusTourPlanner.MyCampusTour;
import studentOrientation.util.UserChoices;
import studentOrientation.workshop.CampusTourWorkshop;
import studentOrientation.workshop.CampusTourWorkshopI;

/**
 * @author Abhi, Nagaraj
 * <p>
 * Driver code which takes the user input and sends their choice to the workshop to create an itinerary
 */
public class Driver {

    public static void main(String[] args) {
        CampusTourI tourItinerary = new MyCampusTour(
                UserChoices.SchoolBuildingCommute.BUSRIDE,
                UserChoices.SchoolTypes.WATSON,
                UserChoices.GiftShop.EVENTCENTER,
                UserChoices.Cafe.MOUNTAINVIEW,
                UserChoices.Lecture.CS240
        );
// Option-2
//        CampusTourI tourItinerary = new MyCampusTour(
//                UserChoices.SchoolBuildingCommute.ONFOOT,
//                UserChoices.SchoolTypes.SOM,
//                UserChoices.GiftShop.UU,
//                UserChoices.Cafe.CIW,
//                UserChoices.Lecture.CS350
//        );
//Option-3
//                CampusTourI tourItinerary = new MyCampusTour(
//                        UserChoices.SchoolBuildingCommute.BUSRIDE,
//                        UserChoices.SchoolTypes.SOM,
//                        UserChoices.GiftShop.UU,
//                        UserChoices.Cafe.MOUNTAINVIEW,
//                        UserChoices.Lecture.CS350
//                );
//        Option-4
//                CampusTourI tourItinerary = new MyCampusTour(
//                        UserChoices.SchoolBuildingCommute.ONFOOT,
//                        UserChoices.SchoolTypes.SOM,
//                        UserChoices.GiftShop.EVENTCENTER,
//                        UserChoices.Cafe.CIW,
//                        UserChoices.Lecture.CS240
//                );
        CampusTourWorkshopI EventBuilder = new CampusTourWorkshop();
        EventBuilder.construct(tourItinerary);
    }
}
