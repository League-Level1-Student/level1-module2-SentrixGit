package sea_creature;

public class spongeBob {
	public static void main(String[] args) {
		SeaCreature SpongeBob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		
		SpongeBob.eat();
		SpongeBob.laugh();
		
		patrick.eat();
		patrick.laugh();
		
		squidward.eat();
		squidward.laugh();
		
		
	}
}
