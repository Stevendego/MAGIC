package utils;

public class Pair<A,B>{
	private A fst;
	private B snd;
	
	public Pair(A a, B b){
		fst = a; snd = b;
	}
	
	public A fst(){return this.fst;}

	public B snd(){return this.snd;}
}
