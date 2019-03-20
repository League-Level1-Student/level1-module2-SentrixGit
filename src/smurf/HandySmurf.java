package smurf;

public class HandySmurf {
	public static void main(String[] args) {
		Smurf Papa = new Smurf("papa");
		Smurf Smurfette = new Smurf("smurfette");
		
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
