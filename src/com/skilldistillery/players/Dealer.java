package com.skilldistillery.players;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {
	private Deck deck = new Deck();
public static void main(String[] args) {
	Dealer dealer = new Dealer();
	dealer.dealCardsToPlayer();
	dealer.addCard(dealer.dealCardsToPlayer());
}
	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	
	public List<Card> dealCardsToPlayer(){
		List<Card> dealtCards = new ArrayList<>();
		deck.shuffle();
//		int cardsDealtToPlayer = 2;
		dealtCards.add(deck.dealCard());
		dealtCards.add(deck.dealCard());
			 System.out.println(dealtCards);
			 return dealtCards;
	}
		//logic of if player wants additional cards
public List<Card> addCard(List<Card>dealtCards){
	
	System.out.println("Do you want additional cards?");
			 if(sc.next().equalsIgnoreCase("yes")) {
				 dealtCards.add(deck.dealCard());
				 System.out.println(dealtCards);
			 }else{
				 System.out.println("Good luck!");
			 }
			 return dealtCards;
		
}

}
