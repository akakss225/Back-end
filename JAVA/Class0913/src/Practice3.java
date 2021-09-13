import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 3. 국어,영어,수학 세과목을 키보드 입력을 받아서 평균구하기. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		
		int k = sc.nextInt();
		
		System.out.print("영어 : ");
		
		int e = sc.nextInt();
		
		System.out.print("수학 : ");
		
		int m = sc.nextInt();
		
		double avg = (k + e + m)/ 3;
		
		System.out.println("Average : " + avg);
	}

}
