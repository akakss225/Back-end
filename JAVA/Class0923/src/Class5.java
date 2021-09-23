import java.util.Random;

public class Class5 {

	public static void main(String[] args) {

		// Random
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random() * 100 + 1));
		
		Random r = new Random();
		
		System.out.println(r.nextInt(100));

	}

}
