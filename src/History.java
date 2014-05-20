package timeSpending;

import java.util.Vector;

public class History {

	  private Integer visit;

	  private Integer id;

	    private Vector< String>  myPlacesList;


	  public void storeNumVisit() {
	  }

	  public Integer addVisit(User user) {
		  setVisit( getVisit() + 1);
		  return getVisit();
		  
	  }


	    // GETTER & SETTER

	    public Integer getVisit() {
	        return visit;
	    }

	    public void setVisit(Integer visit) {
	        this.visit = visit;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Vector<String> getMyPlacesList() {
	        return myPlacesList;
	    }

	    public void setMyPlacesList(Vector<String> myPlacesList) {
	        this.myPlacesList = myPlacesList;
	    }
	    ///////////////////////////////
	}
