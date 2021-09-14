
public class Practice5 {

	public static void main(String[] args) {

//		4. 다음과 같은 형식으로 출력하시오.이중for문
//		*****
//		****
//		***
//		**
//		*

		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > 0; j--) {
				if ( j > i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
