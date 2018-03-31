
public class Uzduotis11 {
	public static void main(String[] args) {
		int [] fibSkaicius = fibSkaicius(8);
		for(int i = 0; i< fibSkaicius.length; i++) {
		System.out.println(i + fibSkaicius[i]);
		}
		
		}
		private static int[] fibSkaicius(int kiekis) {
			int[]skaicius = new int[kiekis];
			
			skaicius[0]=1;
			skaicius[1]=1;
			for (int i = 0; i < kiekis; i++) {
				skaicius[1] = skaicius[i - 1] + skaicius[i - 2];		
			}	
			
			return skaicius;
		
		}

}
