package timeSpending;

public class PlacesFood extends Places {

	// super for extends

   public PlacesFood(Integer x, Integer y, Integer price, Integer mark, String typePlace, String nameOfPlace, String addressOfPlace, Integer id) {
        super(x, y, price, mark, typePlace, nameOfPlace, addressOfPlace, id, id);
    }

    private String typeFood;


    //GETTER & SETTER

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
    ///////////////
}

	  

	  
	  
