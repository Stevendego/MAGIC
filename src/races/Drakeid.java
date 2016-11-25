package races;

import characteristics.Charisma;
import characteristics.Constitution;
import utils.Characteristic;
import utils.Language;
import utils.Pair;
import utils.Race;

public class Drakeid extends Race {

	private static Characteristic c[] = {new Constitution((Integer)2), new Charisma((Integer)(2))};
	
	private Drakeid(Pair<Integer, Integer> size, Pair<Integer, Integer> weight, 
			Language[] langs, boolean vision) {
		
		super("Drakeid", size, weight, c, langs, vision);

		}
	
	private static final Drakeid instance = /* TODO : replace with good values */
			new Drakeid(new Pair<Integer,Integer>(150,170),new Pair<Integer,Integer>(70,90),new Language[0],true);

	public static Drakeid getInstance(){
		return instance;
	}
	
}
