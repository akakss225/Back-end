
public class Class7 {

	public static void main(String[] args) {

		Human sumin = new Human();
		
		sumin.age = 27;
		sumin.hobby = "Singing";
		
		
		System.out.println("Animal Class Extends Method");
		System.out.println();
		sumin.love();
		sumin.sleep();
		sumin.eat();
		
		System.out.println("---------------------------");
		System.out.println("Human Class");
		System.out.println();
		sumin.cry();
		sumin.laugh();
		sumin.work();

	}

}
