package java_week6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card card1 = new Card("Two of Hearts", 2);
		card1.describe();
		
		card1.setName("Three of Hearts");
		card1.setValue(3);
		card1.describe();
		
	}

}
