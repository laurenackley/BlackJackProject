package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {
	protected List<Card> myHand = new ArrayList<>();

	public Hand() {

	}

	public void receiveCard(Card card) {
		myHand.add(card);
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < myHand.size(); i++) {
			result += myHand.get(i).toString() + " ";
		}
		return result;
	}

}