package studentOrientation.driver;

import studentOrientation.CampusTour.CampusTourI;
import studentOrientation.CampusTour.MyCampusTour;
import studentOrientation.workshop.CampusTourWorkshop;
import studentOrientation.workshop.CampusTourWorkshopI;
import studentOrientation.util.UserChoices;

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
        CampusTourWorkshopI EventBuilder = new CampusTourWorkshop();
        EventBuilder.construct(tourItinerary);
    }
}
