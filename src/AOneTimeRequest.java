package timeSpending;
//import java.util.Vector;

public class AOneTimeRequest extends User {

	  private String typeTimespending;

	  private String typePlace;

	  private String typeFood;

	  private Integer distance;

	  private Integer markDistance;

	  private Integer price;

	  private Integer markPrice;

	  private Integer markMark;
	  
	  private Integer pointX = 3;
	  
	  private Integer 	pointY = 3;
	  
	   

	
	  public void searchPlace(String typeT, String typeP, Integer distan, Integer pric, Integer mm, Integer mp, Integer md, String tf, Integer x, Integer y) {
		 /* String typeT="Food";
		  String typeP="Bar";
		  Integer distan=400;
		  Integer pric = 43;
		  Integer mm = 8;
		  Integer mp = 7;
		  Integer md = 4;
		  String tf = "Mecixan";
		  Integer x = 44;
		  Integer y = 22;*/
		  setTypeTimespending(typeT);
		  setTypePlace(typeP);
		  setDistance(distan);
		  setPrice(pric);
		  setMarkMark(mm);
		  setMarkPrice(mp);
		  setMarkDistance(md);
		  setTypeFood(tf);
		  setPointX(x);
		  setPointY(y);
		 // map.showMe();
	  }

	  public void resetInformation() {
		  setTypeTimespending(null);
		  setTypePlace(null);
		  setDistance(null);
		  setPrice(null);
		  setMarkMark(null);
		  setMarkPrice(null);
		  setMarkDistance(null);
		  setTypeFood(null);
		  setPointX(null);
		  setPointY(null);
		  
	  }


	    public AOneTimeRequest(String typeTimespending, String typePlace,
			String typeFood, Integer distance, Integer markDistance,
			Integer price, Integer markPrice, Integer markMark, Integer pointX,
			Integer pointY) {
		super();
		this.typeTimespending = typeTimespending;
		this.typePlace = typePlace;
		this.typeFood = typeFood;
		this.distance = distance;
		this.markDistance = markDistance;
		this.price = price;
		this.markPrice = markPrice;
		this.markMark = markMark;
		this.pointX = pointX;
		this.pointY = pointY;
		
	}

		// GETTER & SETTER

	    public String getTypeTimespending() {
	        return typeTimespending;
	    }

	    public void setTypeTimespending(String typeTimespending) {
	        this.typeTimespending = typeTimespending;
	    }

	    public String getTypePlace() {
	        return typePlace;
	    }

	    public void setTypePlace(String typePlace) {
	        this.typePlace = typePlace;
	    }

	    public Integer getDistance() {
	        return distance;
	    }

	    public void setDistance(Integer distance) {
	        this.distance = distance;
	    }

	    public Integer getPrice() {
	        return price;
	    }

	    public void setPrice(Integer price) {
	        this.price = price;
	    }

	    public Integer getMarkMark() {
	        return markMark;
	    }

	    public void setMarkMark(Integer markMark) {
	        this.markMark = markMark;
	    }

	    public Integer getMarkPrice() {
	        return markPrice;
	    }

	    public void setMarkPrice(Integer markPrice) {
	        this.markPrice = markPrice;
	    }

	    public Integer getMarkDistance() {
	        return markDistance;
	    }

	    public void setMarkDistance(Integer markDistance) {
	        this.markDistance = markDistance;
	    }

	    public String getTypeFood() {
	        return typeFood;
	    }

	    public void setTypeFood(String typeFood) {
	        this.typeFood = typeFood;
	    }
	/* /////////////////////// */



		public Integer getPointX() {
			return pointX;
		}

		public void setPointX(Integer pointX) {
			this.pointX = pointX;
		}

		public Integer getPointY() {
			return pointY;
		}

		public void setPointY(Integer pointY) {
			this.pointY = pointY;
		}



	}


