package utils;
import java.util.Random;

public class Race {

	private String name;
	
	// Physical
	private Pair<Integer,Integer> size;
	private Pair<Integer,Integer> weight;
	
	// Bonuses
	protected Characteristic[] bonuses;
	private Language[] langs;
	
	// Misc.
	private boolean vision; /* Vision in the dark */

	public Race(Pair<Integer, Integer> size, Pair<Integer, Integer> weight,
			Language[] langs, boolean vision) {
		super();
		this.size = size;
		this.weight = weight;
		this.langs = langs;
		this.vision = vision;
	}

	public String getName() {
		return name;
	}

	public Pair<Integer, Integer> getSize() {
		return size;
	}

	public Pair<Integer, Integer> getWeight() {
		return weight;
	}

	public Characteristic[] getBonuses() {
		return bonuses;
	}

	public Language[] getLangs() {
		return langs;
	}

	public boolean hasVision() {
		return vision;
	}
	
	// 2. Race creator
	
	public Integer chooseBetweenPair(Integer i1, Integer i2){
		return (i1 + (new Random()).nextInt(i2 - i1));
		
	}
	
	public Integer getGoodSize(){
		return chooseBetweenPair(getSize().fst() , getSize().snd());
	}
	
	public Integer getGoodWeight(){
		return chooseBetweenPair(getWeight().fst() , getWeight().snd());

	}
	
}
