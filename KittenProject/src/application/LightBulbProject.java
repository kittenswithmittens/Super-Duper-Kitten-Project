package application;


public class LightBulbProject extends project { //still needs calculation for savings and such

	int numberOfBulbs;
	int myIncandLight;
	int myLEDLight;
	int myHalLight;
	int myFlorLight;



	public LightBulbProject() {
		super();
		
		name = "Lighting";
		
		numberOfBulbs = theHome.getMyTotalLight();
		myIncandLight = theHome.getMyIncandLight();
		myLEDLight = theHome.getMyLEDLight();
		myHalLight = theHome.getMyHalLight();
		myFlorLight = theHome.getMyFlorLight();
		description = "Take some light bulbs out, put some new ones in, its darn simple";
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

	public int getNumberOfBulbs() {
		return numberOfBulbs;
	}



	public void setNumberOfBulbs(int numberOfBulbs) {
		this.numberOfBulbs = numberOfBulbs;
	}



	public int getMyIncandLight() {
		return myIncandLight;
	}



	public void setMyIncandLight(int myIncandLight) {
		this.myIncandLight = myIncandLight;
	}



	public int getMyLEDLight() {
		return myLEDLight;
	}



	public void setMyLEDLight(int myLEDLight) {
		this.myLEDLight = myLEDLight;
	}



	public int getMyHalLight() {
		return myHalLight;
	}



	public void setMyHalLight(int myHalLight) {
		this.myHalLight = myHalLight;
	}



	public int getMyFlorLight() {
		return myFlorLight;
	}



	public void setMyFlorLight(int myFlorLight) {
		this.myFlorLight = myFlorLight;
	}
}
