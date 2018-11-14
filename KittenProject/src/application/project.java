package application;

public abstract class project extends Main {
	int cost;
	int difficulty;
	int savings;
	String description;
	Home myHome = theHome;

	public project(){
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

}
