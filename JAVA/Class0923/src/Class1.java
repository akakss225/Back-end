
public class Class1 {

	public static void main(String[] args) {

		String a = new String("   C#");
		String b = new String(",C++");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열 길이 리턴
		System.out.println( "contains : " + a.contains("#")); // 문자열의 포함 관계
		
		a = a.concat(b); // 문자열 연결 
		System.out.println("a.concat(b) : " + a);
		
		a = a.trim(); // 문자열 앞 뒤 공백제거
		System.out.println("a.trim() : " + a);
		
		a = a.replace("C#", "Java"); // 문자열 대치
		System.out.println("a.replace('C#', 'Java') : " +  a);
		
		String s[] = a.split(","); // 문자열 분리 >> 배열에 저장
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("a.split(',') : " + s[i]);
		}
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브스트링 리턴
		System.out.println("a.substring(5) : " + a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println("a.charAt(2) : " + c);
		
		
	}

}
