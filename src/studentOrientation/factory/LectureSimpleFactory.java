package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.AttendingShortLectureI;
import studentOrientation.workshop.Cs240;
import studentOrientation.workshop.Cs350;

public class LectureSimpleFactory {
    public AttendingShortLectureI createFactory(String type){
        if(type.equals(UserChoices.Lecture.CS240.name())){
            return new Cs240();
        }else if(type.equals(UserChoices.Lecture.CS350.name())){
            return new Cs350();
        }
        return null;
    }
}
