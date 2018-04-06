package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.AttendingShortLectureI;
import studentOrientation.workshop.Cs240;
import studentOrientation.workshop.Cs350;

/**
 * 
 * @author Abhi , Nagaraj
 *
 * Class to choose the type of lecture
 */
public class LectureSimpleFactory {
	
	public LectureSimpleFactory()
	{
		
	}
	
	@Override
	public String toString() {
		return "LectureSimpleFactory [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	/**
	 * 
	 * @param type - type of lecture
	 * @return
	 */
    public AttendingShortLectureI createFactory(String type){
        if(type.equals(UserChoices.Lecture.CS240.name())){
            return new Cs240();
        }else if(type.equals(UserChoices.Lecture.CS350.name())){
            return new Cs350();
        }
        return null;
    }
    
}
