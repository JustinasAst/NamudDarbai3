package Skaiciuotuvas;

import java.util.Scanner;

public class Uzduotis4 {
	public static void main(String[] args) {
		Scanner klv = new Scanner(System.in);
	
		Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
		skaiciuotuvas.skaiciai(10, 5, 0);
		skaiciuotuvas.sudeti();
		skaiciuotuvas.atimti();
		skaiciuotuvas.sudauginti();
		skaiciuotuvas.dalinti();
		skaiciuotuvas.dalintiSuLiekana();
				
	}

}
