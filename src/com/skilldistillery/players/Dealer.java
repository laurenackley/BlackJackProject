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
	private Hand dealerHand;
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
		dealerHand.receiveCard(cardDealer);
	}

	public int getHandValue() {
		int handValue = ((BlackjackHand) dealerHand).getHandValue();
		return handValue;
	}

	public void printHand() {
		System.out.println("The dealer has " + dealerHand + " " + getHandValue());
	}

	public void underSeventeen(Dealer dealer) {
		while (getHandValue() < 17) {
			dealCardTo(dealer);
			printHand();
			continue;
		}
	}

//get dealer hand to only show the second card
}
