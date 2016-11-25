package races;

import characteristics.Charisma;
import characteristics.Constitution;
import utils.Characteristic;
import utils.Language;
import utils.Pair;
import utils.Race;

public class Drakeid extends Race {

		public Drakeid(Pair<Integer, Integer> size, Pair<Integer, Integer> weight, 
				Language[] langs, boolean vision) {
			
			super(size, weight, langs, vision);

			Characteristic c[] = {new Constitution((Integer)2), new Charisma((Integer)(2))};
			this.name = "Drakeid";
			this.bonuses = c;
			}
}
