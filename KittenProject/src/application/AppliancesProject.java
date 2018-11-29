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
		
		description = "Appliances, replace em, feel good. ";
		difficulty = 2;
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
