package application;

public abstract class project extends Main {
	String name;
	int cost;
	int difficulty;
	int savings;
	String description;
	Home myHome;

	public project(){
	    myHome = myMainHome;
		cost = 0;
		difficulty = 0;
		savings = 0;
		description = " ";
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getSavings() {
		return savings;
	}

	public void setSavings(int savings) {
		this.savings = savings;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return this.name;
	}

}
