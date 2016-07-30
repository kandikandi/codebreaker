package main;

public class Player {

	String name;
	int cumulativeScore;	
	int currentScore;
	
	public Player(String name){
		
		this.name = name;
		cumulativeScore = 0;
		currentScore = 0;
		
	}

	public int getCumulativeScore() {
		return cumulativeScore;
	}

	public void setCumulativeScore(int cumulativeScore) {
		this.cumulativeScore = cumulativeScore;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}

	public String getName() {
		return name;
	}
	
		
}
