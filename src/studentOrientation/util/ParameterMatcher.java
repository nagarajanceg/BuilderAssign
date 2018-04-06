package studentOrientation.util;

public class ParameterMatcher {

    public void match(ParameterI eventPlanner, EnumI param){
        if (param.getClass().isAssignableFrom(UserChoices.SchoolTypes.class)){
            eventPlanner.setSchool(param.toString());
        }
        if (param.getClass().isAssignableFrom(UserChoices.SchoolBuildingCommute.class)){
            eventPlanner.setCommute(param.toString());
        }
        if (param.getClass().isAssignableFrom(UserChoices.GiftShop.class)){
            eventPlanner.setGift(param.toString());
        }
        if (param.getClass().isAssignableFrom(UserChoices.Cafe.class)){
            eventPlanner.setCafe(param.toString());
        }
        if (param.getClass().isAssignableFrom(UserChoices.Lecture.class)){
            eventPlanner.setLecture(param.toString());
        }
    }
}
