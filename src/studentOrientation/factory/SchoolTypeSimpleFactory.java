
package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.SchoolBuildingI;
import studentOrientation.workshop.Som;
import studentOrientation.workshop.Watson;

/**
 * 
 * @author Abhi, Nagaraj
 *
 * Class to type of the school
 */
public class SchoolTypeSimpleFactory {
	
	public SchoolTypeSimpleFactory()
	{
		
	}
	
	@Override
	public String toString() {
		return "SchoolTypeSimpleFactory [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public SchoolBuildingI createFactory(String type){
        if(type.equals(UserChoices.SchoolTypes.WATSON.name())){
            return new Watson();
        }else if(type.equals(UserChoices.SchoolTypes.SOM.name())){
            return new Som();
        }
        return null;
    }

	

}




