package point;

public class Class9 {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);

		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
