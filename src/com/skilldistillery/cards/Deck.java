package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//has-a / composition/ association
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		// generate a fresh deck of all 52 cards
		for (Suit suit : suits) {
			// for each suit
			for (Rank rank : ranks) {
				// for all 13 ranks
				Card aCard = new Card(suit, rank);
				deck.add(aCard);
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int checkDeckSize() {
		return deck.size();
	}

	public Card getTopCard() {
		return deck.remove(0);
	}

}
