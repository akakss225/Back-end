import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		// 4. 입력한 값이 홀수인지 짝수인지 판별하는 프로그램 작성하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("판별하고자 하는 숫자를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다. ");
		}
		else {
			System.out.println(num + "은(는) 홀수입니다. ");
		}
	
	}

}
