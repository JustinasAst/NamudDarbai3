package Skaiciuotuvas;

public class Skaiciuotuvas {
	private int sk1 , sk2;
	private int suma;
	
	public void skaiciai(int sk1, int sk2, int suma) {
		this.sk1 += sk1;
		this.sk2 += sk2;
		this.suma += suma;
		
	}
	
	public void sudeti() {
		suma = sk1 + sk2;
		System.out.println(suma);
		
	}
	
	public void atimti() {
		suma = sk1 - sk2;
		System.out.println(suma);
		
	}
	
	public void sudauginti() {
		suma = sk1* sk2;
		System.out.println(suma);
		
	}
	
	public void dalinti() {
		suma = sk1 / sk2;
		System.out.println(suma);
		
	}
	
	public void dalintiSuLiekana() {
		suma = sk1 % sk2;
		
	}

}
