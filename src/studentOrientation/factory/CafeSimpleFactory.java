package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.CIW;
import studentOrientation.workshop.MountainView;
import studentOrientation.workshop.SelectingCafeteriaI;

public class CafeSimpleFactory {
    public SelectingCafeteriaI createFactory( String type) {
        if(type.equals(UserChoices.Cafe.MOUNTAINVIEW.name())){
            return  new MountainView();
        }else if (type.equals(UserChoices.Cafe.CIW.name())){
            return new CIW();
        }
        return null;
    }
}
