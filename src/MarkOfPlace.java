package timeSpending;

import java.util.Vector;

public class MarkOfPlace {

	  private Integer markUser;

	  public MarkOfPlace(Integer markUser) {
		super();
		this.markUser = markUser;
	}

	private Integer id;
	  

	    private Vector<String>  myPlacesList;

	  public Integer estimatePlace(Integer mark) {
		  
		  setMarkUser(mark);
		  return getMarkUser();
	  }

	  public int calcNewMark(Places Place, Integer mark) {
		  Place.setMarkPeople( Place.getMarkPeople() + 1 );
		  return  (estimatePlace(mark) + (Place.getMarkPeople()-1)*Place.getMark()) / ( Place.getMarkPeople()) ;
	  }

	  public void saveMark() {
	  }

	    // GETTER & SETTER

	    public Integer getMarkUser() {
	        return markUser;
	    }

	    public void setMarkUser(Integer markUser) {
	        this.markUser = markUser;
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
	    ////////////////////////////////////


	}

