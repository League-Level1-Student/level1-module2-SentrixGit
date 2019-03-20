package tea_maker;

public class TeaRunner {
	public static void main(String[] args) {
		TeaBag teaBag = new TeaBag("Passion Fruit");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		
		kettle.boil();
		teaBag.getFlavor();
		cup.makeTea(teaBag, kettle.getWater());
	}
}
