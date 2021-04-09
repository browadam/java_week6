package java_week6;

public class Card {
	
	private int value;
	private String name;
	
	public Card (String name, int value) {
		this.name = setName();
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}

	public void describe() {
		System.out.println("Card: " + getName() + "\tValue: " + getValue());
	}
}
