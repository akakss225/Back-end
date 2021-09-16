
class StaticSample{
	public int n;
	public static int m;

	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static void f() {
		m = 5;
	}
}

public class Class5 {

	public static void main(String[] args) {

		// static 은 공유한다는 것을 의미함.
		
		StaticSample s1, s2;
		
		s1 = new StaticSample();
		s1.n = 5;
		
		System.out.println("s1.n : " + s1.n);
		System.out.println();
		s1.g();
		System.out.println("s1.g() 실행 , s1.m : " + s1.m);
		System.out.println();
		
		s1.m = 50;
		System.out.println("s1.m = 50 실행, s1.m : " + s1.m);
		System.out.println();
		
		s2 = new StaticSample();
		
		s2.n = 8;
		System.out.println("s2.n : " + s2.n);
		System.out.println();
		
		s2.h();
		System.out.println("s2.h() 실행, s2.m : " + s2.m);
		System.out.println("s2.h() 실행, s1.m : " + s1.m);
		System.out.println();
		
		s2.f();
		System.out.println("s2.f() 실행, s2.m : " + s2.m);
		System.out.println("s2.f() 실행, s1.m : " + s1.m);
		

	}

}
