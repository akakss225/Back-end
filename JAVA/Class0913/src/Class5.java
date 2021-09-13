import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수 혹은 홀수를 판단할 정수를 입력하세요 : ");
		int n = sc.nextInt();

		if ( n % 2 == 0) {
			System.out.println(n + "은(는) 짝수입니다.");
		}
		else {
			System.out.println(n + "은(는) 홀수입니다.");
		}
		
		System.out.print("점수를 입력해주세요: ");
		double score = sc.nextDouble();
		
		if( score > 95) {
			System.out.println("A+");
		}
		else if(score > 90) {
			System.out.println("A0");
		}
		else if(score > 85) {
			System.out.println("B+");
		}
		else if(score > 80) {
			System.out.println("B0");
		}
		else if ( score > 75) {
			System.out.println("C+");
		}
		else if ( score > 70) {
			System.out.println("C0");
		}
		else {
			System.out.println("D");
		}
		
		System.out.print("3의 배수 판별: ");
		int three = sc.nextInt();
		if (three % 3 == 0) {
			System.out.println("3의 배수가 맞습니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
		
	}

}
