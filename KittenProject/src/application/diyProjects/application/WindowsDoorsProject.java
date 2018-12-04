package application;


public class WindowsDoorsProject extends project { //still needs calculation for savings and such
	
	/** Windows and Door fields. */
	int myWeatherProofedDoor;
	int myNumWindow;
	int myNumWindowBad;
	int myNumWindowLowE;



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

	private int calculateSavings() {
		// do some math
		return 43;
	}

	private int calculateCost() {
		// do some math
		return 2500;
	}

	public int getMyWeatherProofedDoor() {
		return myWeatherProofedDoor;
	}

	public void setMyWeatherProofedDoor(int myWeatherProofedDoor) {
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
