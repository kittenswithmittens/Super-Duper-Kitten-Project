package application;


/**
 * Thermostat project
 * @author richw253
 * @version Dec 6
 */
public class ThermostatProject extends project{
	
	/** Cost of programmable thermostat. */
	private static final int THERMOSTAT_COST = 120;
	
	/** Percentage of savings when using thermostat. */
	private static final double THERMOSTAT_PERCENT_SAVINGS = 0.1;
	
	/** Annual average heating cost of house. */
	private static final int ANNUAL_HEATING_COST = 2200;
	
	/** Thermostat field. */
	boolean myProgThermostat;
	
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
	
	private int calculateSavings() {
		return (int) (ANNUAL_HEATING_COST * THERMOSTAT_PERCENT_SAVINGS);
	}

	private int calculateCost() {
		return THERMOSTAT_COST;
	}
	
	
	
}
