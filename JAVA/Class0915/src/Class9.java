import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(">> ");
		rect.width = sc.nextInt();
		System.out.print(">> ");
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적 : " + rect.getArea());
		sc.close();

	}

}
