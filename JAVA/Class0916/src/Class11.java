
class A{
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}
class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}

public class Class11 {

	public static void main(String[] args) {
		
		// 자식을 호출하려면, 먼저 부모를 호출해야한다.
		// 따라서 마지막 자식인 C를 호출하면 맨위의 부모인 A부터 차례로 B 그리고 마지막에 C가 호출이 된다.
		
		C c = new C();

	}
}
