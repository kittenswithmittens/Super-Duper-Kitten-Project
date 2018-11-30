package application;

public class HeatProject extends project { //still needs calculation for savings and such

	/** Heating and cooling fields. */
	boolean myMainHeatGas; 
	boolean myMainHeatElect;
	boolean myMainHeatRadiant;
	boolean myFurnanceMultStage;
	boolean myHouseFan;
	boolean myProgThermostat;

	/** Water Heater fields. * */
	boolean myGasWaterHeater;
	boolean myElectWaterHeat;
	boolean myOnDemand;
	int myWaterHeaterAge;


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
		
		description = "upgrade some stuff yo";
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

	public boolean isMyMainHeatGas() {
		return myMainHeatGas;
	}

	public void setMyMainHeatGas(boolean myMainHeatGas) {
		this.myMainHeatGas = myMainHeatGas;
	}

	public boolean isMyMainHeatElect() {
		return myMainHeatElect;
	}

	public void setMyMainHeatElect(boolean myMainHeatElect) {
		this.myMainHeatElect = myMainHeatElect;
	}

	public boolean isMyMainHeatRadiant() {
		return myMainHeatRadiant;
	}

	public void setMyMainHeatRadiant(boolean myMainHeatRadiant) {
		this.myMainHeatRadiant = myMainHeatRadiant;
	}

	public boolean isMyFurnanceMultStage() {
		return myFurnanceMultStage;
	}

	public void setMyFurnanceMultStage(boolean myFurnanceMultStage) {
		this.myFurnanceMultStage = myFurnanceMultStage;
	}

	public boolean isMyHouseFan() {
		return myHouseFan;
	}

	public void setMyHouseFan(boolean myHouseFan) {
		this.myHouseFan = myHouseFan;
	}

	public boolean isMyProgThermostat() {
		return myProgThermostat;
	}

	public void setMyProgThermostat(boolean myProgThermostat) {
		this.myProgThermostat = myProgThermostat;
	}

	public boolean isMyGasWaterHeater() {
		return myGasWaterHeater;
	}

	public void setMyGasWaterHeater(boolean myGasWaterHeater) {
		this.myGasWaterHeater = myGasWaterHeater;
	}

	public boolean isMyElectWaterHeat() {
		return myElectWaterHeat;
	}

	public void setMyElectWaterHeat(boolean myElectWaterHeat) {
		this.myElectWaterHeat = myElectWaterHeat;
	}

	public boolean isMyOnDemand() {
		return myOnDemand;
	}

	public void setMyOnDemand(boolean myOnDemand) {
		this.myOnDemand = myOnDemand;
	}

	public int getMyWaterHeaterAge() {
		return myWaterHeaterAge;
	}

	public void setMyWaterHeaterAge(int myWaterHeaterAge) {
		this.myWaterHeaterAge = myWaterHeaterAge;
	}
	
	
	
}
