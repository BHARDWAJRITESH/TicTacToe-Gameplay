package com.Bridgelabs;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	/**
	 * creating char array of size 10
	 * used scanner to get user input
	 * created two instance variables for player and computer
	 * used random to generate computer choice 
	 */
	char[] gameBoard = new char[10];
	Scanner scanner = new Scanner(System.in);
	char playerLetter;
	char computerLetter;
	Random random = new Random();
	
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
				System.out.println("\n\nPlayer Letter: " + playerLetter);
				System.out.println("Computer Letter: " + computerLetter);
				condition =1;
			}else if(choice == 2) {
				playerLetter = 'X';
				computerLetter = 'O';
				System.out.println("\n\nPlayer Letter: " + playerLetter);
				System.out.println("Computer Letter: " + computerLetter);
				condition = 2;
			}else {
				System.out.println("\n*****Enter 1 OR 2 *****");
			}
		}
	}
	/**
	 * 
	 * creating method for displaying board
	 * leaving 0 index
	 */
	void displayingBoard() {
		
		System.out.println(gameBoard[1] + "   | "+ gameBoard[2] +"| " + gameBoard[3]);
        System.out.println("----+--+----");
        System.out.println(gameBoard[4] + "   | "+ gameBoard[5] + "| " + gameBoard[6]);
        System.out.println("----+--+----");
        System.out.println( gameBoard[7] + "   | "+ gameBoard[8] +"| " + gameBoard[9]);
        		
	}
	/**
	 * 
	 * creating method so user can input its desired position
	 * enter value from 1-9
	 * Computer input is also made by help of random
	 * adding empty cell condition to both computer and user 
	 */
	void gameBoardInputUser() {
		System.out.println();
		System.out.println("\n\n***** Player Turn *****");
		int emptyCellIndexUser = 0;
		while(emptyCellIndexUser == 0) {
			System.out.println("Enter your choice position between(1-9)");
			int playerPosition = scanner.nextInt();
			if(emptyCellIndex(playerPosition)) {
				gameBoard[playerPosition] = playerLetter;
				displayingBoard();
				emptyCellIndexUser = 1;
			}else {
				System.out.println("\n***Space is occupied Try another cell index***");				
			}
		}	
		choosePlayer(1);
	}		
	void computerInput() {
		System.out.println("***** Computer Turn *****");
		int emptyCellIndexComputer=0;
		while (emptyCellIndexComputer==0) {
			int computerPosition = random.nextInt(9) + 1;
			if(emptyCellIndex(computerPosition)) {
				gameBoard[computerPosition] = computerLetter;
				displayingBoard();
				emptyCellIndexComputer = 1;
			}else {
				System.out.println("\n***Space is occupied Try another cell index***");
			}
		}
		choosePlayer(0);
	}
	
	/**
	 * 
	 * Creating method to check empty cell index in board
	 */
	boolean emptyCellIndex(int cellIndex) {
		return gameBoard[cellIndex] == ' ';
	}
	
	/**
	 * 
	 * creating method to toss who will play first
	 */
	void tossToPlayFirst() {
		System.out.println("\n\n**Flip  the coin  to decide who play first**");
		int choosePlayer = random.nextInt(2);
		if(choosePlayer == 0) {
			System.out.println("\n***User has won the toss and play fist***");
			choosePlayer(0);
		}else {
			System.out.println("\n***Computer has won the toss and will play first***");
			choosePlayer(1);
		}
		
	}
	/**
	 * 
	 * Creating method to switch player according to toss
	 */
	void choosePlayer(int choosePlayer) {
		if(choosePlayer == 0) {
			gameBoardInputUser();
		}else if (choosePlayer == 1) {
			computerInput();
		}else {
			System.out.println("***** Game finished *****");
			System.out.println(0);			
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("********************************************************\n" +"    WELCOME TO THE TIC TAC TOE GAME"+ "\n********************************************************");	
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.chooseOptionForPlay();
		ticTacToe.boardCreation();
		ticTacToe.displayingBoard();
		ticTacToe.tossToPlayFirst();
//		ticTacToe.gameBoardInputUser();
//		ticTacToe.computerInput();
		
	}

}
