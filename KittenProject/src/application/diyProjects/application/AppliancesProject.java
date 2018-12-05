package application;


public class AppliancesProject extends project { //still needs calculation for savings and such

	boolean myEStarRefrig;
	boolean myEStarDishWash; 
	boolean myEStarClothWash;
	boolean myEStarDryer;

	/** Average EStar Refrigerator cost. */
	int EStarRefrigCost = 1000;
	
	/** Average Estar Dishwasher cost. */
	int EStarDishWashCost = 500;
	
	/** Average Estar Clothes washer cost. */
	int EStarClothesWashCost = 1100;
	
	/** Average Estar Dryer cost. */
	int EStarDryerCost = 700;

	public AppliancesProject() {
		super();
		
		name = "Appliances";
				
		
		myEStarRefrig = theHome.isMyEStarRefrig();
		myEStarDishWash = theHome.isMyEStarDishWash(); 
		myEStarClothWash = theHome.isMyEStarClothWash();
		myEStarDryer = theHome.isMyEStarDryer();
		
		description = "Does the Fidge leak water? Does the Dryer catch fire? Does your Stove still have last year's pumpkin pie baked into the burners? "
				+ "maybe it's time to get some new fancy appliances";
		difficulty = 2;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {

		int savings = 0;
		if (!myEStarRefrig) {
			savings += 54;
		} 
		if (!myEStarDishWash) {
			savings += 10;
		} 
		if (!myEStarClothWash) {
			savings += 30;
		} 
		if (!myEStarDryer) {
			savings += 20;
		} 
		
		return savings;
	}

	private int calculateCost() {
		int cost = 0;
		if (!myEStarRefrig) {
			cost += EStarRefrigCost;
		} 
		if (!myEStarDishWash) {
			cost += EStarDishWashCost;
		} 
		if (!myEStarClothWash) {
			cost += EStarClothesWashCost;
		} 
		if (!myEStarDryer) {
			cost += EStarDryerCost;
		}
		return cost;
	}

	public boolean isMyEStarRefrig() {
		return myEStarRefrig;
	}

	public void setMyEStarRefrig(boolean myEStarRefrig) {
		this.myEStarRefrig = myEStarRefrig;
	}

	public boolean isMyEStarDishWash() {
		return myEStarDishWash;
	}

	public void setMyEStarDishWash(boolean myEStarDishWash) {
		this.myEStarDishWash = myEStarDishWash;
	}

	public boolean isMyEStarClothWash() {
		return myEStarClothWash;
	}

	public void setMyEStarClothWash(boolean myEStarClothWash) {
		this.myEStarClothWash = myEStarClothWash;
	}

	public boolean isMyEStarDryer() {
		return myEStarDryer;
	}

	public void setMyEStarDryer(boolean myEStarDryer) {
		this.myEStarDryer = myEStarDryer;
	}

	
	
}
