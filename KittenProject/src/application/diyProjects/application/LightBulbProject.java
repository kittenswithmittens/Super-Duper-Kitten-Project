/**
 * Light bulb project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

public class LightBulbProject extends project {

	/** Average cost of lighting per year. */
	private static final int LIGHTING_COST = 150;
	
	/** Average cost of savings per year. */
	private static final int LIGHTING_SAVINGS = 45;
	
	/** Average cost of LED light. */
	private static final int LED_COST = 5;

	
	/**
	 * numberOfBulbs
	 */
	int numberOfBulbs;
	/**
	 * myIncandLight
	 */
	boolean myIncandLight;
	/**
	 * myLEDLight
	 */
	boolean myLEDLight;
	/**
	 * myHalLight
	 */
	boolean myHalLight;
	/**
	 * myFlorLight
	 */
	boolean myFlorLight;



	/**
	 * project constructor
	 */
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

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		
		return LIGHTING_SAVINGS;
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {

		return numberOfBulbs * LED_COST;
	}

	/**
	 * gets number of bulbs
	 * @return
	 */
	public int getNumberOfBulbs() {
		return numberOfBulbs;
	}



	/**
	 * sets number of bulbs
	 * @param numberOfBulbs
	 */
	public void setNumberOfBulbs(int numberOfBulbs) {
		this.numberOfBulbs = numberOfBulbs;
	}



	/**
	 * gets inc lights
	 * @return
	 */
	public boolean getMyIncandLight() {
		return myIncandLight;
	}



	/**
	 * sets inc lights
	 * @param myIncandLight
	 */
	public void setMyIncandLight(boolean myIncandLight) {
		this.myIncandLight = myIncandLight;
	}



	/**
	 * gets led light
	 * @return
	 */
	public boolean getMyLEDLight() {
		return myLEDLight;
	}



	/**
	 * set led light
	 * @param myLEDLight
	 */
	public void setMyLEDLight(boolean myLEDLight) {
		this.myLEDLight = myLEDLight;
	}



	/**
	 * get hal light
	 * @return
	 */
	public boolean getMyHalLight() {
		return myHalLight;
	}



	/**
	 * set hal light
	 * @param myHalLight
	 */
	public void setMyHalLight(boolean myHalLight) {
		this.myHalLight = myHalLight;
	}



	/**
	 * gets flor light
	 * @return
	 */
	public boolean getMyFlorLight() {
		return myFlorLight;
	}



	/**
	 * sets flor light
	 * @param myFlorLight
	 */
	public void setMyFlorLight(boolean myFlorLight) {
		this.myFlorLight = myFlorLight;
	}
}
