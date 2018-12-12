/**
 * irrigation project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

public class IrrigationProject extends project {

	/** Cost of rain sensor. */
	private final static int SENSOR_COST = 70;
	
	/** Average annual cost of water in Tacoma. */
	private final static int WATER_COST = 380;
	
	/** Water cost savings of rain sensor. */
	private final static double PERCENT_SAVINGS = .45;
	
	/** Irrigation fields. */
	/**
	 * myIrrigation
	 */
	boolean myIrrigation;
	/**
	 * myIrrigationSensor
	 */
	boolean myIrrigationSensor;

	/**
	 * Constructor for Irrigation Project.
	 */
	public IrrigationProject() {
		super();
		
		name = "Irrigation";
		
		myIrrigation = myMainHome.isMyIrrigation();
		myIrrigationSensor = myMainHome.isMyIrrigationSensor();
		
		
		description = "Sometimes water doesn't fall from the sky. So instead, make it come from the ground so you can keep your lawn green"
				+ " and of course spray anyone walking by your house.";
		difficulty = 1;
		cost = calculateCost();
		savings = calculateSavings();

	}

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		int savings = 0;
		if (myIrrigation) {
			savings =(int) (WATER_COST * PERCENT_SAVINGS);
		}
		return savings;
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {
		int cost = 0;
		if (myIrrigation) {
			cost = SENSOR_COST;
		}
		return cost;
	}

	/**
	 * gets irrigation
	 * @return
	 */
	public boolean isMyIrrigation() {
		return myIrrigation;
	}

	/**
	 * sets irrigation
	 * @param myIrrigation
	 */
	public void setMyIrrigation(boolean myIrrigation) {
		this.myIrrigation = myIrrigation;
	}

	/**
	 * gets irrigation sensor
	 * @return
	 */
	public boolean isMyIrrigationSensor() {
		return myIrrigationSensor;
	}

	/**
	 * sets irrigation sensor
	 * @param myIrrigationSensor
	 */
	public void setMyIrrigationSensor(boolean myIrrigationSensor) {
		this.myIrrigationSensor = myIrrigationSensor;
	}

	
}
