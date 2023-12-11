package rpg.character;

public abstract class Item {
	private String name;
	private int damage;
	
	public Item(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public Item(String name) {
		this(name, 10);
	}
	
}
