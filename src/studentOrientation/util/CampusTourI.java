package studentOrientation.util;

public interface CampusTourI extends VisitSchoolBuildingI, PickingGiftI, DurationI {
    void setSchoolVisitCost();
    void buildPlanDuration();
    //void setCafeOnlineCharge();
    int getTotalPlanDuration();
    void buildPlanCafe();
}
