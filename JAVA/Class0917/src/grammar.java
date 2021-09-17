
public class grammar {

	public static void main(String[] args) {

		1. 오버라이딩 : 상속받은 클래스에서 부모클래스에 있는 메소드의 내용을 변경하여 사용하는것. 다형성의 하나.
		
		2. @ >> 지시어 + 주석의 역할을 수행함.
		
		3. 추상 메소드 : 선언은 되어있으나 구현이 아직 되어있지 않은 메소드. abstract로 선언.
		 			 추상메소드는 서브클래스에서 오버라이딩하여 구현해야함.
		4. 추상 클래스 : 추상메소드를 하나라도 가진 클래스. 
					  혹은 abstract로 선언된 클래스.
					  자식 클래스의 outline을 미리 제공하는 느낌.
		
		5. 추상클래스 선언 :
//					abstract class Shape {
//					public Shape() {}
//					
//					public abstract void draw() {}
//				}
		 		
		6. 추상 클래스는 객체를 생성할 수 없다. >> 추상클래스를 super클래스로 사용하라는 의미.
		
		
		
	}

}
