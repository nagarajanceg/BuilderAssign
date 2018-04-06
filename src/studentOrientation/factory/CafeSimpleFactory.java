package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.CIW;
import studentOrientation.workshop.MountainView;
import studentOrientation.workshop.SelectingCafeteriaI;

/**
 * 
 * @author Abhi, Nagaraj
 *
 * Class to choose type of cafeteria 
 */
public class CafeSimpleFactory {
	
	public CafeSimpleFactory()
	{
		
	}
	
	@Override
	public String toString() {
		return "CafeSimpleFactory [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * 
	 * @param type - type of cafeteria
	 * @return 
	 */
    public SelectingCafeteriaI createFactory( String type) {
        if(type.equals(UserChoices.Cafe.MOUNTAINVIEW.name())){
            return  new MountainView();
        }else if (type.equals(UserChoices.Cafe.CIW.name())){
            return new CIW();
        }
        return null;
    }


}
