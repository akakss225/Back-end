
public class Class12 {

	public static void main(String[] args) {

		Circle c[] = new Circle[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i + 1);
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}

}
