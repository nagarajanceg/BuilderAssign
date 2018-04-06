package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.EventCenter;
import studentOrientation.workshop.PickingGiftI;
import studentOrientation.workshop.UniversityUnion;

/**
 * 
 * @author Abhi, Nagaraj
 *
 * Class to choose where to shop for the gift
 */
public class GiftSimpleFactory {
	
	public GiftSimpleFactory()
	{
		
	}
	
	@Override
	public String toString() {
		return "GiftSimpleFactory [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * 
	 * @param type - type of location for gift shopping
	 * @return
	 */
    public PickingGiftI createFactory(String type){
        if(type.equals(UserChoices.GiftShop.EVENTCENTER.name())){
            return new EventCenter();
        }else if (type.equals(UserChoices.GiftShop.UU.name())){
            return new UniversityUnion();
        }
        return null;
    }

	
}
