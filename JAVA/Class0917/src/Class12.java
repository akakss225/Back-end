
public class Class12 {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "Java";
		String c = "Hello"; // 같은 문자열이 생성되는 경우, 맨 처음 만들어놓은 레퍼런스를 공유한다. 즉, c == a가 됨.
		
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java"); 
		
		System.out.println(a.equals(c)); // true
		System.out.println(e.equals(f)); // true
		
		System.out.println(a.concat(b)); // 원본 변화없이 두 문자열을 합치는 메소드
		
	}

}
