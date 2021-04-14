package java_week6;


public class App {

	public static void main(String[] args) {
		// This is the game of WAR!  First thing to do is do get a deck of cards.
		// We will instantiate a new deck of cards.		
		Deck deck1 = new Deck();
		
		// After the deck we need to players.  We will create 2 players and give them their names
		
		Player player1 = new Player("Tom");
		Player player2 = new Player("Sally");
		
		// The next part of the game is to shuffle the deck of cards and get them mixed up.
		
		deck1.shuffle();

		// We now need to have the players get their hands that they will play with.
		// We will split the deck in 2 by having each player draw the top card and put it in their hand.
		
		for(int i = 0; i < 26; i++) {
			player1.draw(deck1);
			player2.draw(deck1);
			}
		
		// It is now time to play the game.  Each player will flip the top card of their hand over and the highest ranking card wins the hand.
		// The Ace card is high so it will have a value of 14.
		
		for(int x = 0; x < 26; x++) {
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			System.out.println("Round " + x + "\t" + player1.name + " card:\t" + p1Card.getName() + "\t" + player2.name + " card:\t" + p2Card.getName());
			if(p1Card.getValue() > p2Card.getValue()) {
				System.out.println(player1.name + " won the round.");
				player1.incrementScore();
			} else if(p2Card.getValue() > p1Card.getValue()) {
				System.out.println(player2.name + " won the round.");
				player2.incrementScore();
			} else {
				System.out.println("Draw");
			}
		}
		
		// We will now see who won the game.  We will compare each players score and determine winner.
		
		System.out.println(player1.name + " score is:\t" + player1.score);
		System.out.println(player2.name + " score is:\t" + player2.score);
		if(player1.score > player2.score) {
			System.out.println(player1.name + " is the winner!");
		} else if(player2.score > player1.score) {
			System.out.println(player2.name + " is the winner!");
		} else {
			System.out.println("DRAW! It is a tie.");
		}
		
	}
}
	
	
	
