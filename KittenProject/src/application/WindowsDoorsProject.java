package application;


public class WindowsDoorsProject extends project { //still needs calculation for savings and such
	
	/** Windows and Door fields. */
	int myWeatherProofedDoor;
	int myNumWindow;
	int myNumWindowBad;
	int myNumWindowLowE;



	public WindowsDoorsProject() {
		super();
		
		name = "Window and Door";
		
		myWeatherProofedDoor = theHome.getMyWeatherProofedDoor();
		myNumWindow  = theHome.getMyNumWindow();
		myNumWindowBad = theHome.getMyNumWindowBad();
		myNumWindowLowE = theHome.getMyNumWindowLowE();
		
		description = "Windows are nice to see out of";
		difficulty = 1;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		// do some math
		return 0;
	}

	private int calculateCost() {
		// do some math
		return 0;
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
