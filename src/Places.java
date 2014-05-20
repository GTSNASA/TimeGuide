package timeSpending;

public class Places {

	  private Integer x = 10;

	  private Integer y = 10;

	  private Integer price;

	  private Integer mark;
	  
	  private Integer markPeople;

	  private String typePlace;

	  private String nameOfPlace;

	  private String addressOfPlace;

	  private Integer id;

  // Constructor

  public Places(Integer x, Integer y, Integer price, Integer mark, String typePlace, String nameOfPlace, String addressOfPlace, Integer id, Integer markPeople) {
      this.x = x;
      this.y = y;
      this.price = price;
      this.mark = mark;
      this.typePlace = typePlace;
      this.nameOfPlace = nameOfPlace;
      this.addressOfPlace = addressOfPlace;
      this.id = id;
      this.markPeople= markPeople;
  }
  public void storePlace() {
	  }
  
  public void selectTypeOfPlace(String[][] Places1, Integer[][] Places2, Integer idp) {
	  		setNameOfPlace(Places1[idp][0]);
	  		setAddressOfPlace(Places1[idp][1]);
	  		setTypePlace(Places1[idp][2]);
	  		setX(Places2[idp][0]);
	  		setY(Places2[idp][1]);
	  		setPrice(Places2[idp][2]);
	  		setMark(Places2[idp][3]);
	  		setMarkPeople(Places2[idp][4]);
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

  public Integer getPrice() {
      return price;
  }

  public void setPrice(Integer price) {
      this.price = price;
  }

  public Integer getMark() {
      return mark;
  }

  public void setMark(Integer mark) {
      this.mark = mark;
  }

  public String getTypePlace() {
      return typePlace;
  }

  public void setTypePlace(String typePlace) {
      this.typePlace = typePlace;
  }

  public String getNameOfPlace() {
      return nameOfPlace;
  }

  public void setNameOfPlace(String nameOfPlace) {
      this.nameOfPlace = nameOfPlace;
  }

  public String getAddressOfPlace() {
      return addressOfPlace;
  }

  public void setAddressOfPlace(String addressOfPlace) {
      this.addressOfPlace = addressOfPlace;
  }

  public Integer getId() {
      return id;
  }

  public void setId(Integer id) {
      this.id = id;
  }
  /////////////////////////////////
public Integer getMarkPeople() {
	return markPeople;
}
public void setMarkPeople(Integer markPeople) {
	this.markPeople = markPeople;
}
}
