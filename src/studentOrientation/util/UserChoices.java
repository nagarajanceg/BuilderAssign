package studentOrientation.util;

public class UserChoices {
    public  enum SchoolTypes{
        WWATSON, SOM
    }
    public enum SchoolBuildingCommute{
        BUSRIDE,ONFOOT
    }
    public enum GiftShop{
        EVENTCENTER, UU
    }
    public enum Cafe{
        CIW, MOUNTAINVIEW
    }
    public enum Lecture{
        CS240, CS350
    }
    public enum Duration{
        SCHOOLVISIT(60),
        PICKGIFT(20);
        private final int val ;
        Duration(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }

}
