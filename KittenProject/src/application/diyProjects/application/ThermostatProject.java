/**
 * Thermostat project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

public class ThermostatProject extends project{
	
	/** Cost of programmable thermostat. */
	private static final int THERMOSTAT_COST = 120;
	
	/** Percentage of savings when using thermostat. */
	private static final double THERMOSTAT_PERCENT_SAVINGS = 0.1;
	
	/** Annual average heating cost of house. */
	private static final int ANNUAL_HEATING_COST = 2200;
	
	/** Thermostat field. */
	boolean myProgThermostat;
	
	/**
	 * project constructor
	 */
	public ThermostatProject () {
		super();
		
		name = "Thermostat";
		
		myProgThermostat = theHome.isMyProgThermostat();
		
		description = "Do you like it cold when you sleep, but warm and toastie when you wake?"
				+ "\nWill you be gone from home for a bit and just need your pipes not to freeze. ";
		difficulty = 2;
		cost = calculateCost();
		savings = calculateSavings();
		
		
	}
	
	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		return (int) (ANNUAL_HEATING_COST * THERMOSTAT_PERCENT_SAVINGS);
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {
		return THERMOSTAT_COST;
	}
	
	
	
}
