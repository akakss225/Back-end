import java.util.ArrayList;
import java.util.Scanner;

public class Practice7 {
	

	public static void main(String[] args) {


//6. 학생 이름, 국어, 영어, 수학 점수를 입력하여 평균을 구하는 
//프로그램을 작성하시오. 계속 반복하다가 "exit"를 입력하면 종료.
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList exit = new ArrayList();
		
		
		while(true) {
			System.out.print("Write a Student's name : ");
			String name = sc.next();
			exit.add(name);
			System.out.print("Write a Language score: ");
			int lan = sc.nextInt();
			exit.add(lan);
			System.out.print("Write a English score: ");
			int eng = sc.nextInt();
			exit.add(eng);
			System.out.print("Write a Math score: ");
			int math = sc.nextInt();
			exit.add(math);
			double avg = (lan + eng + math) / 3;
			
			System.out.println();
			
			System.out.println("Name : " + name);
			System.out.println("Language : " + lan);
			System.out.println("English : " + eng);
			System.out.println("Math : " + math);
			System.out.println("average : " + avg);
			
			System.out.println("-----------------------------");
			if(exit.contains("exit")) {
				break;
			}
			
			}
		}

	}

