
public class Class1 {

	public static void main(String[] args) {

		// static : 실행되기 전에 미리 준비됨. ( 정적 메소드 )
		// dynamic : 실행후에 이루어짐. ( 동적 메소드 )
		
		// CLI(Command Line Interface) : 이를테면 터미널.
		// GUI(Graphic User Interface)
		
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]); // 문자열을 실수 double타입으로 변환시켜주는 메소드.
		}
		
		System.out.println("합계 : " + sum);

	}

}
