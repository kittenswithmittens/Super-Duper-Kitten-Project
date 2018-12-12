/**
 * Appliance project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;


public class AppliancesProject extends project {


	/** Average EStar Refrigerator cost. */
	private static final int ESTAR_REFRIG_COST= 1000;
	
	/** Average EStar Dishwasher cost. */
	private static final int ESTAR_DISHWASH_COST = 500;
	
	/** Average EStar Clothes washer cost. */
	private static final int ESTAR_CLOTHESWASH_COST = 1100;
	
	/** Average EStar Dryer cost. */
	private static final int ESTAR_DRYER_COST = 700;
	
	/** Average EStar Refrigerator yearly savings. */
	private static final int ESTAR_REFRIG_SAVINGS = 54;
	
	/** Average EStar Dishwasher yearly savings. */
	private static final int ESTAR_DISHWASH_SAVINGS = 10;
	
	/** Average EStar Clothes washer yearly savings. */
	private static final int ESTAR_CLOTHESWASH_SAVINGS = 30;
	
	/** Average Estar Clothes drier yearly savings. */
	private static final int ESTAR_DRYER_SAVINGS = 20;
	
	/**
	 * myEStarRefrig
	 */
	boolean myEStarRefrig;
	/**
	 * myEStarDishWash
	 */
	boolean myEStarDishWash; 
	/**
	 * myEStarClothWash
	 */
	boolean myEStarClothWash;

	/**
	 * myEStarDryer
	 */
	boolean myEStarDryer;



	/**
	 * constructs a project
	 */
	public AppliancesProject() {
		super();
		
		name = "Appliances";
				
		
		myEStarRefrig = myMainHome.isMyEStarRefrig();
		myEStarDishWash = myMainHome.isMyEStarDishWash(); 
		myEStarClothWash = myMainHome.isMyEStarClothWash();
		myEStarDryer = myMainHome.isMyEStarDryer();
		
		description = "Does the Fidge leak water? Does the Dryer catch fire? Does your Stove still have last year's pumpkin pie baked into the burners? "
				+ "maybe it's time to get some new fancy appliances";
		difficulty = 2;
		cost = calculateCost();
		savings = calculateSavings();

	}

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {

		int savings = 0;
		if (!myEStarRefrig) {
			savings += ESTAR_REFRIG_SAVINGS;
		} 
		if (!myEStarDishWash) {
			savings += ESTAR_DISHWASH_SAVINGS;
		} 
		if (!myEStarClothWash) {
			savings += ESTAR_CLOTHESWASH_SAVINGS;
		} 
		if (!myEStarDryer) {
			savings += ESTAR_DRYER_SAVINGS;
		} 
		
		return savings;
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {
		int cost = 0;
		if (!myEStarRefrig) {
			cost += ESTAR_REFRIG_COST;
		} 
		if (!myEStarDishWash) {
			cost += ESTAR_DISHWASH_COST;
		} 
		if (!myEStarClothWash) {
			cost += ESTAR_CLOTHESWASH_COST;
		} 
		if (!myEStarDryer) {
			cost += ESTAR_DRYER_COST;
		}
		return cost;
	}

	/**
	 * gets fridge
	 * @return
	 */
	public boolean isMyEStarRefrig() {
		return myEStarRefrig;
	}

	/**
	 * set fridge
	 * @param myEStarRefrig
	 */
	public void setMyEStarRefrig(boolean myEStarRefrig) {
		this.myEStarRefrig = myEStarRefrig;
	}

	/**
	 * gets washer
	 * @return
	 */
	public boolean isMyEStarDishWash() {
		return myEStarDishWash;
	}

	/**
	 * sets washer
	 * @param myEStarDishWash
	 */
	public void setMyEStarDishWash(boolean myEStarDishWash) {
		this.myEStarDishWash = myEStarDishWash;
	}

	/**
	 * gets washer
	 * @return
	 */
	public boolean isMyEStarClothWash() {
		return myEStarClothWash;
	}

	/**
	 * sets washer
	 * @param myEStarClothWash
	 */
	public void setMyEStarClothWash(boolean myEStarClothWash) {
		this.myEStarClothWash = myEStarClothWash;
	}

	/**
	 * gets dryer
	 * @return
	 */
	public boolean isMyEStarDryer() {
		return myEStarDryer;
	}

	/**
	 * sets dryer
	 * @param myEStarDryer
	 */
	public void setMyEStarDryer(boolean myEStarDryer) {
		this.myEStarDryer = myEStarDryer;
	}

	
	
}
