package utils;
import java.util.HashSet;

public class Character {

	private final String name;
	
	// 1. Basic informations
	private int level;
	private int px;
	private int hp;
	
	private final Race race;
	private final Class cl;
	private /* Who knows ? */ String gender; 
	
	
	
	// 2. Physical informations
	private int size;
	private int weight;
	
	// 3. Characteristics. 
	private HashSet<Characteristic> characteristics; 
	private HashSet<Skill> formations;
	public Character(String name, Race race, Class cl, String gender, int size, int weight,
			HashSet<Characteristic> characteristics, HashSet<Skill> formations) {
		this.name = name;
		
		this.level = 1;
		this.px = 0;
		
		this.race = race;
		this.cl = cl;
		this.gender = gender;
		this.size = size;
		this.weight = weight;
		this.characteristics = characteristics;
		this.formations = formations;
	}
	

    public void takeDammage(int dammage) {
	this.hp -= this.hp - dammage;
    }
	

}
