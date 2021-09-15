
public class Circle {
	
	int radius;
	String name;
	
	// 생성자를 두개로 만들 수 있음. 
	// 이러한 형태를 다형성중 오버로딩 이라고하며, 두가지 생성자중 아무거나 골라서 사용할 수 있다.
	
	public Circle() {}
	
	public Circle(int r, String n) {
		radius = r; name = n;
	}
	
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
