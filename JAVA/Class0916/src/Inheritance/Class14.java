package Inheritance;

public class Class14 {

	public static void main(String[] args) {

		// 업캐스팅.
		
		Person p1 = new Student();
		Person p2 = new StudentWorker();
		Person p3 = new Researcher();
		Person p4 = new Professor();
		
		if(p1 instanceof Person) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(p1 instanceof Student) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(p2 instanceof Researcher) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
