package timeSpending;




public class User {

	  private String Login;

	  private String password;

	  private Integer markBar;

	  private Integer markCafe;

	  private Integer markRestaraunt;

	  private Integer markFastFood;

	  private Integer markBilliards;

	  private Integer markBowling;

	  private Integer markClub;

	  private Integer markTheatre;

	  private Integer markCinema;

	  private Integer markMuseum;

	  private Integer markFoodItaly;

	  private Integer markFoodFrance;

	  private Integer markFoodJapan;

	  private Integer markFoodChina;

	  private Integer markFoodEurope;

	  private Integer markFoodMexico;
	  
	  private Integer Visit [][];

	  public static void GetRegistration() {
	  }

	  public void logIn() {
		  String Log = "Patrick";
		  String Pass = "1234";
		  	
		  setLogin( Log );
		  setPassword( Pass );
		  System.out.print( getLogin() + getPassword());	
	  }

	  public void changeInformation() {
		  
	  }

    // GETTER & SETTER

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMarkBar() {
        return markBar;
    }

    public void setMarkBar(Integer markBar) {
        this.markBar = markBar;
    }

    public Integer getMarkCafe() {
        return markCafe;
    }

    public void setMarkCafe(Integer markCafe) {
        this.markCafe = markCafe;
    }

    public Integer getMarkRestaraunt() {
        return markRestaraunt;
    }

    public void setMarkRestaraunt(Integer markRestaraunt) {
        this.markRestaraunt = markRestaraunt;
    }

    public Integer getMarkFastFood() {
        return markFastFood;
    }

    public void setMarkFastFood(Integer markFastFood) {
        this.markFastFood = markFastFood;
    }

    public Integer getMarkBilliards() {
        return markBilliards;
    }

    public void setMarkBilliards(Integer markBilliards) {
        this.markBilliards = markBilliards;
    }

    public Integer getMarkBowling() {
        return markBowling;
    }

    public void setMarkBowling(Integer markBowling) {
        this.markBowling = markBowling;
    }

    public Integer getMarkClub() {
        return markClub;
    }

    public void setMarkClub(Integer markClub) {
        this.markClub = markClub;
    }

    public Integer getMarkTheatre() {
        return markTheatre;
    }

    public void setMarkTheatre(Integer markTheatre) {
        this.markTheatre = markTheatre;
    }

    public Integer getMarkCinema() {
        return markCinema;
    }

    public void setMarkCinema(Integer markCinema) {
        this.markCinema = markCinema;
    }

    public Integer getMarkMuseum() {
        return markMuseum;
    }

    public void setMarkMuseum(Integer markMuseum) {
        this.markMuseum = markMuseum;
    }

    public Integer getMarkFoodItaly() {
        return markFoodItaly;
    }

    public void setMarkFoodItaly(Integer markFoodItaly) {
        this.markFoodItaly = markFoodItaly;
    }

    public Integer getMarkFoodFrance() {
        return markFoodFrance;
    }

    public void setMarkFoodFrance(Integer markFoodFrance) {
        this.markFoodFrance = markFoodFrance;
    }

    public Integer getMarkFoodJapan() {
        return markFoodJapan;
    }

    public void setMarkFoodJapan(Integer markFoodJapan) {
        this.markFoodJapan = markFoodJapan;
    }

    public Integer getMarkFoodChina() {
        return markFoodChina;
    }

    public void setMarkFoodChina(Integer markFoodChina) {
        this.markFoodChina = markFoodChina;
    }

    public Integer getMarkFoodEurope() {
        return markFoodEurope;
    }

    public void setMarkFoodEurope(Integer markFoodEurope) {
        this.markFoodEurope = markFoodEurope;
    }

    public Integer getMarkFoodMexico() {
        return markFoodMexico;
    }

    public void setMarkFoodMexico(Integer markFoodMexico) {
        this.markFoodMexico = markFoodMexico;
    }
    /////////

	public User(String login, String password, Integer markBar,
			Integer markCafe, Integer markRestaraunt, Integer markFastFood,
			Integer markBilliards, Integer markBowling, Integer markClub,
			Integer markTheatre, Integer markCinema, Integer markMuseum,
			Integer markFoodItaly, Integer markFoodFrance,
			Integer markFoodJapan, Integer markFoodChina,
			Integer markFoodEurope, Integer markFoodMexico) {
		super();
		Login = login;
		this.password = password;
		this.markBar = markBar;
		this.markCafe = markCafe;
		this.markRestaraunt = markRestaraunt;
		this.markFastFood = markFastFood;
		this.markBilliards = markBilliards;
		this.markBowling = markBowling;
		this.markClub = markClub;
		this.markTheatre = markTheatre;
		this.markCinema = markCinema;
		this.markMuseum = markMuseum;
		this.markFoodItaly = markFoodItaly;
		this.markFoodFrance = markFoodFrance;
		this.markFoodJapan = markFoodJapan;
		this.markFoodChina = markFoodChina;
		this.markFoodEurope = markFoodEurope;
		this.markFoodMexico = markFoodMexico;
		
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public Integer[][] getVisit() {
		return Visit;
	}

	public void setVisit(Integer[][] visit) {
		Visit = visit;
	}
}
