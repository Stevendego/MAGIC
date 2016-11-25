package characteristics;

import utils.Characteristic;

public class Armor_class extends Characteristic {


	private final String char_name = "Armor class";
	private final Integer id = 6;

	public Integer value;

	public Armor_class(Integer v) {
		super(v);
	}

}
