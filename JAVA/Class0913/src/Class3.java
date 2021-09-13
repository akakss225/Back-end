
public class Class3 {

	public static void main(String[] args) {

		// 삼항연산.
		int w = 3, z = 5;
		
		System.out.println("두 수의 차는 : " + ((w>z)? (w-z):(z-w)));
		
		byte a = 5;
		
		byte b = (byte)(a<<2);
		
		System.out.println(a + ", " + b);
	}

}
