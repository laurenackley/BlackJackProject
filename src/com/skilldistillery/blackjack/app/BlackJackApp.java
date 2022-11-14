package com.skilldistillery.blackjack.app;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

import java.util.Scanner;

public class BlackJackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dealer dealer = new Dealer();
		Player player = new Player();
		BlackJackApp app = new BlackJackApp();
		

		app.gamePlay(sc, dealer, player);
			
		System.out.println("Thanks for playing!");
			sc.close();
		}
		
		private void gamePlay(Scanner sc, Dealer dealer, Player player) {		
		for (int i = 0; i < 2; i++) {
			dealer.dealCardTo(player);
			dealer.dealCardTo(dealer);
		}

		player.printHand();
		if (player.isBlackJack() == true) {
		}
		dealer.printHandHidden();

		if (player.isBust() == false && player.isBlackJack() == false) {
			player.hitOrStay(sc, player, dealer);
		}
		if (player.isBlackJack() == true) {
			System.out.println("Congrats! BLACKJACK!");
			System.out.println(" /$$     /$$/$$$$$$  /$$   /$$       /$$      /$$ /$$$$$$ /$$   /$$ /$$\n"
					+ "|  $$   /$$/$$__  $$| $$  | $$      | $$  /$ | $$|_  $$_/| $$$ | $$| $$\n"
					+ " \\  $$ /$$/ $$  \\ $$| $$  | $$      | $$ /$$$| $$  | $$  | $$$$| $$| $$\n"
					+ "  \\  $$$$/| $$  | $$| $$  | $$      | $$/$$ $$ $$  | $$  | $$ $$ $$| $$\n"
					+ "   \\  $$/ | $$  | $$| $$  | $$      | $$$$_  $$$$  | $$  | $$  $$$$|__/\n"
					+ "    | $$  | $$  | $$| $$  | $$      | $$$/ \\  $$$  | $$  | $$\\  $$$    \n"
					+ "    | $$  |  $$$$$$/|  $$$$$$/      | $$/   \\  $$ /$$$$$$| $$ \\  $$ /$$\n"
					+ "    |__/   \\______/  \\______/       |__/     \\__/|______/|__/  \\__/|__/");
		} else if (player.isBust() == true) {
			System.out.println("Dealer wins, you busted!");
		} else if (player.isBlackJack() == false && player.isBust() == false) {
			System.out.println("The dealer has less than 17 in total value...Dealer hits.");
			dealer.underSeventeen(dealer);
		}

		if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() <= 21) {
			System.out.println("Dealer is closer to 21. Dealer wins!");
			dealer.printHand();

		} else if (dealer.getHandValue() > 21) {
			System.out.println();
			System.out.println("Dealer busted, you win.");
			
			System.out.println(" /$$     /$$/$$$$$$  /$$   /$$       /$$      /$$ /$$$$$$ /$$   /$$ /$$\n"
					+ "|  $$   /$$/$$__  $$| $$  | $$      | $$  /$ | $$|_  $$_/| $$$ | $$| $$\n"
					+ " \\  $$ /$$/ $$  \\ $$| $$  | $$      | $$ /$$$| $$  | $$  | $$$$| $$| $$\n"
					+ "  \\  $$$$/| $$  | $$| $$  | $$      | $$/$$ $$ $$  | $$  | $$ $$ $$| $$\n"
					+ "   \\  $$/ | $$  | $$| $$  | $$      | $$$$_  $$$$  | $$  | $$  $$$$|__/\n"
					+ "    | $$  | $$  | $$| $$  | $$      | $$$/ \\  $$$  | $$  | $$\\  $$$    \n"
					+ "    | $$  |  $$$$$$/|  $$$$$$/      | $$/   \\  $$ /$$$$$$| $$ \\  $$ /$$\n"
					+ "    |__/   \\______/  \\______/       |__/     \\__/|______/|__/  \\__/|__/");
			//dealer.printHand();
		}

		else if (player.getHandValue() == dealer.getHandValue()) {
			System.out.println("It is a tie. Nothing gained, nothing lost.");
			dealer.printHand();
		}
		
	}

		// TODO Auto-generated method stub
		
}