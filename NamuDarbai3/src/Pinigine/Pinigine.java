package Pinigine;

public class Pinigine {
	private int eur50;
	private int eur100;
	private int eur20;
	private int eur5;
	
	public void inesti(int eur100, int eur50, int eur20, int eur5) { //metodas
		this.eur100 += eur100;
		this.eur50 += eur50;
		this.eur20 += eur20;
		this.eur5 += eur5;
	
	}
	public void parodyk() {
		System.out.println("100:"+ eur100 + "50:" + eur50  + "20:" + eur20 + "5:" + eur5);
	}
	
	public void suma() {
		System.out.println(eur100 * 100 + eur50 * 50 + eur20 * 20 + eur5 * 5);
	}
}
