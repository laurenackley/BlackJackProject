package com.skilldistillery.cards;

import java.util.Objects;

public class Card {
//has-a (association)
	private Rank rank;
private Suit suit;
	
public Card() {}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public int getValue() {
		return this.rank.getValue();
	}
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(suit, rank);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	
}
