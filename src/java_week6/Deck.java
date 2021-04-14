package java_week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{

//	private static final int deckSize = 52;
	private String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private String[] rank = {null, null, "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	
	List <Card> deck = new ArrayList<Card>(); 
		
	public Deck () {
//		this.deck = deck;
		int index = 0;
//		while(index <= deckSize) {
			for(int x = 0; x < 4; x++) {
			for(int i = 2; i < 15; i++) {
				String s =rank[i] + " of " + suit[x];
				Card c = new Card(s, i);
				deck.add(index, c);
				index++;
				}
//			}
		}
			
	}	
	
	public void shuffle() {
		
		Collections.shuffle(deck);
		
	}
	
	public Card draw() {
		Card temp = deck.get(0);
		deck.remove(0);
//		temp.describe();
		return temp;		
	}
	
	public void describe() {
		for(Card card : deck) {
//			for(int i = 0; i < 52; i++) {	
			card.describe();
			}
	}
	
}
