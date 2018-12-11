package application;

/**
 * Lightbult Project
 * @author richw253
 * @version Dec 6
 *
 */
public class LightBulbProject extends project {

	/** Average cost of lighting per year. */
	private static final int LIGHTING_COST = 150;
	
	/** Average cost of savings per year. */
	private static final int LIGHTING_SAVINGS = 45;
	
	/** Average cost of LED light. */
	private static final int LED_COST = 5;

	
	int numberOfBulbs;
	boolean myIncandLight;
	boolean myLEDLight;
	boolean myHalLight;
	boolean myFlorLight;



	public LightBulbProject() {
		super();
		
		name = "Lighting";
		
		numberOfBulbs = myMainHome.getMyTotalLight();
		myIncandLight = myMainHome.getMyIncandLight();
		myLEDLight = myMainHome.getMyLEDLight();
		myHalLight = myMainHome.getMyHalLight();
		myFlorLight = myMainHome.getMyFlorLight();
		description = "And on the 7th isle of Lowe's some kid in a red vest said \"LET THERE BE LIGHT\" Take some light bulbs out, put some new ones in, its darn simple";
		difficulty = 1;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		
		return LIGHTING_SAVINGS;
	}

	private int calculateCost() {

		return numberOfBulbs * LED_COST;
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
