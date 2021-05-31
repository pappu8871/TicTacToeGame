package com.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacGameUC5 {
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
		String winner = null;
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
		System.out.println();
		printBoard();
		System.out.println();
		System.out.println("Play with two player");
		System.out.println(
				"player 1st will play . Enter a slot number to place X in:");

		while (winner == null) {
			int numInput = 0;

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
			} else {
				System.out.println(
						"Slot already taken; re-enter slot number:");
			}
			}
		}
	private static Object checkWinner() {
		// TODO Auto-generated method stub
		return null;
	}
	}
