package timeSpending;

import java.awt.*;

import java.util.Vector;




public class MapPlaces {

  private Integer x;

  private Integer y;

  private Integer id;

    private Vector<String>  myPlacesList;
    private Vector<String>  myAOneTimeRequest;
    

  public void markPlacesPoint() {
	  	
  }

  public void showMap(Graphics g) {
	  //BufferedImage img = ImageIO.read(Image("Map.gif")));
	  
	  Image img=null;
	g.drawImage(img, 0, 0, null );
  }

  public void showMe() {
  }

  public void showPlace(Places place) {
	  	
  }

    // GETTER & SETTER

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
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

    public Vector<String> getMyAOneTimeRequest() {
        return myAOneTimeRequest;
    }

    public void setMyAOneTimeRequest(Vector<String> myAOneTimeRequest) {
        this.myAOneTimeRequest = myAOneTimeRequest;
    }

   ///////////////////////
}
