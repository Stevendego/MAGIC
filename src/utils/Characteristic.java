package utils;

public abstract class Characteristic implements Comparable<Characteristic>{
	
	private Integer id;
	
	public String char_name;
	public int value;
	
	public Characteristic(Integer v){
		value = v;
	}
	@Override
	public int compareTo(Characteristic arg0) {
		return this.id.compareTo(arg0.id);
	}

}
