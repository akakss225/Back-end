import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {

		// 예외처리
		// 예외처리를 반드시 해야하는 경우 : Thread / DB연동작업. << 하지 않을경우 컴파일시 에러가남.
		
		Scanner sc = new Scanner(System.in);
		
		int dividend; // 분자
		int divisor; // 분모
		
		try {
			System.out.print("분자를 입력하시오 : ");
			dividend = sc.nextInt();
			
			System.out.print("분모를 입력하시오 : ");
			divisor = sc.nextInt();
			
			System.out.println(dividend + " / " + divisor + " = " + dividend/divisor);
			sc.close();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("출력 확인");
		}

	}

}
