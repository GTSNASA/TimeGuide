package timeSpending;
//import java.util.TreeMap;
import java.util.*;

public class PlacesList {

	  private Integer id;
	  
	  private Double distancePlace;
	  
		private static User user;
		
		private static AOneTimeRequest aotr;
		
		private static Places places;

   // Map<Double, Integer> coefficient = new HashMap<Double, Integer>();


	  /*  public static void main(String[] args){
	    	String[][] m1= {{"Cactus","ave123","Bar"},{"Cactus2","ave123","Bar"},{"Cactus3","ave123","Bar"}};
	    	Integer[][] m2= {{23, 42, 32, 6, 12}, {13, 62, 54, 7, 30}, {44,33,23, 8, 5}};
	    	setAotr( new AOneTimeRequest("Food","Bar","Mexican", 430, 43, 8, 7, 4, 44, 22));
	    	setUser(new User("Adebayor113", "Arsenal", 8, 6, 5, 7, 9, 10, 7, 3, 10, 5, 10, 7, 8, 10, 6, 10));
	    	setPlaces(new Places(23, 32, 43, 7, "Bar", "Buritino","redSocks", 2, 23));
	    	aotr.searchPlace("Food","Bar", 430, 43, 8, 7, 4,"Italic", 44, 22);
	    	places.selectTypeOfPlace(m1, m2, 1);
	    	System.out.print(places.getNameOfPlace()+places.getMarkPeople());
	    	places.selectTypeOfPlace(m1, m2, 2);
	    	System.out.print(places.getNameOfPlace()+places.getMarkPeople());
	    }
	      */
		
	  public void showList() {
	  }
	/*public static void main(String[] args){
		
			AOneTimeRequest oneRequest = new AOneTimeRequest();
			Places place = new Places();
			Double arrr = calcDistance(oneRequest, place);
			System.out.print(arrr);
		
		}*/
	
	  public PlacesList(Double distancePlace) {
		super();
		this.distancePlace = distancePlace;
	}

	public void showInformation() {
		  
	  }

	  public Map sortPlaces(Map coefficient /*Map<Double, Integer> map*/) {
          List list= new LinkedList(coefficient.entrySet());
          Collections.sort(list,new Comparator()
          {
              public int compare(Object obj1,Object obj2)
              {

                  return ((Comparable)((Map.Entry)(obj2)).getKey()).compareTo(((Map.Entry) (obj1)).getKey());
              }
          });

          Map sorted = new LinkedHashMap();
          for (Iterator it=list.iterator();it.hasNext();)
          {
              Map.Entry entry=(Map.Entry)it.next();
              sorted.put(entry.getKey(),entry.getValue());
          }
          return sorted;
      }


		 
		  

	  
	  public Double helpcalculate(Integer x,Integer y,Integer z,Integer a,Integer b) {
		  return (double) ((3*(double)x/(x+y+z))*(1-(a/b)));
	  }
 
	  
	  public Double helpcalculate1(Integer x,Integer y,Integer z,Double a,Integer b) {
		  return (double) ((3*(double)x/(x+y+z))*(1-(a/b)));
	  }

	  public Double calculateCoefficient(AOneTimeRequest AOneTimeRequest,Places Places) {
		  return ( helpcalculate(AOneTimeRequest.getMarkPrice(),AOneTimeRequest.getMarkMark(),AOneTimeRequest.getMarkDistance(), Places.getPrice(),AOneTimeRequest.getPrice())  +  
				  helpcalculate1(AOneTimeRequest.getMarkDistance(),AOneTimeRequest.getMarkPrice(),AOneTimeRequest.getMarkMark(), getDistancePlace(),AOneTimeRequest.getDistance()) + 
				  (((double)AOneTimeRequest.getMarkMark()*3) / (AOneTimeRequest.getMarkDistance()+AOneTimeRequest.getMarkPrice()+AOneTimeRequest.getMarkMark()))*Places.getMark()/10);
	  }

	  public void getPlace(MapPlaces map,Places place) {
		  	//showList();
		  	showInformation();
		  	
		  	map.showPlace(place);
	  }

	  public Double calcDistance(AOneTimeRequest oneRequest, Places place) {
		  try { oneRequest.getPointX();oneRequest.getPointY();
		 
		   setDistancePlace(10*Math.sqrt( (place.getX() - oneRequest.getPointX()) * (place.getX() - oneRequest.getPointX())  + ( place.getY() - oneRequest.getPointY()) * ( place.getY() - oneRequest.getPointY()))) ;
		  }
		   catch (NullPointerException e) { System.out.print("������� ���� ���������� ");}
		  return getDistancePlace();
	  }

    // GETTER & SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    ////////////////

	public Double getDistancePlace() {
		return distancePlace;
	}

	public  void setDistancePlace(double d) {
		this.distancePlace = d;
	}

	public static AOneTimeRequest getAotr() {
		return aotr;
	}

	public static void setAotr(AOneTimeRequest aotr) {
		PlacesList.aotr = aotr;
	}
	
	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		PlacesList.user = user;
	}

	public static Places getPlaces() {
		return places;
	}

	public static void setPlaces(Places places) {
		PlacesList.places = places;
	}
}
