
class Shape2{
	protected String name;
	
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(this.name);
	}
}

class Circle2 extends Shape2{
	protected String name;
	public void draw() {
		this.name = "Circle";
		super.name = "Shape";
		System.out.println(this.name);
		super.draw();
	}
}

public class Class2 {

	public static void main(String[] args) {
		
		Circle2 c = new Circle2();
		
		c.draw();

	}

}
