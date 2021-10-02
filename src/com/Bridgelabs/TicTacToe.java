package com.Bridgelabs;

import java.util.Scanner;

public class TicTacToe {
	//creating char array of size 10
	char[] gameBoard = new char[10];
	Scanner scanner = new Scanner(System.in);
	char playerLetter;
	char computerLetter;
	
	/**
	 * 
	 * Creating method of BoardCreation
	 * ignoring 0 index as mentioned
	 */
	void boardCreation() {

		for(int a = 1; a < 10; a++) {
			gameBoard[a] = ' ';
		}
	}
	
	/**
	 * 
	 * Creating method to choose "X" and "O" option for gameplay
	 * Taking input from player to choose option
	 */
	void chooseOptionForPlay() {

		
		int condition = 0;
		while(condition == 0) {
			System.out.println("\nChoose your option for gameplay\n Press 1 for 'X'\n Press 2 for 'O'\n Enter your choice ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				playerLetter = 'X';
				computerLetter = 'O';
				System.out.println("Player Letter: " + playerLetter);
				System.out.println("Computer Letter: " + computerLetter);
				condition =1;
			}else if(choice == 2) {
				playerLetter = 'X';
				computerLetter = 'O';
				System.out.println("Player Letter: " + playerLetter);
				System.out.println("Computer Letter: " + computerLetter);
				condition = 2;
			}else {
				System.out.println("*****Enter 1 OR 2 *****");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("********************************************************\n" +"    WELCOME TO THE TIC TAC TOE GAME"+ "\n********************************************************");	
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.chooseOptionForPlay();
		ticTacToe.boardCreation();
	}

}
