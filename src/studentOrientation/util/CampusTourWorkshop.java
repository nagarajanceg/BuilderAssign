package studentOrientation.util;

public class CampusTourWorkshop implements CampusTourWorkshopI{
    @Override
    public void construct(CampusTourI tour) {
        tour.buildPlanCafe();
        tour.buildPlanDuration();
    }

/*	public void construct(Enums)
	{
		
	}
*/
}
