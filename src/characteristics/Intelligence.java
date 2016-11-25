package characteristics;

import utils.Characteristic;

public class Intelligence extends Characteristic {

	private final String char_name = "Intelligence";
	private final Integer id = 3;

	public Integer value;
	
	public Intelligence (Integer v) {
		super(v);
	}
}
