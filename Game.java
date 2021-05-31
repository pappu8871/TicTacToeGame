package com.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacGameUC7 {
	
	
	static String turn;
	static String[] board;
	
	
	static void printBoard() {
		 System.out.println("|---|---|---|");
	        System.out.println("| " + board[0] + " | "
	                           + board[1] + " | " + board[2]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[3] + " | "
	                           + board[4] + " | " + board[5]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[6] + " | "
	                           + board[7] + " | " + board[8]
	                           + " |");
	        System.out.println("|---|---|---|");
	}
	
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    board = new String[9];
	    turn = "X";
	    int IS_GAIN = 1;
	     String winner = null;

	    for (int a = 0; a < 9; a++) {
	        board[a] = String.valueOf(a + 1);
	    }
	   
	    System.out.println();
	    printBoard();
	    System.out.println();
	    System.out.println("Play with two player");
	    
	    double check = Math.floor(Math.random() * 10) % 2;
	    if (check == IS_GAIN) {
	    	System.out.println("Player 1st will Start game ");
	    }else {
	    	System.out.println("Player 2nd will start game");
	    }
	    
		while (winner == null) {
            int numInput = 0;
            
            try {
                numInput = scn.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }
            
            
            //check board is empty then take user value and turn in
            //if box is pre taken input then show 
            //This game has two player x and O.
           
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;
  
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
  
                printBoard();
                winner = (String) checkWinner();
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
            }
		}
		}
	private static String checkWinner() {
		// TODO Auto-generated method stub
		for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
			}
		return turn;
		}
		}


