package studentOrientation.util;

/**
 * 
 * @author Abhi , Nagaraj
 *
 * Class which has all the enums specified at one place
 */
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
    	WATSON(0), //newly added
    	SOM(0),		//newly added
        PICKGIFTEC(20),
        PICKGIFTUU(30),
        CAFECIW(60),
        CAFEMW(90),
        ONFOOT(50),
        BUSRIDE(100),
        CS350(120),
        CS240(120);

        private final int val ;
        Duration(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    public enum Cost{
    	
    	WATSON(0), //newly added
    	SOM(0),		//newly added
        CAFECIW(20),
        CAFEMW(30+(30*5/100)),
        ONFOOT(50),
        BUSRIDE(100),
        PICKGIFTEC(50),
        PICKGIFTUU(40),
        CS350(20),
        CS240(40+(40*10/100));
        private final int val ;
        Cost(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    public enum Effort{
    	WATSON(0), //newly added
    	SOM(0),		//newly added
        CAFECIW(200), //IN CALORIES
        CAFEMW(250),
        BUS(500),
        FOOT(100),
        PICKGIFTEC(300),
        PICKGIFTUU(400),
        CS350(20),
        CS240(40);
        private final int val ;
        Effort(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }

    }
    
    public enum Carbon{
    	WATSON(0), //newly added
    	SOM(0),		//newly added
        CAFECIW(200), //IN CALORIES
        CAFEMW(250),
        BUS(500),
        FOOT(20),
        PICKGIFTEC(150),
        PICKGIFTUU(140),
        CS350(20),
        CS240(40);
        private final int val ;
        Carbon(int i) {
            val = i;
        }
        public int getVal(){
            return val;
        }
    }
    
}