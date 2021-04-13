package java_week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck{

	int deckSize;
	
	List <Card> deck = new ArrayList<Card>() {
		
		};
	
	public Deck (List<Card> deck) {
	    deckSize = 52;
		this.deck = deck;
		
	}
	
	public void shuffle(List<Card> list) {
		
		Collections.shuffle(list, new Random());
		
	}
	
	public Card draw(List<Card> card) {
		Card temp = card.get(0);
		card.remove(0);
		return temp;
	}
	
	
}
