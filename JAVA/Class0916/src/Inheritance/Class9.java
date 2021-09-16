package Inheritance;

public class Class9 {

	public static void main(String[] args) {

		
		Person kim = new Person();
		
		Student song = new Student();
		
		StudentWorker yoo = new StudentWorker();
		
		Researcher la = new Researcher();
		
		Professor jo = new Professor();
		
		System.out.println("---------------------- Kim ------------");
		kim.name = "min";
		System.out.println(kim.name);
		kim.talk();
		kim.eat();
		kim.walk();
		kim.sleep();
		
		System.out.println("---------------------- Song ------------");
		song.name = "su min";
		System.out.println(song.name);
		song.talk();
		song.eat();
		song.walk();
		song.sleep();
		song.study();
		
		System.out.println("---------------------- Yoo ------------");
		yoo.name = "seung jong";
		System.out.println(yoo.name);
		yoo.talk();
		yoo.eat();
		yoo.walk();
		yoo.sleep();
		yoo.study();
		yoo.work();
		
		System.out.println("---------------------- La ------------");
		la.name = "ho jun";
		System.out.println(la.name);
		la.talk();
		la.eat();
		la.walk();
		la.sleep();
		la.research();
		
		System.out.println("---------------------- Jo ------------");
		jo.name = "jae young";
		System.out.println(jo.name);
		jo.talk();
		jo.eat();
		jo.walk();
		jo.sleep();
		jo.research();
		jo.teach();
	}

}
