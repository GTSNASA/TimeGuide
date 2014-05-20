package timeSpending;

public class PlacesEntertainment extends Places implements PlacesEntertainmentInterface {

    

// super for extends
    public PlacesEntertainment(Integer x, Integer y, Integer price, Integer mark, String typePlace, String nameOfPlace, String addressOfPlace, Integer id) {
        super(x, y, price, mark, typePlace, nameOfPlace, addressOfPlace, id, id);
    }





    private String timeSpendingInterval;
  

    // GETTER & SETTER

    public String getTimeSpendingInterval() {
        return timeSpendingInterval;
    }

    public void setTimeSpendingInterval(String timeSpendingInterval) {
        this.timeSpendingInterval = timeSpendingInterval;
    }
    /////////////////
}
