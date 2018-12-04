/*
 * TCSS 360
 * Fall 2018
 */
//editeds
package application;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Random;

/**
 * Add code to support a default home 
 * 
 * 
 * 
 * This is the Home class for the kitten project. It's fields hold information
 * necessary to choose a home DIY project.
 * 
 * @author richw253
 * @author Isaiah Miller
 */
public class Home implements Exportable {
	public static final String HOME_PATH = "save" + File.separatorChar + "home.json";

	/** Costs of the home fields. */
	float myElectricBill;
	float myGasBill;
	float myWaterBill;

	/** Heating and cooling fields. */
	boolean myMainHeatGas; // EnergyStar gas furnace will save $75 per year
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

//	private final ObjectMapper myMapper;
//	private final ObjectReader myReader;
//	private final ObjectWriter myWriter;
	
	private final Exporter myExporter;

	/**
	 * @author Isaiah Miller
	 */
	public Home() {
//		//sets up JSON object mapper
//		myMapper = new ObjectMapper();
//		myReader = myMapper.readerForUpdating(this);
//		myWriter = myMapper.writerWithDefaultPrettyPrinter();
//		
//		//initializes home from save file
//		importHome();
		
		myExporter = new Exporter(this);
		
		//fields should only be initialized through importing

	}

	
	/**
	 * This method produceds a home with random values and exports it to a default save file.
	 * @author Isaiah Miller
	 * @param isDefault this paramater is ignored. 
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public Home(final boolean isDefault) throws IllegalArgumentException, IllegalAccessException {
		myExporter = new Exporter(this);
		final Field[] fields = this.getClass().getDeclaredFields();
		final Class<Boolean> boolClass = Boolean.TYPE;
		final int spreadRandInt = 10000;
		final int spreadRandFloat = 10000;
		for(Field field: fields) {
			final Random rand = new Random();
			//System.out.println(field.getType());
			if(field.getType().equals(Boolean.TYPE)) {
				field.set(this, rand.nextBoolean());
				System.out.println("is a boolean");
			} else if (field.getType().equals(Integer.TYPE)) {
				field.set(this, rand.nextInt(spreadRandInt));
				System.out.println("is an int");
			} else if(field.getType().equals(Float.TYPE)) {
				field.set(this, rand.nextFloat() * spreadRandFloat);
				System.out.println("is a float");
			} else {
				System.out.print("Not a match: " + field.getType());
				System.out.println();
			}
			System.out.println(field.get(this));
			}
		File test = new File("");
		
		System.out.println("path is: " + test.getAbsolutePath());
		exportJSON(new File("src" + File.separatorChar + "application" + File.separatorChar + "save" + File.separatorChar + "homeDefault.json"));
		
	}
	
	public float getMyElectricBill() {
		return myElectricBill;
	}

	public void setMyElectricBill(float myElectricBill) {
		this.myElectricBill = myElectricBill;
	}

	public float getMyGasBill() {
		return myGasBill;
	}

	public void setMyGasBill(float myGasBill) {
		this.myGasBill = myGasBill;
	}

	public float getMyWaterBill() {
		return myWaterBill;
	}

	public void setMyWaterBill(float myWaterBill) {
		this.myWaterBill = myWaterBill;
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

	public int getMyTotalLight() {
		return myTotalLight;
	}

	public void setMyTotalLight(int myTotalLight) {
		this.myTotalLight = myTotalLight;
	}

	public int getMyIncandLight() {
		return myIncandLight;
	}

	public void setMyIncandLight(int myIncandLight) {
		this.myIncandLight = myIncandLight;
	}

	public int getMyLEDLight() {
		return myLEDLight;
	}

	public void setMyLEDLight(int myLEDLight) {
		this.myLEDLight = myLEDLight;
	}

	public int getMyHalLight() {
		return myHalLight;
	}

	public void setMyHalLight(int myHalLight) {
		this.myHalLight = myHalLight;
	}

	public int getMyFlorLight() {
		return myFlorLight;
	}

	public void setMyFlorLight(int myFlorLight) {
		this.myFlorLight = myFlorLight;
	}

	public boolean isMySolarPanel() {
		return mySolarPanel;
	}

	public void setMySolarPanel(boolean mySolarPanel) {
		this.mySolarPanel = mySolarPanel;
	}

	public int getMyWeatherProofedDoor() {
		return myWeatherProofedDoor;
	}

	public void setMyWeatherProofedDoor(int myWeatherProofedDoor) {
		this.myWeatherProofedDoor = myWeatherProofedDoor;
	}

	public int getMyNumWindow() {
		return myNumWindow;
	}

	public void setMyNumWindow(int myNumWindow) {
		this.myNumWindow = myNumWindow;
	}

	public int getMyNumWindowBad() {
		return myNumWindowBad;
	}

	public void setMyNumWindowBad(int myNumWindowBad) {
		this.myNumWindowBad = myNumWindowBad;
	}

	public int getMyNumWindowLowE() {
		return myNumWindowLowE;
	}

	public void setMyNumWindowLowE(int myNumWindowLowE) {
		this.myNumWindowLowE = myNumWindowLowE;
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

	public boolean isMyEStarRefrig() {
		return myEStarRefrig;
	}

	public void setMyEStarRefrig(boolean myEStarRefrig) {
		this.myEStarRefrig = myEStarRefrig;
	}

	public boolean isMyEStarDishWash() {
		return myEStarDishWash;
	}

	public void setMyEStarDishWash(boolean myEStarDishWash) {
		this.myEStarDishWash = myEStarDishWash;
	}

	public boolean isMyEStarClothWash() {
		return myEStarClothWash;
	}

	public void setMyEStarClothWash(boolean myEStarClothWash) {
		this.myEStarClothWash = myEStarClothWash;
	}

	public boolean isMyEStarDryer() {
		return myEStarDryer;
	}

	public void setMyEStarDryer(boolean myEStarDryer) {
		this.myEStarDryer = myEStarDryer;
	}

	/**
	 * Imports home data from save file into to this instance.
	 * @author Isaiah Miller
	 */
	public void importJSON(File srcFile) {
		myExporter.importFile(srcFile);
	}
//		File srcFile = new File(Home.HOME_PATH);
//		try {
//			myReader.readValue(srcFile);
//		} catch (IOException e) {
//			System.out.println("Import failed... Making new Home save file.");
//			exportHome();
////			e.printStackTrace();
//		}
	
	
	
	/**
	 * @author Isaiah Miller
	 */
	public void exportJSON(File destFile) {
		myExporter.exportFile(destFile);
	}
		
		
		
//		File destFile = new File(Home.HOME_PATH);
//		try {
//			myWriter.writeValue(destFile, this);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	

}
