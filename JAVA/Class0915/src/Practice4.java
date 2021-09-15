import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

//		4. 5명의 학생을 저장하는 Student 배열을 만들어서 처리하기.
//		=> scanner사용
		Scanner sc = new Scanner(System.in);
		String name;
		String major;
		
		Student[] s = new Student[5];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.print("Write a Student's name : ");
			name = sc.next();
			System.out.print("Write a Student's major : ");
			major = sc.next();
			s[i].name = name;
			s[i].major = major;
			System.out.println();
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("name : " + s[i].name);
			System.out.println("major : " + s[i].major);
			System.out.println("-------------------------");
		}
		sc.close();

	}

}
