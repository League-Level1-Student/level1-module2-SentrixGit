package minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String nametest, int eyestest, String colortest, String Mastertest) {
		this.name = nametest;
		this.eyes = eyestest;
		this.color = colortest;
		this.master = Mastertest;
		System.out.println(name);
	}
	
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}
	
	int getEyes() {
		return eyes;
	}
	
	void setMaster(String MasterName) {
		master = MasterName;
	}
	
	String getMaster() {
		return master;
	}
}
