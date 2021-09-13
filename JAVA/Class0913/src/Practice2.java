import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 2. 이름, 학번, 학과를 키보드 입력을 받아서 출력하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Your name : ");
		
		String name = sc.next();
		
		System.out.print("Your StudentID : ");
		
		int studentId = sc.nextInt();
		
		System.out.print("Your Major : ");
		
		String major = sc.next();
		
		System.out.println("성명 : " +name);
		System.out.println("학번 : " +studentId);
		System.out.println("전공 : " +major);
		

	}

}
