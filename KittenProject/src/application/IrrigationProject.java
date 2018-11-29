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
