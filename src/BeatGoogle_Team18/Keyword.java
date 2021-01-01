package BeatGoogle_Team18;

public class Keyword {
	public String name;
	public float weight;
	
	public Keyword(String name,float weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "["+name+","+weight+"]";
	}
	
}
