package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.BusRide;
import studentOrientation.workshop.OnFoot;
import studentOrientation.workshop.VisitSchoolBuildingI;

public class SchoolSimpleFactory {
    public VisitSchoolBuildingI createFactory(String type){
        if(type.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.name())){
            return new BusRide();
        }else if(type.equals(UserChoices.SchoolBuildingCommute.ONFOOT.name())){
            new OnFoot();
        }
        return null;
    }
}
