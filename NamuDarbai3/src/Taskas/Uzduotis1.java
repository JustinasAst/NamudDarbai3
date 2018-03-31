package Taskas;

public class Uzduotis1 {
public static void main(String[] args) {
		
		Taskas taskas = new Taskas();
		taskas.setX(10);
		taskas.setY(20);
		
		int x = taskas.getX();
		taskas.setX(taskas.getY());
		taskas.setY(x);
		
		System.out.println();
	}
	

}
