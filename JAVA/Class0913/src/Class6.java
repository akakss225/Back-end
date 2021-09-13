import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String grade;
		
		System.out.print("Write your score ");
		
		int score = sc.nextInt();
		
		switch ( score/ 10) { // 조건에 들어가는 값은 문자, 정수, 문자열 리터럴만 허용한다.
			case 10:
				grade = "A+";
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
			
		}
		System.out.println("학점 : " + grade);
		sc.close();
		
	}

}
