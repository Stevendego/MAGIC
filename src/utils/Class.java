package utils;

public class Class {

	// Name of the class
	public String name;
	
	
	// Defenses bonus
	private Characteristic[] defs;
	
	// HP related stats
	private int init_hp;
	private int delta_hp;
	private int number_recup;
	
	// Stuff related 
	private Armor_type[] armors;
	private Weapon_type[] weapons;

	// Skills
	private Skill[] skills;
	
	// 1. Raw constructor
	public Class(Characteristic[] defs, 
			int init_hp, 
			int delta_hp, 
			int number_recup, 
			Armor_type[] armors, 
			Weapon_type[] weapons,
			Skill[] skills){
		this.defs = defs;
		this.init_hp = init_hp;
		this.delta_hp = delta_hp;
		this.number_recup = number_recup;
		this.armors = armors;
		this.weapons = weapons;
		this.skills = skills;
		}

	// 2. Getters
	public String getName() {
		return name;
	}

	public Characteristic[] getDefs() {
		return defs;
	}

	public int getInit_hp() {
		return init_hp;
	}

	public int getDelta_hp() {
		return delta_hp;
	}

	public int getNumber_recup() {
		return number_recup;
	}

	public Armor_type[] getArmors() {
		return armors;
	}

	public Weapon_type[] getWeapons() {
		return weapons;
	}

	public Skill[] getSkills() {
		return skills;
	}
	
	// No setter.
	
	
}

