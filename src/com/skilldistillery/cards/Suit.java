package com.skilldistillery.cards;

public enum Suit {
	HEARTS("Hearts\u2665\uFE0F"), SPADES("Spades\u2660"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	private String name;
	
	Suit(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
