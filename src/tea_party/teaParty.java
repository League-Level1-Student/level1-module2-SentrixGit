package tea_party;

public class teaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted)
	{
		if (isWoman == true) {
			return "Ms." + name;
		} else if(isWoman == false && isKnighted == false) {
			return "Mr." + name;
		} else if(isWoman == false && isKnighted == true) {
			return "Sir " + name;
		}
		return null;
	}
}
