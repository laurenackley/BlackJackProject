package com.skilldistillery.players;

import java.util.Scanner;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;

public class Player {
	protected Hand hand; // can change to protected

	public Player() {
		this.hand = new BlackjackHand();

	}

	public void receiveCard(Card cardPlayer) {
		hand.receiveCard(cardPlayer);
	}

	public boolean isBust() {
		boolean bust = false;
		if (getHandValue() > 21) {
			bust = true;
		}
		return bust;
	}

	public int getHandValue() {
		int handValue = ((BlackjackHand) hand).getHandValue();
		return handValue;
	}

	public boolean isBlackJack() {
		boolean twentyOne = false;
		if (getHandValue() == 21) {
			twentyOne = true;
		}
		return twentyOne;
	}

	public void printHand() {
		System.out.println("Your cards are " + hand + " total: " + getHandValue());
	}

	public void hitOrStay(Scanner sc, Player player, Dealer dealer) {

		System.out.println("Do you want to hit or stay?");
		String answer = sc.next();

		while (answer.equalsIgnoreCase("hit")) {
			dealer.dealCardTo(player);
			player.printHand();
			if(getHandValue() >= 21) {
				break;
			}
			System.out.println("Would you like to hit again?");
			answer = sc.next();
			getHandValue();
			continue;
		 }
	}
}
