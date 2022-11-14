package com.skilldistillery.cards;

public enum Suit {
	HEARTS("Hearts\u2665"), SPADES("Spades\u2660"), CLUBS("Clubs\u2663"), DIAMONDS("Diamonds\u25C6");
	
	private String name;
	
	Suit(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
