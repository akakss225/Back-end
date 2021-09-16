
class Sample{
	public int a;
	
	// 본인 클래스에서만 사용 가능. 같은 패키지 내부라도 private지정자는 다른 클래스에서 사용 불가능.
	private int b;
	
	int c;
	
	Sample(){}
	Sample(int b){
		this.b = b;
	}
}

public class Class4 {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		aClass.a = 10;
		// aClass.b = 10;
		aClass.c = 10;
		
		System.out.println(aClass.a + " " + aClass.c);
		
		Sample sample = new Sample(10);
		
		System.out.println(sample.b);
		

	}

}
