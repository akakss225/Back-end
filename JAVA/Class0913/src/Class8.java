
public class Class8 {

	public static void main(String[] args) {
		final int N = 10;

		for(int i = N; i >= 0; i--) {
			for(int j = 0; j <= N; j++) {
				if(j >= i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if (i < 10) {
				System.out.print(i + " + ");
			}
			else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);

	}

}
