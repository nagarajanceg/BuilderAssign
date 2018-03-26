package studentOrientation.util;

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

    public MyCampusTour(UserChoices.SchoolTypes school,UserChoices.SchoolBuildingCommute commute, UserChoices.GiftShop eventcenter, UserChoices.Cafe cafe,UserChoices.Lecture lectureIn) {
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
        System.out.println("value jkjfd::"+giftI);
        duration= this.getTotalPlanDuration()+ cafeI.getDuration() +schoolI.getDuration()+lectureI.getDuration()+giftI.getDuration();
        System.out.println("Plan Duration == "+ duration);
        this.setTotalPlanDuration(duration);
    }
    @Override
    public void buildPlanCafe(){
        System.out.println("value::"+UserChoices.Cafe.CIW.name());
        if(cafeName.equals(UserChoices.Cafe.CIW.toString())){
            cafeI = new CIW();
            System.out.println(cafeI.getDuration() + " "+ cafeI.getCost());
        }else if(cafeName.equals(UserChoices.Cafe.MOUNTAINVIEW.toString())){
            cafeI = new MountainView();
            System.out.println(cafeI.getDuration() + " "+ cafeI.getCost());
        }
    }

	@Override
	public void buildPlanSchool() {
		 System.out.println("value::"+UserChoices.SchoolBuildingCommute.BUSRIDE.name());
		 System.out.println(commute);
	        if(commute.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.name())){
	        	System.out.println("inside");
	            schoolI = new BusRide();
	            System.out.println(schoolI.getDuration() + " "+ schoolI.getCost());
	        }
	        else if(commute.equals(UserChoices.SchoolBuildingCommute.ONFOOT.name())){
	            schoolI = new OnFoot();
	            System.out.println(schoolI.getDuration() + " "+ schoolI.getCost());
	        } 
		
	}

	@Override
	public void buildPlanLecture() {
		System.out.println("value in lec::"+UserChoices.Lecture.CS240.name());
	        if(lecture.equals(UserChoices.Lecture.CS240.name())){
	            lectureI = new Cs240();
	            System.out.println(lectureI.getDuration() + " "+ lectureI.getCost());
	        }
	        else if(lecture.equals(UserChoices.Lecture.CS350.name())) {
                lectureI = new Cs350();
                System.out.println(lectureI.getDuration() + " " + lectureI.getCost());
            }
	}

    @Override
    public void buildPlanGift() {
        System.out.println("value in lec::"+UserChoices.Duration.PICKGIFTEC.name());
        if(gift.equals(UserChoices.GiftShop.EVENTCENTER.name())){
            giftI = new EventCenter();
            System.out.println(giftI.getDuration() + " "+ giftI.getCost());
        }
        else if(gift.equals(UserChoices.GiftShop.UU.name())) {
            giftI = new UniversityUnion();
            System.out.println(giftI.getDuration() + " " + giftI.getCost());
        }
    }
}
