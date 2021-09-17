
public class Class10 {

	public static void main(String[] args) {
		
		// wrapper 
		
		System.out.println(Character.toLowerCase('A')); // A를 소문자로.
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + " 는 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + " 는 영문자");
		}
		
		System.out.println(Integer.parseInt("-123")); // "-123" 을 10진수로 변환.
		System.out.println(Integer.toHexString(28)); // 정수 28을 6진수 정수로 변환.
		
	}

}
