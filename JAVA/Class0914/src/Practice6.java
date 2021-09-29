
public class Practice6 {

	public static void main(String[] args) {
//		5. 다음과 같은 형식으로 출력하시오.이중for문
//	      *
//	     ***
//	    *****
//	   *******  
//	  *********
		
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j < 10 -i; j++) {
				System.out.print(" ");
				
			}
			for(int k = 0; k < 2 * i + 1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
