package abstract_1;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
}
public class Class5 {

	public static void main(String[] args) {
		
		GoodCalc c = new GoodCalc();
		
		System.out.println(c.add(5, 10));
		System.out.println(c.subtract(11, 2));
		System.out.println(c.average(new int[] {1,2,3,4,5}));
	}

}
