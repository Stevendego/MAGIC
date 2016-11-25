package races;

import utils.Characteristic;
import utils.Language;
import utils.Pair;
import utils.Race;
import characteristics.*;

public class Half_elf extends Race {

	public Half_elf(Pair<Integer, Integer> size, Pair<Integer, Integer> weight, 
			Language[] langs, boolean vision) {
		
		super(size, weight, langs, vision);

		Characteristic c[] = {new Constitution((Integer)2), new Charisma((Integer)(2))};
		this.name = "Half elf";
		this.bonuses = c;
		}
	
}