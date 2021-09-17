
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
		
		
7. 인터페이스또한 객체 생성 불가. >> 상속전용.

8. 인터페이스 타입의 레퍼런스 변수 선언 가능 >> PhoneInterface galaxy;

9. 안터페이스를 상속받는 클래스는 인터페이스의 모든 추상메소드를 반드시 구현해야함.

10. 인터페이스를 상속받는 class는 implements사용, but 인터페이스가 인터페이스를 상속받을땐 extends사용.
		
11. 추상과 인터페이스의 유사점 : 객체를 생성할 수 없고, 상속을 위한 슈퍼클래스로만 사용가능
						  클래스의 다형성을 실현하기 위한 목적 >> 오버라이딩
								  
12. 추상과 인터페이스의 차이점 : 추상클래스의 경우 추상메소드와 일반메소드 모두 포함. 상수와 변수필드를 모두 포함함
						  인터페이스의 경우 변수필드는 포함하지 않음. 상수, 추상메소드, 일반메소드, default 메소드 static 메소드 모두 포함. 다중상속지원.
								  
13. 패키지 :
			java.lang >> 스트링, 수학함수, 입출력 등 자바프로그래밍에 필요한 기본적인 클래스와 인터페이스. 자동으로 import됨.
			java.util >> 유틸리티 패키지.
			
14. Wrapper클래스 : 기본타입 >> byte / short /    int    / long /   char    / float / double / boolean
				  Wrapper>> Byte / Short / Interger / Long / Character / Float / Double / Boolean
				  변수 선언 방법 >> Interger i = Interger.valueOf("10");
				   			    Double d = Double.valueOf("3.14");
							    Boolea b = Boolea.valueOf(true);

15. static int parseInt(String s) : 문자열 s를 10진 정수로 변환한 값 리턴. >> int i = Interger.parseInt("123"); >> i = 123
																   >> String s = Interger.toString(123) >> s = "123"

16. 박싱 >> 기본 타입의 값을 Wrapper 객체로 변환. 
    언박싱 >> Wrapper 객체에 들어있는 기본 타입의 값을 빼내는 것.

17. String - java.lang.String 

		
	}

}
