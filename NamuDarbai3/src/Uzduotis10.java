
public class Uzduotis10 {
	public static void main(String[] args) {
		int rezultatas = pakeltiLaipsniu(5, 2);
		System.out.println("5 kvadratu " + rezultatas);
		System.out.println("256 treciuoju: " + pakeltiLaipsniu(256, 3));
	
		}

	private static int pakeltiLaipsniu(int x, int laipsnis) {
		
		int daugyba = x;
		
		for (int i = 2; i <=laipsnis; i++) {
		   daugyba *= x;	
		}
		return daugyba ;
			
		}
}
