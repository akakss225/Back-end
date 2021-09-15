
public class Circle {
	
	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {

		Circle pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea() + " 입니다." ) ;
		
		Circle donut = new Circle();
		
		donut.radius = 2;
		donut.name = "크리스피";
		
		System.out.println(donut.name + "의 면적은 " + donut.getArea() + " 입니다." ) ;

	}

}
