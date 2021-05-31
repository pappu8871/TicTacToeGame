package com.game;

import java.util.Scanner;

public class TicTacGameUC6 {
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
		}
		}
