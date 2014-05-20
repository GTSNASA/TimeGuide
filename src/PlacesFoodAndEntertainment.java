package timeSpending;

public class PlacesFoodAndEntertainment extends PlacesFood implements PlacesEntertainmentInterface {



	  public PlacesFoodAndEntertainment(Integer x, Integer y, Integer price,
			Integer mark, String typePlace, String nameOfPlace,
			String addressOfPlace, Integer id) {
		super(x, y, price, mark, typePlace, nameOfPlace, addressOfPlace, id);
		// TODO Auto-generated constructor stub
	}

	private String nameOfTypeUnionPlaces;

    //GETTER & SETTER


    public String getNameOfTypeUnionPlaces() {
        return nameOfTypeUnionPlaces;
    }

    public void setNameOfTypeUnionPlaces(String nameOfTypeUnionPlaces) {
        this.nameOfTypeUnionPlaces = nameOfTypeUnionPlaces;
    }
    /////////////////

	@Override
	public String getTimeSpendingInterval() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTimeSpendingInterval(String timeSpendingInterval/*, PlacesEntertainment placesE*/) {
		// TODO Auto-generated method stub
		
	}

}
