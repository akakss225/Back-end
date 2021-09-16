package Inheritance;

public class Class9 {

	public static void main(String[] args) {

		
		Person kim = new Person();
		
		Student song = new Student();
		
		StudentWorker yoo = new StudentWorker();
		
		Researcher na = new Researcher();
		
		Professor jo = new Professor();
		
		System.out.println("------------ kim ------------");
		kim.talk();
		kim.eat();
		kim.walk();
		kim.sleep();
		
		System.out.println("------------ song ------------");
		song.talk();
		song.eat();
		song.walk();
		song.sleep();
		song.study();
		
		System.out.println("------------ yoo ------------");
		yoo.talk();
		yoo.eat();
		yoo.walk();
		yoo.sleep();
		yoo.study();
		yoo.work();
	}

}
