package studentOrientation.workshop;

import studentOrientation.CampusTourPlanner.CampusTourI;

/**
 * 
 * @author Abhi ,Nagaraj
 *
 * Class which constructs the itinerary based on the user requirements
 */

public class CampusTourWorkshop implements CampusTourWorkshopI {
	
	public CampusTourWorkshop()
	{
		
	}
	
	@Override
	public String toString() {
		return "CampusTourWorkshop [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 *  Method which has a set of methods to construct an itinerary
	 */
    @Override
    public void construct(CampusTourI tour) {
        tour.buildPlanCafe();
        tour.buildPlanSchoolType(); 
        tour.buildPlanSchool();
        tour.buildPlanLecture();
        tour.buildPlanGift();
        tour.buildPlanEstimate();
    }

	
}
