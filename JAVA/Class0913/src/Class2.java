import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int time = scan.nextInt();
		
		int second = time % 60;
		int min = (time/60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.println(time + "초는");
		System.out.println(hour + "시");
		System.out.println(min + "분");
		System.out.println(second + "초입니다.");
		
		scan.close();
		
		for(int i = 0 ; i < 11; ++i) {
			System.out.println(i);
		}
		
		
		int a = 3, b = 3, c = 3;
		
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	

}
