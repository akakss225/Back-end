package AbstractPractice;

// 객체 생성 불가.
abstract class Shape{
	public abstract void draw();
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class Class4 {

	public static void main(String[] args) {

//		Shape s = new Shape(); >> 추상 클래스기 때문에 객체생성 불가. 
		
		Line l = new Line();
		Rect r = new Rect();
		Circle c = new Circle();
		
		l.draw();
		r.draw();
		c.draw();

	}

}
