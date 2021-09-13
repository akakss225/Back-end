
public class Class3 {

	public static void main(String[] args) {

		// 삼항연산.
		int w = 3, z = 5;
		
		System.out.println("두 수의 차는 : " + ((w>z)? (w-z):(z-w)));
		
		byte a = 5;
		// shift 연산자. 비트를 왼쪽 혹은 오른쪽으로 옮긴다. 
		
		// right 의 경우 >> 와 >>> 가 있고, left는 << 가 있다.
		// >>> 와 << 의 경우 항상 빈자리를 0 으로 채우지만, right 연산자의 >> 는 빈자리를 최상위 비트로 채운다.
		// 흔희 최상위 비트는 양의 값 혹은 음의 값을 의미한다.
		// 따라서 >>>는 논리적 오른쪽 시프트라고 하고, >> 는 산술적 오른쪽 시프트라고 한다.
		
		byte b = (byte)(a<<2);
		
		
		System.out.println(a + ", " + b);
	}

}
