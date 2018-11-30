package application;

import application.project;

public class SolarProject extends project { //still needs calculation for savings and such

	/** Electricity usage field. */
	boolean mySolarPanel;



	public SolarProject() {
		super();
		
		mySolarPanel = theHome.isMySolarPanel();
		
		name ="Solar Panels";
		
		description = "Solar harnesses the power of the sun and at least like 4 kenyans and a bear";
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

	public boolean isMySolarPanel() {
		return mySolarPanel;
	}

	public void setMySolarPanel(boolean mySolarPanel) {
		this.mySolarPanel = mySolarPanel;
	}

	
	
}
