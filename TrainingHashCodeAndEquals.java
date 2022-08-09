package Entities;

public class TrainingHashCodeAndEquals {

	public static void main(String[] args) {
		Client c1 = new Client("Matheus", "matheus@gmail.com");
		Client c2 = new Client("Matheus", "matheus@gmail.com");
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.equals(c2));
	System.out.println(c1==c2);
	}
}
