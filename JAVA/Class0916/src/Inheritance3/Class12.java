package Inheritance3;


class A {
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자 A" + x);
	}
}
class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		super(x);
		System.out.println("매개변수 생성자 B" + x);
	}
}


public class Class12 {

	public static void main(String[] args) {
		B b = new B();
		B b2 = new B(2);

	}

}
