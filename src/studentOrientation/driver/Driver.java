package studentOrientation.driver;

import studentOrientation.util.CampusTourI;
import studentOrientation.util.MyCampusTour;
import studentOrientation.workshop.CampusTourWorkshop;
import studentOrientation.workshop.CampusTourWorkshopI;
import studentOrientation.util.UserChoices;

/**
 * 
 * @author Abhi, Nagaraj
 * 
 * Driver code which takes the user input and sends their choice to the workshop to create an itinerary
 *
 */
public class Driver {

    public static void main(String[] args) {
        CampusTourI cti = new MyCampusTour(UserChoices.SchoolTypes.WATSON,UserChoices.SchoolBuildingCommute.BUSRIDE, UserChoices.GiftShop.EVENTCENTER, UserChoices.Cafe.MOUNTAINVIEW,UserChoices.Lecture.CS240);
        CampusTourWorkshopI Events = new CampusTourWorkshop();
        Events.construct(cti);

    }
}
