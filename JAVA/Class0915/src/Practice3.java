class Triangle{
	int width;
	int height;
	
	public Triangle() {
		
	}
	public Triangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public double getSize() {
		return (this.width * this.height)/2;
	}
}

public class Practice3 {

	public static void main(String[] args) {
		
//		3. 삼각형클래스를 만들어서 삼각형의 면적을 구하시오.
		
		Triangle t = new Triangle(5, 10);
		
		System.out.println(t.getSize());
				
	}

}
