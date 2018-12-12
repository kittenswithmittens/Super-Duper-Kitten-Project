/**
 * Window and Door project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;


public class WindowsDoorsProject extends project { 
	
	/** Cost of weather-proofing external door. */
	private final static int DOOR_COST = 65;
	
	/** Cost of replacing window. */
	private final static int WINDOW_COST = 1000;
	
	/** Energy savings weather proofing. */
	private final static double WEATHER_PROOFING_PERCENT_SAVINGS = .11;

	/** Average annual cost of heating home. */
	private final static int HEATING_COST = 900;
	
	
	/** Windows and Door fields. */
	/**
	 * myWeatherProofedDoor
	 */
	boolean myWeatherProofedDoor;
	/**
	 * myNumWindow
	 */
	int myNumWindow;
	/**
	 * myNumWindowBad
	 */
	int myNumWindowBad;
	/**
	 * myNumWindowLowE
	 */
	int myNumWindowLowE;



	/**
	 * project constructor
	 */
	public WindowsDoorsProject() {
		super();
		
		name = "Windows and Doors";
		
		myWeatherProofedDoor = theHome.getMyWeatherProofedDoor();
		myNumWindow  = theHome.getMyNumWindow();
		myNumWindowBad = theHome.getMyNumWindowBad();
		myNumWindowLowE = theHome.getMyNumWindowLowE();
		
		description = "Windows are nice to see out of, Doors are nice to close. Just imagine if your house didnt have doors. Where would FedEx leave your package?";
		difficulty = 2;
		cost = calculateCost();
		savings = calculateSavings();

	}

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		return (int) (HEATING_COST * WEATHER_PROOFING_PERCENT_SAVINGS);
	}

	/**
	 * gets cost
	 * @return
	 */
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

	/**
	 * sets weather door
	 * @param myWeatherProofedDoor
	 */
	public void setMyWeatherProofedDoor(boolean myWeatherProofedDoor) {
		this.myWeatherProofedDoor = myWeatherProofedDoor;
	}

	/**
	 * gets number of windows
	 * @return
	 */
	public int getMyNumWindow() {
		return myNumWindow;
	}

	/**
	 * sets number of windows
	 * @param myNumWindow
	 */
	public void setMyNumWindow(int myNumWindow) {
		this.myNumWindow = myNumWindow;
	}

	/**
	 * get bad windows
	 * @return
	 */
	public int getMyNumWindowBad() {
		return myNumWindowBad;
	}

	/**
	 * set bad windows
	 * @param myNumWindowBad
	 */
	public void setMyNumWindowBad(int myNumWindowBad) {
		this.myNumWindowBad = myNumWindowBad;
	}

	/**
	 * get low E windows
	 * @return
	 */
	public int getMyNumWindowLowE() {
		return myNumWindowLowE;
	}

	/**
	 * set low E windows
	 * @param myNumWindowLowE
	 */
	public void setMyNumWindowLowE(int myNumWindowLowE) {
		this.myNumWindowLowE = myNumWindowLowE;
	}

}
