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


	
	
	

}
