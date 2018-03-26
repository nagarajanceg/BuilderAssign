package studentOrientation.util;

public class UserChoices {
    public  enum SchoolTypes{
        WATSON, SOM
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
        //SCHOOLVISIT(60),
        PICKGIFT(20),
        CAFECIW(60),
        CAFEMW(90),
        ONFOOT(50),
        BUSRIDE(100);

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
        CAFEMW(30),
        ONFOOT(50),
        BUSRIDE(100);
        private final int val ;
        Cost(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    public enum Effort{
        CAFECIW(200), //IN CALORIES
        CAFEMW(250),
        BUS(500),
        FOOT(100);
        private final int val ;
        Effort(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }

    }
    
    public enum Carbon{
        CAFECIW(200), //IN CALORIES
        CAFEMW(250),
        BUS(500),
        FOOT(20);
        private final int val ;
        Carbon(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    
}