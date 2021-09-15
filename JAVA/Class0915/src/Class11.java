
public class Class11 {

	public static void main(String[] args) {

		Circle ob1 = new Circle(2, "pizza");
		Circle ob2 = new Circle(5, "donut");
		
		Circle c;
		
		c = ob2;
		
		System.out.println(c.name + " " + c.radius );
		System.out.println(ob1.name + " " + ob1.radius);
		ob1 = ob2;
		System.out.println(ob1.name + " " + ob1.radius);
		
		c.name = "pizza";
		c.radius = 2;
		
		System.out.println(ob2.name + " " + ob2.radius);
	}

}
