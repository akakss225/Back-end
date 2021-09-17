
class Shape{
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Class1 {
	
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {

		Line line = new Line();
		
		// 업캐스팅의 활용
		paint(line); 
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		
		System.out.println("----------------------------------");
		
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		obj = new Shape();
		last.next = obj;
		last = obj;
		
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	}

}
