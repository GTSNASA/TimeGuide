package timeSpending;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;


public class Main {
	private static User user;
	
	private static AOneTimeRequest aotr;
	
	private static Places places;
	
	private static PlacesList placesList;
	
	private static MarkOfPlace mop;

    public static void main(String[] args){



    	Map<Double, Integer> coefficient = new HashMap<Double, Integer>();

        coefficient.put(2.2, 5);
        coefficient.put(4.4, 4);
        coefficient.put(1.1, 1);
        coefficient.put(6.6, 6);
        coefficient.put(3.3, 3);
        coefficient.put(5.5, 5);
        coefficient.put(7.7, 7);
        coefficient.put(8.8, 8);


        System.out.println("Sorted");
        Map<String,String> sorted = placesList.sortPlaces(coefficient);

        for (Map.Entry entry : sorted.entrySet())
        {
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }
    }

    	/*String[][] m1= {{"Buritino","ave1234","Bar"},{"Cactus","ave123","Bar"},{"Samburero","ave12","Bar"},{"DownToMexico","ave13","Restaraunt"},{"Mafia","ave1311","Cafe"},{"Tetetetekila","ave13","Bar"}};
    	Integer[][] m2= {{23, 42, 32, 6, 12}, {13, 62, 54, 7, 30}, {44,33,23, 8, 5}, {69,54, 43, 8, 23}, {23,43,23, 8, 5}, {11,11, 41, 7, 233}};
    	setAotr( new AOneTimeRequest("Food","Bar","Mexican", 100, 43, 8, 7, 4, 44, 22));
    		
    	setUser(new User("Adebayor113", "Arsenal", 8, 6, 5, 7, 9, 10, 7, 3, 10, 5, 10, 7, 8, 10, 6, 10));
    			
    	setPlacesList(new PlacesList(4.3));
    				
    	setPlaces(new Places(23, 32, 43, 7, "Bar", "Buritino","redSocks", 2, 23));
    					
    	setMop(new MarkOfPlace(4));
    	
    	aotr.searchPlace("Food","Bar", 430, 43, 8, 7, 4,"Italic", 44, 22);
    	
    			for (int i=0;i<m1.length;i++){
    					places.selectTypeOfPlace(m1, m2, i);
    					 		if ( (aotr.getPrice() >= places.getPrice()) && ( aotr.getTypePlace() == places.getTypePlace())){
    					 				System.out.println(places.getNameOfPlace() +" "+places.getMarkPeople() +" " + placesList.calcDistance(aotr, places) + " " + placesList.calculateCoefficient(aotr, places));
    					 				coefficient.put(placesList.calculateCoefficient(aotr, places),i );
    					 				//System.out.println(coefficient.get(placesList.calculateCoefficient(aotr, places)));
    					 		}
    					 }
    	places.selectTypeOfPlace(m1, m2, 2);
    	System.out.println(places.getMark());
    	System.out.println( mop.calcNewMark(places, 8) + " " + places.getMarkPeople() );
    	System.out.println( mop.calcNewMark(places, 7)+ " " + places.getMarkPeople());*/
   // }

	public static AOneTimeRequest getAotr() {
		return aotr;
	}

	public static void setAotr(AOneTimeRequest aotr) {
		Main.aotr = aotr;
	}
	
	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		Main.user = user;
	}

	public static Places getPlaces() {
		return places;
	}

	public static void setPlaces(Places places) {
		Main.places = places;
	}

	public static PlacesList getPlacesList() {
		return placesList;
	}

	public static void setPlacesList(PlacesList placesList) {
		Main.placesList = placesList;
	}

	public static MarkOfPlace getMop() {
		return mop;
	}

	public static void setMop(MarkOfPlace mop) {
		Main.mop = mop;
	}
}
