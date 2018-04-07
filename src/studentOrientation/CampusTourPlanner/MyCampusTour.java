package studentOrientation.CampusTourPlanner;

import studentOrientation.factory.CafeSimpleFactory;
import studentOrientation.factory.GiftSimpleFactory;
import studentOrientation.factory.LectureSimpleFactory;
import studentOrientation.factory.SchoolSimpleFactory;
import studentOrientation.factory.SchoolTypeSimpleFactory;
import studentOrientation.util.EnumI;
import studentOrientation.util.ParameterI;
import studentOrientation.util.ParameterMatcher;
import studentOrientation.workshop.AttendingShortLectureI;
import studentOrientation.workshop.PickingGiftI;
import studentOrientation.workshop.SelectingCafeteriaI;
import studentOrientation.workshop.VisitSchoolBuildingI;
import studentOrientation.workshop.SchoolBuildingI;

/**
 * @author Abhi , Nagaraj
 *
 * Class where the user requirements are set
 */
public class MyCampusTour implements CampusTourI, ParameterI {

    private String cafeName = null;
    private String commute = null;
    private String lecture = null;
    private String gift = null;
    public String school = null;
    private int totalPlanDuration = 0;
    private int totalPlanCost = 0;
    private int totalPlanEffort = 0;
    private int totalPlanCarbon = 0;
    private SelectingCafeteriaI cafeI = null;
    private VisitSchoolBuildingI schoolI = null;
    private AttendingShortLectureI lectureI = null;
    private PickingGiftI giftI = null;
    private SchoolBuildingI buildingI = null;
    private CafeSimpleFactory cafeFactory = null;
    private GiftSimpleFactory giftFactory = null;
    private LectureSimpleFactory lectureFactory = null;
    private SchoolSimpleFactory schoolFactory = null;
    private SchoolTypeSimpleFactory schoolTypeFactory = null;


    public MyCampusTour() {

    }

    public MyCampusTour(EnumI event1, EnumI event2, EnumI event3, EnumI event4, EnumI event5) {

        ParameterMatcher parameterMatcher = new ParameterMatcher();

        parameterMatcher.match(this, event1);
        parameterMatcher.match(this, event2);
        parameterMatcher.match(this, event3);
        parameterMatcher.match(this, event4);
        parameterMatcher.match(this, event5);
        this.validator();
        cafeFactory = new CafeSimpleFactory();
        giftFactory = new GiftSimpleFactory();
        lectureFactory = new LectureSimpleFactory();
        schoolFactory = new SchoolSimpleFactory();
        schoolTypeFactory = new SchoolTypeSimpleFactory();
    }

    @Override
    public String toString() {
        return "MyCampusTour [cafeName=" + cafeName + ", commute=" + commute
                + ", lecture=" + lecture + ", gift=" + gift
                + ", totalPlanDuration=" + totalPlanDuration + ", cafeI="
                + cafeI + ", schoolI=" + schoolI + ", lectureI=" + lectureI
                + ", giftI=" + giftI + ", cafeFactory=" + cafeFactory
                + ", giftFactory=" + giftFactory + ", lectureFactory="
                + lectureFactory + ", schoolFactory=" + schoolFactory + "]";
    }

    private void validator(){
        if(getSchool() == null || getCommute() == null || getCafe() == null || getGift() == null || getLecture() == null){
            System.out.println("Chosen events not satisfied the Mandatory List ");
            System.exit(0);
        }
    }
    public String getSchool() {
        return school;
    }

    @Override
    public void setSchool(String school) {
        this.school = school;
    }


    public String getGift() {
        return gift;
    }
    @Override
    public void setGift(String gift) {
        this.gift = gift;
    }
    @Override
     public void setCafe(String name) {
        this.cafeName = name;
    }

    public String getCafe() {
        return this.cafeName;
    }
    @Override
    public void setCommute(String name) {
        this.commute = name;
    }

    public String getCommute() {
        return this.commute;
    }

    public String getLecture() {
        return lecture;
    }
    @Override
    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getTotalPlanDuration() {
        return totalPlanDuration;
    }

    public void setTotalPlanDuration(int totalPlanDuration) {
        this.totalPlanDuration = totalPlanDuration;
    }

    public int getTotalPlanCost() {
        return totalPlanCost;
    }

    public void setTotalPlanCost(int totalPlanCost) {
        this.totalPlanCost = totalPlanCost;
    }

    public int getTotalPlanEffort() {
        return totalPlanEffort;
    }

    public void setTotalPlanEffort(int totalPlanEffort) {
        this.totalPlanEffort = totalPlanEffort;
    }

    public int getTotalPlanCarbon() {
        return totalPlanCarbon;
    }

    public void setTotalPlanCarbon(int totalPlanCarbon) {
        this.totalPlanCarbon = totalPlanCarbon;
    }


    @Override
    public void buildPlanEstimate() {
        int duration, cost, effort, carbon;
        duration = this.getTotalPlanDuration() + cafeI.getDuration() + schoolI.getDuration() + lectureI.getDuration() + giftI.getDuration() + buildingI.getDuration();
        cost = this.getTotalPlanCost() + cafeI.getCost() + schoolI.getCost() + lectureI.getCost() + giftI.getCost() + buildingI.getCost();
        effort = this.getTotalPlanEffort() + cafeI.getEffort() + schoolI.getEffort() + lectureI.getEffort() + giftI.getEffort() + buildingI.getEffort();
        carbon = this.getTotalPlanCarbon() + cafeI.getCarbonFootprint() + schoolI.getCarbonFootprint() + lectureI.getCarbonFootprint() + giftI.getCarbonFootprint() + buildingI.getCarbonFootprint();
        System.out.println("Plan Duration == " + duration);
        System.out.println("Plan cost == " + cost);
        System.out.println("Plan effort == " + effort);
        System.out.println("Plan carbon == " + carbon);
        this.setTotalPlanDuration(duration);
        this.setTotalPlanCost(cost);
        this.setTotalPlanEffort(effort);
        this.setTotalPlanCarbon(carbon);
    }

    @Override
    public void buildPlanCafe() {
        cafeI = cafeFactory.createFactory(getCafe());
    }


    @Override
    public void buildPlanSchool() {
        schoolI = schoolFactory.createFactory(getCommute());
    }

    @Override
    public void buildPlanLecture() {
        lectureI = lectureFactory.createFactory(getLecture());
    }

    @Override
    public void buildPlanGift() {
        giftI = giftFactory.createFactory(getGift());
    }

    @Override
    public void buildPlanSchoolType() {
        buildingI = schoolTypeFactory.createFactory(getSchool());
    }


}
