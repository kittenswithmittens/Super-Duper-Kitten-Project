package application;

/**
 * Insulation project
 * @author richw253
 * @version Dec 6
 */
public class InsulationProject extends project {
	
	/** Cost of insulating ceiling. */
	private final static int INSULATE_CEILING_COST = 1000;
	
	/** Cost of insulating walls. */
	private final static int INSULATE_WALL_COST = 1000;
	
	/** Cost of insulating floors. */
	private final static int INSULATE_FLOOR_COST = 1000;
	
	/** Energy savings of ceiling insulation. */
	private final static double INSULATION_PERCENT_ENERGY_SAVINGS = .11;
	
	/** Average annual cost for heating house.*/
	private final static int HEATING_COST = 900;
	
	/** Insulations information fields. */
	boolean myInsulationWall;
	boolean myInsulationCeiling;
	boolean myInsulationFloor;


	public InsulationProject() {
		super();
		
		name = "Insulation";
		
		myInsulationWall = myMainHome.isMyInsulationWall();
		myInsulationCeiling = myMainHome.isMyInsulationCeiling();
		myInsulationFloor = myMainHome.isMyInsulationFloor();
		
		description = "Brrrr.... could be even warmer in here, right? Lets put a bunch of fluffy glass in the walls eh?";
		difficulty = 3;
		cost = calculateCost();
		savings = calculateSavings();

	}

	private int calculateSavings() {
		// do some math
		return (int) (HEATING_COST * INSULATION_PERCENT_ENERGY_SAVINGS);
	}

	private int calculateCost() {
		// do some math
		int cost = 0;
		if (!myInsulationCeiling) {
			cost += INSULATE_CEILING_COST;
		}
		if (!myInsulationWall) {
			cost += INSULATE_WALL_COST;
		}
		if (myInsulationFloor) {
			cost += INSULATE_FLOOR_COST;
		}
		return cost;
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

	
}
