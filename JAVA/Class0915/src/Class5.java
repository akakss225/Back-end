import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요.");
		int sum = 0, n = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " >> ");
			try {
				n = sc.nextInt();
				System.out.println(n);
				sum += n;
			}
			catch(Exception e) {
				System.out.println("정수가 아닙니다. 다시입력하세요. ");
				sc.nextInt();
				i--;
				continue;
			}
		}
		System.out.print("입력된 정수의 합은 " + sum + " 입니다.");

	}

}
