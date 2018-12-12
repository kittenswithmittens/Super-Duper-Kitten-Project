/**
 * Project abstract class
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

public abstract class project extends Main {
	/**
	 * name
	 */
	String name;
	/**
	 * cost
	 */
	int cost;
	/**
	 * difficulty
	 */
	int difficulty;
	/**
	 * savings
	 */
	int savings;
	/**
	 * description
	 */
	String description;
	/**
	 * myHome
	 */
	Home myHome;

	/**
	 * constructs a project
	 */
	public project(){
	    myHome = myMainHome;
		cost = 0;
		difficulty = 0;
		savings = 0;
		description = " ";
	}

	/**
	 * gets cost
	 * @return
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * sets cost
	 * @param cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * gets diff
	 * @return
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * sets diff
	 * @param difficulty
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * get savings
	 * @return
	 */
	public int getSavings() {
		return savings;
	}

	/**
	 * set savings
	 * @param savings
	 */
	public void setSavings(int savings) {
		this.savings = savings;
	}

	/**
	 * get discription
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/* 
	 * returns the name of the project
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.name;
	}

}
