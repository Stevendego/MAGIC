package utils;

public abstract class Characteristic implements Comparable<Characteristic>{
	
	private final Integer id;
	
	private final String char_name;
	private int value;
	
	protected Characteristic(Integer id, String char_name, Integer value){
		this.id = id;
		this.char_name = char_name;
		this.value = value;
	}
	
	@Override
	public int compareTo(Characteristic arg0) {
		return this.id.compareTo(arg0.id);
	}

}
