import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		while(true) {
			System.out.print("분자를 입력해주세요 : ");
			dividend = sc.nextInt();
			System.out.print("분모를 입력해주세요 : ");
			divisor = sc.nextInt();
			
			try {
				System.out.println(dividend + " / " + divisor + " = " + dividend/divisor);
				break;
			}
			catch(Exception e){
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
			}
			
			
		}
		sc.close();
	}

}
