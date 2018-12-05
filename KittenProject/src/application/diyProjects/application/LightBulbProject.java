package application;


public class LightBulbProject extends project { //still needs calculation for savings and such

	int numberOfBulbs;
	boolean myIncandLight;
	boolean myLEDLight;
	boolean myHalLight;
	boolean myFlorLight;



	public LightBulbProject() {
		super();
		
		name = "Lighting";
		
		numberOfBulbs = theHome.getMyTotalLight();
		myIncandLight = theHome.getMyIncandLight();
		myLEDLight = theHome.getMyLEDLight();
		myHalLight = theHome.getMyHalLight();
		myFlorLight = theHome.getMyFlorLight();
		description = "And on the 7th isle of Lowe's some kid in a red vest said \"LET THERE BE LIGHT\" Take some light bulbs out, put some new ones in, its darn simple";
		difficulty = 1;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		// do some math
		return 5;
	}

	private int calculateCost() {
		// do some math
		return 24;
	}

	public int getNumberOfBulbs() {
		return numberOfBulbs;
	}



	public void setNumberOfBulbs(int numberOfBulbs) {
		this.numberOfBulbs = numberOfBulbs;
	}



	public boolean getMyIncandLight() {
		return myIncandLight;
	}



	public void setMyIncandLight(boolean myIncandLight) {
		this.myIncandLight = myIncandLight;
	}



	public boolean getMyLEDLight() {
		return myLEDLight;
	}



	public void setMyLEDLight(boolean myLEDLight) {
		this.myLEDLight = myLEDLight;
	}



	public boolean getMyHalLight() {
		return myHalLight;
	}



	public void setMyHalLight(boolean myHalLight) {
		this.myHalLight = myHalLight;
	}



	public boolean getMyFlorLight() {
		return myFlorLight;
	}



	public void setMyFlorLight(boolean myFlorLight) {
		this.myFlorLight = myFlorLight;
	}
}
