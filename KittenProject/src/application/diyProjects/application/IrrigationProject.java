package application;


public class IrrigationProject extends project { //still needs calculation for savings and such

	/** Irrigation fields. */
	boolean myIrrigation;
	boolean myIrrigationSensor;



	public IrrigationProject() {
		super();
		
		name = "Irrigation";
		
		myIrrigation = theHome.isMyIrrigation();
		myIrrigationSensor = theHome.isMyIrrigationSensor();
		
		
		description = "Sometimes water doesn't fall from the sky. So instead, make it come from the ground so you can keep your lawn green"
				+ " and of course spray anyone walking by your house.";
		difficulty = 1;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		// do some math
		return 8;
	}

	private int calculateCost() {
		// do some math
		return 99;
	}

	public boolean isMyIrrigation() {
		return myIrrigation;
	}

	public void setMyIrrigation(boolean myIrrigation) {
		this.myIrrigation = myIrrigation;
	}

	public boolean isMyIrrigationSensor() {
		return myIrrigationSensor;
	}

	public void setMyIrrigationSensor(boolean myIrrigationSensor) {
		this.myIrrigationSensor = myIrrigationSensor;
	}

	
}
