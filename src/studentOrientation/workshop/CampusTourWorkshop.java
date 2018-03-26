package studentOrientation.workshop;

import studentOrientation.util.CampusTourI;

public class CampusTourWorkshop implements CampusTourWorkshopI {
    @Override
    public void construct(CampusTourI tour) {
        tour.buildPlanCafe();
        tour.buildPlanSchool();
        tour.buildPlanEstimate();
    }

/*	public void construct(Enums)
	{
		
	}
*/
}
