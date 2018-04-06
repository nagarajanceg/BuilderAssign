package studentOrientation.util;

import studentOrientation.factory.CafeSimpleFactory;
import studentOrientation.factory.GiftSimpleFactory;
import studentOrientation.factory.LectureSimpleFactory;
import studentOrientation.factory.SchoolSimpleFactory;
import studentOrientation.factory.SchoolTypeSimpleFactory;
import studentOrientation.workshop.*;

/**
 * 
 * @author Abhi , Nagaraj
 *
 * Class where the user requirements are set
 */
public class MyCampusTour implements CampusTourI {

    private String cafeName = null;
    private String commute = null;
    private String lecture = null;
    private String gift = null;
    private String school = null; //newly added
    private int totalPlanDuration =0 ;
    private int totalPlanCost= 0; //newly added
    private int totalPlanEffort = 0; //newly added
    private int totalPlanCarbon = 0; //newly added
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

    
    public MyCampusTour()
    {
    	
    }
    
    public MyCampusTour(UserChoices.SchoolTypes school,UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter, UserChoices.Cafe cafe,UserChoices.Lecture lectureIn) {
        cafeFactory = new CafeSimpleFactory();
        giftFactory = new GiftSimpleFactory();
        lectureFactory = new LectureSimpleFactory();
        schoolFactory = new SchoolSimpleFactory();
        schoolTypeFactory = new SchoolTypeSimpleFactory(); //newly added
        this.setSchool(school.toString()); //newly added
        this.setCafe(cafe.toString());
        this.setCommute(commute.toString());
        this.setLecture(lectureIn.toString());
        this.setGift(eventcenter.toString());
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
    
   //newly added 
    public String getSchool() {
		return school;
	}

    //newly added
	public void setSchool(String school) {
		this.school = school;
	}
    
    
    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    private void setCafe(String name){
        this.cafeName = name;
    }
    public String getCafe(){
        return this.cafeName;
    }
    private void setCommute(String name){
        this.commute = name;
    }
    public String getCommute(){
        return this.commute;
    }

    public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
    public int getTotalPlanDuration() {
        return totalPlanDuration;
    }

    public void setTotalPlanDuration(int totalPlanDuration) {
        this.totalPlanDuration = totalPlanDuration;
    }

    public int getTotalPlanCost() { //newly added
		return totalPlanCost;
	}

	public void setTotalPlanCost(int totalPlanCost) {//newly added
		this.totalPlanCost = totalPlanCost;
	}

	public int getTotalPlanEffort() {//newly added
		return totalPlanEffort;
	}

	public void setTotalPlanEffort(int totalPlanEffort) {//newly added
		this.totalPlanEffort = totalPlanEffort;
	}

	public int getTotalPlanCarbon() {//newly added
		return totalPlanCarbon;
	}

	public void setTotalPlanCarbon(int totalPlanCarbon) {//newly added
		this.totalPlanCarbon = totalPlanCarbon;
	}


    @Override
    public void buildPlanEstimate(){
        int duration, cost, effort, carbon;
        duration = this.getTotalPlanDuration()+ cafeI.getDuration() +schoolI.getDuration()+lectureI.getDuration()+giftI.getDuration()+ buildingI.getDuration();
        cost = this.getTotalPlanCost()+cafeI.getCost()+schoolI.getCost()+lectureI.getCost()+giftI.getCost()+ buildingI.getCost(); 
        effort = this.getTotalPlanEffort()+cafeI.getEffort()+schoolI.getEffort()+lectureI.getEffort()+giftI.getEffort()+ buildingI.getEffort(); 
        carbon = this.getTotalPlanCarbon()+cafeI.getCarbonFootprint()+schoolI.getCarbonFootprint()+lectureI.getCarbonFootprint()+giftI.getCarbonFootprint()+ buildingI.getCarbonFootprint();
        System.out.println("Plan Duration == "+ duration);
        System.out.println("Plan cost == "+ cost);
        System.out.println("Plan effort == "+ effort);
        System.out.println("Plan carbon == "+ carbon);
        this.setTotalPlanDuration(duration);
        this.setTotalPlanCost(cost); //newly added
        this.setTotalPlanEffort(effort); //newly added
        this.setTotalPlanCarbon(carbon); //newly added
    }
    @Override
    public void buildPlanCafe(){
        cafeI = cafeFactory.createFactory(cafeName);
        System.out.println("cafe Duration and cost" +cafeI.getDuration() + " "+ cafeI.getCost());
    }

    
	@Override
	public void buildPlanSchool() {
        schoolI = schoolFactory.createFactory(commute);
        System.out.println(schoolI.getDuration() + " "+ schoolI.getCost());
	}

	@Override
	public void buildPlanLecture() {
		lectureI = lectureFactory.createFactory(lecture);
        System.out.println(lectureI.getDuration() + " "+ lectureI.getCost());
	}

    @Override
    public void buildPlanGift() {
        giftI = giftFactory.createFactory(gift);
        System.out.println(giftI.getDuration() + " "+ giftI.getCost());
    }

    @Override
   	public void buildPlanSchoolType() { //newly added
           buildingI = schoolTypeFactory.createFactory(school);
           System.out.println(buildingI.getDuration() + " "+ buildingI.getCost());
   	}

	
	
}
