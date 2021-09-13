import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		final double PI = 3.14D;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius : ");
		
		double radius = sc.nextDouble();
		
		double circle = radius * radius * PI;
		
		System.out.println("Circle's Size is " + circle);

	}

}
