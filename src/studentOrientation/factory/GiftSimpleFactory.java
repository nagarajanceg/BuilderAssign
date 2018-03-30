package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.EventCenter;
import studentOrientation.workshop.PickingGiftI;
import studentOrientation.workshop.UniversityUnion;

public class GiftSimpleFactory {
    public PickingGiftI createFactory(String type){
        if(type.equals(UserChoices.GiftShop.EVENTCENTER.name())){
            return new EventCenter();
        }else if (type.equals(UserChoices.GiftShop.UU.name())){
            return new UniversityUnion();
        }
        return null;
    }
}
