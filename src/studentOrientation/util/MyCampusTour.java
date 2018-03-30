package studentOrientation.util;

import studentOrientation.factory.CafeSimpleFactory;
import studentOrientation.factory.GiftSimpleFactory;
import studentOrientation.factory.LectureSimpleFactory;
import studentOrientation.factory.SchoolSimpleFactory;
import studentOrientation.workshop.*;

public class MyCampusTour implements CampusTourI {

    private String cafeName = null;
    private String commute = null;
    private String lecture = null;
    private String gift = null;
    private int totalPlanDuration =0 ;
    private SelectingCafeteriaI cafeI = null;
    private VisitSchoolBuildingI schoolI = null;
    private AttendingShortLectureI lectureI = null;
    private PickingGiftI giftI = null;
    private CafeSimpleFactory cafeFactory = null;
    private GiftSimpleFactory giftFactory = null;
    private LectureSimpleFactory lectureFactory = null;
    private SchoolSimpleFactory schoolFactory = null;

    public MyCampusTour(UserChoices.SchoolTypes school,UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter, UserChoices.Cafe cafe,UserChoices.Lecture lectureIn) {
        cafeFactory = new CafeSimpleFactory();
        giftFactory = new GiftSimpleFactory();
        lectureFactory = new LectureSimpleFactory();
        schoolFactory = new SchoolSimpleFactory();
        this.setCafe(cafe.toString());
        this.setCommute(commute.toString());
        this.setLecture(lectureIn.toString());
        this.setGift(eventcenter.toString());
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


    @Override
    public void buildPlanEstimate(){
        int duration;
        duration= this.getTotalPlanDuration()+ cafeI.getDuration() +schoolI.getDuration()+lectureI.getDuration()+giftI.getDuration();
        System.out.println("Plan Duration == "+ duration);
        this.setTotalPlanDuration(duration);
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
}
