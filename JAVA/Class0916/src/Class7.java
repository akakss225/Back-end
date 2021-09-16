
class StaticMethod{
	int n;
	static int m;
	void f1(int x) {n = x;}
	void f2(int x) {m = x;}
	
//	static void s1(int x) {n = x;} // non-static int n 이기 때문에 접근 불가.
//	static void s2(int x) {f1(3);} // 마찬가지.
	
	static void s3(int x) {m = x;}
	static void s4(int x) {s3(3);}
	
			
	}


public class Class7 {

	public static void main(String[] args) {

		// static 메소드는 non-static 멤버 접근을 할 수 없음.
		
		

	}

}
