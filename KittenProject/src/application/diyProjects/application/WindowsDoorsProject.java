package application;


public class WindowsDoorsProject extends project { //still needs calculation for savings and such
	
	/** Cost of weather-proofing external door. */
	private final static int DOOR_COST = 65;
	
	/** Cost of replacing window. */
	private final static int WINDOW_COST = 1000;
	
	/** Energy savings weather proofing. */
	private final static double WEATHER_PROOFING_PERCENT_SAVINGS = .11;

	/** Average annual cost of heating home. */
	private final static int HEATING_COST = 900;
	
	
	/** Windows and Door fields. */
	boolean myWeatherProofedDoor;
	int myNumWindow;
	int myNumWindowBad;
	int myNumWindowLowE;



	public WindowsDoorsProject() {
		super();
		
		name = "Windows and Doors";
		
		myWeatherProofedDoor = myMainHome.getMyWeatherProofedDoor();
		myNumWindow  = myMainHome.getMyNumWindow();
		myNumWindowBad = myMainHome.getMyNumWindowBad();
		myNumWindowLowE = myMainHome.getMyNumWindowLowE();
		
		description = "Windows are nice to see out of, Doors are nice to close. Just imagine if your house didnt have doors. Where would FedEx leave your package?";
		difficulty = 2;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		return (int) (HEATING_COST * WEATHER_PROOFING_PERCENT_SAVINGS);
	}

	private int calculateCost() {
		
		int cost = 0;
		if (!myWeatherProofedDoor) {
			cost += DOOR_COST * 2;
		}
		if (myNumWindowBad != 0) {
			cost += (myNumWindow - myNumWindowLowE) * WINDOW_COST;
		}
		return cost;
	}

	public void setMyWeatherProofedDoor(boolean myWeatherProofedDoor) {
		this.myWeatherProofedDoor = myWeatherProofedDoor;
	}

	public int getMyNumWindow() {
		return myNumWindow;
	}

	public void setMyNumWindow(int myNumWindow) {
		this.myNumWindow = myNumWindow;
	}

	public int getMyNumWindowBad() {
		return myNumWindowBad;
	}

	public void setMyNumWindowBad(int myNumWindowBad) {
		this.myNumWindowBad = myNumWindowBad;
	}

	public int getMyNumWindowLowE() {
		return myNumWindowLowE;
	}

	public void setMyNumWindowLowE(int myNumWindowLowE) {
		this.myNumWindowLowE = myNumWindowLowE;
	}

}
