package main;

import java.util.Random;

/**Holds the state of one round of the game
 * 
 * @author kandi_000
 *
 */
public class Game {
	
	private Symbol[] currentCode;
	private Guess[] correct;
	private Mode gameMode;
	private int turnsLeft;
	
	public Game(Mode mode){
		this.gameMode = mode;
		turnsLeft = gameMode.getTotalSymbols();
		createNewCode();			
	}

	/**Check if guess is correct
	 * 
	 * @param guess
	 * @return
	 */
	public Guess[] makeGuess(Symbol[] guess){
		for(int i=0; i<currentCode.length; i++){
			if(currentCode[i]==guess[i]){
				correct[i] = new Guess("Correct");
			}
		}
		for(int i=0; i<currentCode.length;i++){
			if(correct[i]==null){
				for(int j=0; j < correct.length; j++){
					if(correct[j]==null){
						if(guess[i]==currentCode[j]){
							correct[i] = new Guess("WrongPlace");
							break;
						}
					}
				}
				if(correct[i]==null){
					correct[i] = new Guess("Incorrect");
				}
			}
		}			
		return correct;
	}

	/**create a new code for the round to guess
	 * 
	 */
	private void createNewCode() {
		currentCode = new Symbol[turnsLeft];
		for(int i=0; i<currentCode.length; i++){
			currentCode[i] = getNewSymbol();
		}
		correct = new Guess[turnsLeft];			
	}

	/**randomly assign symbols
	 * 
	 * @return
	 */
	private Symbol getNewSymbol() {
		Random r = new Random();
		Symbol s = new Symbol(r.nextInt(turnsLeft));
		return s;
	}
	
}
