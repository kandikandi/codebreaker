package main;

public class Mode {
	
	private int difficulty;
	private int totalSymbols;
	private int totalDifferentSymbols;
	
	public Mode(int diff){
		this.difficulty = diff;
		totalSymbols = diff*2;
		totalDifferentSymbols = (int) ((double)diff*2.5);
		
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int getTotalDifferentSymbols() {
		return totalDifferentSymbols;
	}
	
	public int getTotalSymbols() {
		return totalSymbols;
	}

}
