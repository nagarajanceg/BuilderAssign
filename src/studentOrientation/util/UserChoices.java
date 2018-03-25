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
        PICKGIFT(20),
        CAFE(60);
        private final int val ;
        Duration(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    public enum Cost{
        CAFECIW(20),
        CAFEMW(30);
        private final int val ;
        Cost(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }

}