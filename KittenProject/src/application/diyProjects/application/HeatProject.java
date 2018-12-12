/**
 * Heat Project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;


public class HeatProject extends project {

	
	/** Price of EStar Gas Water Heater. */
	private static final int GAS_WATER_HEATER_COST = 900;
	
	/** Price of EStar High Efficiency Gas Furnace. */
	private static final int GAS_FURNACE_COST = 6000;
	
	/** Price of On-demand system. */
	private static final int ONDEMAND_COST = 3000;
	
	/** Average annual cost of heating water with electric water heater. */
	private static final int ELECT_WATER_HEAT_ENERGY_COST = 437;
	
	/** Average annual cost of gas water heater. */
	private static final int GAS_WATER_HEAT_ENERGY_COST = 164;
	
	/** Average annual cost of heating space with gas. */
	private static final int GAS_SPACE_HEAT_ENERGY_COST = 547;
	
	/** Average annual cost of heating space with electricity. */
	private static final int ELECT_SPACE_HEAT_ENERGY_COST = 838;
	
	/** Average annual cost of gas water heat on demand (tankless). */
	private static final int GAS_WATER_HEAT_ONDEMAND_ENERGY_COST = 102;

	/** Heating and cooling fields. */
	/**
	 * myMainHeatGas
	 */
	boolean myMainHeatGas; 
	/**
	 * myMainHeatElect
	 */
	boolean myMainHeatElect;
	/**
	 * myMainHeatRadiant
	 */
	boolean myMainHeatRadiant;
	/**
	 * myFurnanceMultStage
	 */
	boolean myFurnanceMultStage;
	/**
	 * myHouseFan
	 */
	boolean myHouseFan;
	/**
	 * myProgThermostat
	 */
	boolean myProgThermostat;

	/** Water Heater fields. * */
	/**
	 * myGasWaterHeater
	 */
	boolean myGasWaterHeater;
	/**
	 * myElectWaterHeat
	 */
	boolean myElectWaterHeat;
	/**
	 * myOnDemand
	 */
	boolean myOnDemand;
	/**
	 * myWaterHeaterAge
	 */
	int myWaterHeaterAge;


	/**
	 * project construtor
	 */
	public HeatProject() {
		super();
		
		name = "Heat";
		
		myMainHeatGas = theHome.isMyMainHeatGas();
		myMainHeatElect = theHome.isMyMainHeatElect();
		myMainHeatRadiant = theHome.isMyMainHeatRadiant();
		myFurnanceMultStage = theHome.isMyFurnanceMultStage();
		myHouseFan = theHome.isMyHouseFan();
		myProgThermostat = theHome.isMyProgThermostat();

		/** Water Heater fields. * */
		myGasWaterHeater = theHome.isMyGasWaterHeater();
		myElectWaterHeat = theHome.isMyElectWaterHeat();
		myOnDemand = theHome.isMyOnDemand();
		myWaterHeaterAge = theHome.getMyWaterHeaterAge();
		myMainHeatGas = myMainHome.isMyMainHeatGas();
		myMainHeatElect = myMainHome.isMyMainHeatElect();
		myMainHeatRadiant = myMainHome.isMyMainHeatRadiant();
		myFurnanceMultStage = myMainHome.isMyFurnanceMultStage();
		myHouseFan = myMainHome.isMyHouseFan();
		myProgThermostat = myMainHome.isMyProgThermostat();

		/** Water Heater fields. * */
		myGasWaterHeater = myMainHome.isMyGasWaterHeater();
		myElectWaterHeat = myMainHome.isMyElectWaterHeat();
		myOnDemand = myMainHome.isMyOnDemand();
		myWaterHeaterAge = myMainHome.getMyWaterHeaterAge();
		
		description = "Maybe its time to upgrade the ol' costly bundle of sticks you've been using for heat "
				+ "\nUpgrade your water heater from electric to EStar gas, or better yet install an on-demand "
				+ "gas water heating system.  You can also upgrade that electric baseboard to a gas forced air.";
		difficulty = 7;
		cost = calculateCost();
		savings = calculateSavings();

	}

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		int savings = 0;
		
		// getting a gas furnace;
		if (myMainHeatElect) {
			savings += (ELECT_SPACE_HEAT_ENERGY_COST - GAS_SPACE_HEAT_ENERGY_COST);
		}
		// getting a gas water heater
		if (myElectWaterHeat) {
			savings += (ELECT_WATER_HEAT_ENERGY_COST - GAS_WATER_HEAT_ENERGY_COST);
		}
		// getting an ondemand system
		if (myGasWaterHeater) {
			savings += (GAS_WATER_HEAT_ENERGY_COST - GAS_WATER_HEAT_ONDEMAND_ENERGY_COST);
		}
		return savings;
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {
		
		int cost = 0;
		if (myMainHeatElect) {
			cost += GAS_WATER_HEATER_COST;
		}
		if (myMainHeatElect) {
			cost += GAS_FURNACE_COST;
		}
		if (myGasWaterHeater) {
			cost += ONDEMAND_COST;
		}
		return cost;
	}

	/**
	 * gets gas heat
	 * @return
	 */
	public boolean isMyMainHeatGas() {
		return myMainHeatGas;
	}

	/**
	 * sets gas heat
	 * @param myMainHeatGas
	 */
	public void setMyMainHeatGas(boolean myMainHeatGas) {
		this.myMainHeatGas = myMainHeatGas;
	}

	/**
	 * gets elect heat
	 * @return
	 */
	public boolean isMyMainHeatElect() {
		return myMainHeatElect;
	}

	/**
	 * sets elect heat
	 * @param myMainHeatElect
	 */
	public void setMyMainHeatElect(boolean myMainHeatElect) {
		this.myMainHeatElect = myMainHeatElect;
	}

	/**
	 * gets rad heat
	 * @return
	 */
	public boolean isMyMainHeatRadiant() {
		return myMainHeatRadiant;
	}

	/**
	 * sets rad heat
	 * @param myMainHeatRadiant
	 */
	public void setMyMainHeatRadiant(boolean myMainHeatRadiant) {
		this.myMainHeatRadiant = myMainHeatRadiant;
	}

	/**
	 * gets multstage furnance
	 * @return
	 */
	public boolean isMyFurnanceMultStage() {
		return myFurnanceMultStage;
	}

	/**
	 * sets multstage furnance
	 * @param myFurnanceMultStage
	 */
	public void setMyFurnanceMultStage(boolean myFurnanceMultStage) {
		this.myFurnanceMultStage = myFurnanceMultStage;
	}

	/**
	 * gets house fan
	 * @return
	 */
	public boolean isMyHouseFan() {
		return myHouseFan;
	}

	/**
	 * sets house fan
	 * @param myHouseFan
	 */
	public void setMyHouseFan(boolean myHouseFan) {
		this.myHouseFan = myHouseFan;
	}

	/**
	 * gets prog thermo
	 * @return
	 */
	public boolean isMyProgThermostat() {
		return myProgThermostat;
	}

	/**
	 * sets prog thermo
	 * @param myProgThermostat
	 */
	public void setMyProgThermostat(boolean myProgThermostat) {
		this.myProgThermostat = myProgThermostat;
	}

	/**
	 * gets gas water heater
	 * @return
	 */
	public boolean isMyGasWaterHeater() {
		return myGasWaterHeater;
	}

	/**
	 * sets gas water heater
	 * @param myGasWaterHeater
	 */
	public void setMyGasWaterHeater(boolean myGasWaterHeater) {
		this.myGasWaterHeater = myGasWaterHeater;
	}

	/**
	 * gets elect water heat
	 * @return
	 */
	public boolean isMyElectWaterHeat() {
		return myElectWaterHeat;
	}

	/**
	 * sets elect water heat
	 * @param myElectWaterHeat
	 */
	public void setMyElectWaterHeat(boolean myElectWaterHeat) {
		this.myElectWaterHeat = myElectWaterHeat;
	}

	/**
	 * gets on demand 
	 * @return
	 */
	public boolean isMyOnDemand() {
		return myOnDemand;
	}

	/**
	 * sets on demand
	 * @param myOnDemand
	 */
	public void setMyOnDemand(boolean myOnDemand) {
		this.myOnDemand = myOnDemand;
	}

	/**
	 * gets water heater age
	 * @return int
	 */
	public int getMyWaterHeaterAge() {
		return myWaterHeaterAge;
	}

	/**
	 * sets water heater age
	 * @param myWaterHeaterAge
	 */
	public void setMyWaterHeaterAge(int myWaterHeaterAge) {
		this.myWaterHeaterAge = myWaterHeaterAge;
	}
	
	
	
}
