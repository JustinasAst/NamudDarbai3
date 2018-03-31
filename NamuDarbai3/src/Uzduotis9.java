import java.util.Random;

public class Uzduotis9 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] mas = new int[100];

		for (int i = 0; i < mas.length; i++) {
			int sk = rand.nextInt(1000);
			mas[i] = sk;

		}

		// 1. max
		
		int max = mas[0];
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] > max) {
				max = mas[j];
			}
		}
		System.out.println("1. Didziausia reiksme: " + max);

		// 2. min
		int min = mas[0];
		for (int j = 0; j < mas.length; j++) {
			if (min >  mas[j]) {
			min = mas[j];
			
			}
			}

		
		System.out.println("2. Maziausia reiksme " + min);
		
		//3. suma
	     int suma = mas[0];
	     for (int j = 0; j < mas.length; j++) {
			int j2 = mas[j];
			suma += mas[j];
		}
	    
	     // 4 . vidurkis
	int vidurkis = suma/ mas.length;
	   System.out.println("3. Reiksmiu vidurkis: " + vidurkis + " Reiksmiu suma: " + suma);
	 
	     // 5. rasti 500
	   
	int kur500 = mas[0] ;
	for (int i = 0; i == 500; ) {
		if(mas[i] == kur500) {
			kur500 = mas[500];
		}
		//System.out.println( i+ "Penkiu simtu radimas: " + kur500);
		}
		//System.out.println( "Penkiu simtu radimas: " + kur500);

		int suma500 = 0;
		int count500 = 0;
		for (int j = 0; j < mas.length; j++) {
			if(mas[j]<=500) {
				continue;
				
			}
//			suma500 +=mas[i];
//			count500++;
			
			//System.out.println(count500 + suma500);
			
		}
	
	}

}
