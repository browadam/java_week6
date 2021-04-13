package java_week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card> ();
	
	int score;
	
	String name;
	
	public Player (String name, List<Card> hand) {
		this.name = name;
		this.hand = hand;
		score = 0;
	}
	
	public void describe() {
		System.out.println("Player: " + name + "\tHand: " + hand);
	}
	
	public Card flip() {
		Card flipped = hand.get(0);
		hand.remove(0);
		return flipped;
	}
	
	

}
