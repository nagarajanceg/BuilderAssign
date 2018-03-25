package studentOrientation.util;

import studentOrientation.workshop.DurationI;
import studentOrientation.workshop.PickingGiftI;
import studentOrientation.workshop.VisitSchoolBuildingI;

public interface CampusTourI extends VisitSchoolBuildingI, PickingGiftI, DurationI {
    void setSchoolVisitCost();
    void buildPlanDuration();
    //void setCafeOnlineCharge();
    int getTotalPlanDuration();
    void buildPlanCafe();
}
