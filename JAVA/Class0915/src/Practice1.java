import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
//		1. 학생5명의 이름, 학과를 저장할 배열을 만들어서 
//		배열에 저장하고, 출력하시오.
//		배열.scanner.for문 사용

		String[][] students = new String[5][2];
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String major;
		
		for(int i = 0; i < students.length; i++) {
			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			System.out.print("전공을 입력해주세요 : ");
			major = sc.next();
			
			students[i][0] = name;
			students[i][1] = major;
			System.out.println("-----------------------");
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("name : " + students[i][0]);
			System.out.println("major : " + students[i][1]);
			System.out.println("-----------------------");
		}
		
	}

}
