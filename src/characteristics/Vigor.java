package characteristics;

import utils.Characteristic;

public class Vigor extends Characteristic {

	private final String char_name = "Vigor";
	private final Integer id = 7;

	public Integer value;
	
	public Vigor(Integer v) {
		super(v);
	}
}
