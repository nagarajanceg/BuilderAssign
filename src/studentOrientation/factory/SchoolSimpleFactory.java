package studentOrientation.factory;

import studentOrientation.util.UserChoices;
import studentOrientation.workshop.BusRide;
import studentOrientation.workshop.OnFoot;
import studentOrientation.workshop.VisitSchoolBuildingI;

/**
 * @author Abhi, Nagaraj
 * <p>
 * Class to type of transportation to the school
 */
public class SchoolSimpleFactory {

    public SchoolSimpleFactory() {

    }

    @Override
    public String toString() {
        return "SchoolSimpleFactory [getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    /**
     * @param type - type of transportation to school
     * @return
     */
    public VisitSchoolBuildingI createFactory(String type) {
        if (type.equals(UserChoices.SchoolBuildingCommute.BUSRIDE.name())) {
            return new BusRide();
        } else if (type.equals(UserChoices.SchoolBuildingCommute.ONFOOT.name())) {
            new OnFoot();
        }
        return null;
    }


}
