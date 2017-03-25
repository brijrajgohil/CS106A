/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Hangman extends ConsoleProgram {

	/***********************************************************
	 *              CONSTANTS                                  *
	 ***********************************************************/
	
	/* The number of guesses in one game of Hangman */
	private static final int N_GUESSES = 7;
	/* The width and the height to make the karel image */
	private static final int KAREL_SIZE = 150;
	/* The y-location to display karel */
	private static final int KAREL_Y = 230;
	/* The width and the height to make the parachute image */
	private static final int PARACHUTE_WIDTH = 300;
	private static final int PARACHUTE_HEIGHT = 130;
	/* The y-location to display the parachute */
	private static final int PARACHUTE_Y = 50;
	/* The y-location to display the partially guessed string */
	private static final int PARTIALLY_GUESSED_Y = 430;
	/* The y-location to display the incorrectly guessed letters */
	private static final int INCORRECT_GUESSES_Y = 460;
	/* The fonts of both labels */
	private static final String PARTIALLY_GUESSED_FONT = "Courier-36";
	private static final String INCORRECT_GUESSES_FONT = "Courier-26";
	
	/***********************************************************
	 *              Instance Variables                         *
	 ***********************************************************/
	
	/* An object that can produce pseudo random numbers */
	private RandomGenerator rgen = new RandomGenerator();
	
	private GCanvas canvas = new GCanvas();
	
	private String secretWord;
	private String guessHiddenWord;
	private int guessCtr = N_GUESSES;
	
	/***********************************************************
	 *                    Methods                              *
	 ***********************************************************/
	
	public void run() {
		// shall we?
		setUpGame();
		playGame();
	}
	
	private void setUpGame() {
		println("Welcome to Hangman!");
		secretWord = getRandomWord();
		guessHiddenWord = wordFirstUpdate();
		guessCtrUpdate();
	}
	
	private void playGame() {
		while(true) {
			String guess = readLine("Your guess: ");
			guess = guess.toUpperCase();
			while(!validGuess(guess)) {
				guess = readLine("Your guess: ");
				guess.toUpperCase();
			}
			checkLetter(guess);
		}
	}
	
	private boolean validGuess(String guess) {
		if(guess.length() > 1) {
			return false;
		} else if(Character.isDigit(guess.charAt(0))) {
			return false;
		}
		return true;
	}
	
	private void checkLetter(String guess) {
		if(secretWord.indexOf(guess.charAt(0)) == -1) {
			guessCtr--;
			println("There are no " + guess + "'s in the word.");
		} else {
			println("That guess is correct.");
			for(int i = 0; i < secretWord.length(); i++) {
				if(secretWord.charAt(i) == guess.charAt(0) && i != 0) {
					guessHiddenWord = guessHiddenWord.substring(0, i) + guess + guessHiddenWord.substring(i+1); 
				} else if(secretWord.charAt(i) == guess.charAt(0) && i == 0) {
					guessHiddenWord = guess + guessHiddenWord.substring(i + 1);
				}
			}
		}
	}
	
	
	private String wordFirstUpdate() {
		String result = "";
		for(int i = 0; i < secretWord.length(); i++) {
			result = result + "-";
		}
		println("The word now looks like this: " + result);
		return result;
	}
	
	private void guessCtrUpdate() {
		println("You have " + guessCtr + " guesses left.");
	}
	/**
	 * Method: Get Random Word
	 * -------------------------
	 * This method returns a word to use in the hangman game. It randomly 
	 * selects from among 10 choices.
	 */
	private String getRandomWord() {
		int index = rgen.nextInt(10);
		if(index == 0) return "BUOY";
		if(index == 1) return "COMPUTER";
		if(index == 2) return "CONNOISSEUR";
		if(index == 3) return "DEHYDRATE";
		if(index == 4) return "FUZZY";
		if(index == 5) return "HUBBUB";
		if(index == 6) return "KEYHOLE";
		if(index == 7) return "QUAGMIRE";
		if(index == 8) return "SLITHER";
		if(index == 9) return "ZIRCON";
		throw new ErrorException("getWord: Illegal index");
	}

}
