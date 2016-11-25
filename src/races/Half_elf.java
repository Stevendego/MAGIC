package races;

import utils.Characteristic;
import utils.Language;
import utils.Pair;
import utils.Race;
import characteristics.*;

public class Half_elf extends Race {

	private static Characteristic c[] = {new Constitution((Integer)2), new Charisma((Integer)(2))};
	
	private Half_elf(Pair<Integer, Integer> size, Pair<Integer, Integer> weight, 
			Language[] langs, boolean vision) {
		
		super("Half elf", size, weight, c, langs, vision);

		}
	
	private static final Half_elf instance = /* TODO : replace with good values */
			new Half_elf(new Pair<Integer,Integer>(150,170),new Pair<Integer,Integer>(70,90),new Language[0],true);

	public static Half_elf getInstance(){
		return instance;
	}
	
}