package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {
	private Deck deck;
	private BlackjackHand dealerHand;
	Player player = new Player();

	public Dealer() {
		deck = new Deck();
		deck.shuffle();
		dealerHand = new BlackjackHand();
	}

	public void dealCardTo(Player player) {
		player.receiveCard(deck.getTopCard());
	}

	public void dealCardTo(Dealer dealer) {
		dealer.receiveCard(deck.getTopCard());
	}

	public void receiveCard(Card cardDealer) {
		// ArrayList<myHand> dealerHandHidden = new ArrayList<>();
		dealerHand.receiveCard(cardDealer);
	}

	public int getHandValue() {
		int handValue = ((BlackjackHand) dealerHand).getHandValue();
		return handValue;
	}

	public void printHandHidden() {
		System.out.println("The dealer has one card on the table and" + dealerHand.dealerHandHidden() + " shown.");
	}

	public void printHand() {
		System.out.println("Dealers hand: " + dealerHand + " total: " + dealerHand.getHandValue());
	}

	public void underSeventeen(Dealer dealer) {
		while (getHandValue() < 17) {
			//System.out.println("Dealer's total is under 17, dealing another card...");
			dealCardTo(dealer);
			printHand();
			continue;
		}
	}

	public Hand getDealerHand() {
		return dealerHand;
	}

}
