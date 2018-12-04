package application;


public class AppliancesProject extends project { //still needs calculation for savings and such

	boolean myEStarRefrig;
	boolean myEStarDishWash; 
	boolean myEStarClothWash;
	boolean myEStarDryer;




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
		// do some math
		return 45;
	}

	private int calculateCost() {
		// do some math
		return 10000;
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
