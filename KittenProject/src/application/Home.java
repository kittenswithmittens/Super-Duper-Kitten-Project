/*
 * TCSS 360 
 * Fall 2018
 */

package application;

/**
 * This is the Home class for the kitten project. It's fields hold information
 * necessary to choose a home DIY project.
 * @author richw253
 */
public class Home {
	/** Costs of the home fields. */
	float myElectricBill;
	float myGasBill;
	float myWaterBill;
	
	/** Heating and cooling fields. */
	boolean myMainHeatGas;  // EnergyStar gas furnace will save $75 per year
	boolean myMainHeatElect;
	boolean myMainHeatRadiant;
	boolean myFurnanceMultStage;
	boolean myHouseFan;
	boolean myProgThermostat;
	
	/** Water Heater fields. */
	boolean myGasWaterHeater;
	boolean myElectWaterHeat;
	boolean myOnDemand;
	int myWaterHeaterAge;
	
	/** Lights within the home field. */
	int myTotalLight;
	int myIncandLight;
	int myLEDLight;
	int myHalLight;
	int myFlorLight;
	
	/** Electricity usage field. */
	boolean mySolarPanel;
	
	/** Windows and Door fields. */
	int myWeatherProofedDoor;
	int myNumWindow;
	int myNumWindowBad;
	int myNumWindowLowE;
	
	/** Insulations information fields. */
	boolean myInsulationWall;
	boolean myInsulationCeiling;
	boolean myInsulationFloor;
	
	/** Irrigation fields. */
	boolean myIrrigation;
	boolean myIrrigationSensor;
	
	/** Appliance fields. */
	boolean myEStarRefrig;
	boolean myEStarDishWash; // $35 per year to run. 250 gal. water saved per year
	boolean myEStarClothWash;
	boolean myEStarDryer;
}
