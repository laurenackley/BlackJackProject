package com.skilldistillery.blackjack.app;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

import java.util.Scanner;

public class BlackJackApp {

	public static void main(String[] args) {
		// cannot put anything type hand in this
		Scanner sc = new Scanner(System.in);
		Dealer dealer = new Dealer();
		Player player = new Player();

		for (int i = 0; i < 2; i++) {
			dealer.dealCardTo(player);
			dealer.dealCardTo(dealer);
		}
		player.printHand();

		dealer.printHand();

		if (player.isBust() == false) {
			player.hitOrStay(sc, player, dealer);
			dealer.underSeventeen(dealer);		
		}
		if (player.isBust() == true) {
			System.out.println("Dealer wins, you busted!");
		}

		if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() <= 21) {
			System.out.println("Dealer wins!");
		}
		if(dealer.getHandValue() > 21) {
			System.out.println("Dealer busted, you win.");
		}

		if (player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21) {
			System.out.println("You win!");
		}

		if (player.isBlackJack() == true) {
			System.out.println("Congrats! BLACKJACK!");
		}

		sc.close();
	}

}