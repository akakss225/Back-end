import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {

		var num = 1;
		var str = "Hello World";
		var obj = new Object();
		var fl = 3.14;
		
		System.out.println(num);
		System.out.println(str);
		System.out.println(obj);
		System.out.println(fl);
		
		final double PI = 3.141592;
		
		double radius = 10.0;
		
		double circleArea = radius * radius * PI;
		
		System.out.println(circleArea);
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		System.out.println("name : " + name);
		
		String city = scan.next();
		System.out.println("city : " + city);
		
		int age = scan.nextInt();
		System.out.println("age : " + age);
		
		double weight = scan.nextDouble();
		System.out.println("weight : " + weight);
		
	}

}