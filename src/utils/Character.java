package utils;
import java.util.HashMap;

public class Character {
    
    public String name;
    
    // 1. Basic informations
    private int level;
    private int px;
    private int hp;
    
    private Race race;
    private Class cl;
    private String gender; 
    
	
    
    // 2. Physical informations
    private int size;
    private int weight;
    
    // 3. Characteristics. 
	
    private HashMap<Characteristic,Integer> characteristics; 
    private Skill[] formations;
	

    public void takeDammage(int dammage) {
	this.hp -= this.hp - dammage;
    }
	

}
