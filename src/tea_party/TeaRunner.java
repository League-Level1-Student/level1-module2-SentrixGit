package tea_party;

public class TeaRunner {
	public static void main(String[] args) {
		teaParty t = new teaParty();
		
		System.out.println(t.welcome("Bob", true, false));
		System.out.println(t.welcome("Bob", false, false));
		System.out.println(t.welcome("Bob", false, true));
	}
}
