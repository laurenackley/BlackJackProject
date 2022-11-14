package com.skilldistillery.cardgame;

import com.skilldistillery.cards.Card;

public class BlackjackHand extends Hand {
	public BlackjackHand() {
		super();

	}

	public int getHandValue() {
		int total = 0;
		for (Card card : myHand) {
			total += card.getValue();
		}
		return total;
	}

	public String dealerHandHidden() {
		for (int i = 1; i < myHand.size(); i++) {
			if (myHand.size() >= 2) {
				return " has " + myHand.get(i);
			}
		}
		return "";
	}

}
