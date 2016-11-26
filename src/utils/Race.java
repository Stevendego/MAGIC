package utils;
import java.util.Random;

public class Race {

	private final String name;
	
	// Physical
	private final Pair<Integer,Integer> size;
	private final Pair<Integer,Integer> weight;
	
	// Bonuses
	protected final Characteristic[] bonuses;
	private final Language[] langs;
	
	// Misc.
	private final boolean vision; /* Vision in the dark */



	public Race(String name, Pair<Integer, Integer> size, Pair<Integer, Integer> weight, Characteristic[] bonuses,
			Language[] langs, boolean vision) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.bonuses = bonuses;
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
	
	public static Integer chooseBetweenPair(Integer i1, Integer i2){
		return (i1 + (new Random()).nextInt(i2 - i1));
		
	}
	
	/* Returns a size between the minimal and the maximal usual size of a race */
	public Integer getGoodSize(){
		return chooseBetweenPair(getSize().fst() , getSize().snd());
	}
	
	/* Same for the weight */
	public Integer getGoodWeight(){
		return chooseBetweenPair(getWeight().fst() , getWeight().snd());

	}
	
}
