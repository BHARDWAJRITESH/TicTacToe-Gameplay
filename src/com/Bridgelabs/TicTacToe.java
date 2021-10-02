package com.Bridgelabs;

public class TicTacToe {
	//creating char array of size 10
	static char[] gameBoard = new char[10];
	
	/**
	 * 
	 * Creating method of BoardCreation
	 */
	void boardCreation() {
		for(int a = 1; a < 10; a++) {
			gameBoard[a] = ' ';
		}
	}
	public static void main(String[] args) {
		System.out.println("********************************************************\n" +"    Welcome to the TIC TAC TOE game"+ "\n********************************************************");	
	}

}
