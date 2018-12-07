package application;


/**
 * Irrigation Project Class
 * @author richw253
 * @version 6 Dec 2018
 */
public class IrrigationProject extends project {

	/** Cost of rain sensor. */
	private final static int SENSOR_COST = 70;
	
	/** Average annual cost of water in Tacoma. */
	private final static int WATER_COST = 380;
	
	/** Water cost savings of rain sensor. */
	private final static double PERCENT_SAVINGS = .45;
	
	/** Irrigation fields. */
	boolean myIrrigation;
	boolean myIrrigationSensor;

	/**
	 * Constructor for Irrigation Project.
	 */
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
		int savings = 0;
		if (myIrrigation) {
			savings =(int) (WATER_COST * PERCENT_SAVINGS);
		}
		return savings;
	}

	private int calculateCost() {
		int cost = 0;
		if (myIrrigation) {
			cost = SENSOR_COST;
		}
		return cost;
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
