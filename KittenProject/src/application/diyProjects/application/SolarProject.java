/**
 * Solar Project
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

import application.project;

public class SolarProject extends project {

	/** Electricity usage field. */
	boolean mySolarPanel;

	/** Average cost of installing 5kW solar panel system. */
	/**
	 * mySolarPanelCost
	 */
	int mySolarPanelCost = 12000;
	
	/** Average yearly use of electricity in kWHr. */
	/**
	 * myYearlyUse
	 */
	int myYearlyUse = 10766;

	/**
	 * project constructor
	 */
	public SolarProject() {
		super();
		
		mySolarPanel = theHome.isMySolarPanel();
		
		name ="Solar Panels";
		
		description = "Harness the power of the sun! A 5kW solar panel system would take up roughly"
				+ " 330 square feet of roof space. With current technology it takes 1 square feet to"
				+ " generate 15 watts of electricity."
				+ "\nLimited time offer: mass junk emails, a hungry bear and one lady named Karen";
		difficulty = 8;
		cost = calculateCost();
		savings = calculateSavings();

	}

	/**
	 * gets savings
	 * @return
	 */
	private int calculateSavings() {
		/** Average kWHr a 5kW Solar Panel System generates per week. */
		int solarGeneratedPower = 20;
		
		/** Average cost of kWhr in Washington. */
		double energyCost = 0.0973;
		
		return (int) ((solarGeneratedPower * 52) * energyCost) ;
	}

	/**
	 * gets cost
	 * @return
	 */
	private int calculateCost() {
		
		return mySolarPanelCost;
	}

	/**
	 * gets solar panel
	 * @return
	 */
	public boolean isMySolarPanel() {
		return mySolarPanel;
	}

	/**
	 * sets solar panel
	 * @param mySolarPanel
	 */
	public void setMySolarPanel(boolean mySolarPanel) {
		this.mySolarPanel = mySolarPanel;
	}

	
	
}
