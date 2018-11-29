package application;


public class InsulationProject extends project { //still needs calculation for savings and such
	/** Insulations information fields. */
	boolean myInsulationWall;
	boolean myInsulationCeiling;
	boolean myInsulationFloor;


	public InsulationProject() {
		super();
		
		name = "Insulation";
		
		myInsulationWall = theHome.isMyInsulationWall();
		myInsulationCeiling = theHome.isMyInsulationCeiling();
		myInsulationFloor = theHome.isMyInsulationFloor();
		
		description = "Brrrr.... could be even warmer in here, right?";
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

	public boolean isMyInsulationWall() {
		return myInsulationWall;
	}

	public void setMyInsulationWall(boolean myInsulationWall) {
		this.myInsulationWall = myInsulationWall;
	}

	public boolean isMyInsulationCeiling() {
		return myInsulationCeiling;
	}

	public void setMyInsulationCeiling(boolean myInsulationCeiling) {
		this.myInsulationCeiling = myInsulationCeiling;
	}

	public boolean isMyInsulationFloor() {
		return myInsulationFloor;
	}

	public void setMyInsulationFloor(boolean myInsulationFloor) {
		this.myInsulationFloor = myInsulationFloor;
	}

	
}
