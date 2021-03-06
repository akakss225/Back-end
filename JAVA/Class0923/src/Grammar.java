import java.util.Calendar;

public class Grammar {
	
//	스트링 객체는 수정 불가능. 
//	문자열이 같으면 0을 리턴하는 int compareTo(String anotherString) 문법.
//	이 문자열이 anotherString보다 사전에 먼저 나오면 음수 리턴 ( A, B ,C 순서 )
//	반대는 양수 출력. >> ex) String apple = "apple"; /  int i = apple.compareTo("banana") == 음수.
	
	
	
//	StringBuffer : 가변 크기의 문자열 저장 클래스.
//	String 클래스와 달리 문자열(원본) 변경 가능.
//	StringBuffer 객체의 크기는 스트링 길이에 따라 가변적.
//	원본을 직접 변경하기 때문에 메모리를 아낄 수 있는 장점이 있지만, 반대로 원본을 건드리기 때문에 단점이 될 수 있다.
//	
//	메소드 종류 : append(String str) >> 덧붙힌다.
//			   insert(index, String str) >> 인덱스번호 뒤에 덧붙힌다.
//			   replace(start index, end index, String str) >> 시작 인덱스부터 끝 인덱스까지 범위를 대치.
//			   delete(start index, end index) >> 시작 인덱스부터 끝 인덱스 미만까지 삭제.
//			   length() >> 길이 출력.
//			   charAt(index) >> 인덱스자리 문자를 char데이터 타입으로 출력
//			   setLength(num) >> 지정한 숫자만큼 문자열을 앞에서부터 자름.
	
	
	
//	StringTokenizer : 문자열을 분리할 때 사용되는 기준문자
//	ex ) String query = "name = kitae&addr = seoul&age = 21"; / StringTokenizer st = new StringTokenizer(query,"&");
//					  >> 'name = kitae' / 'addr = seoul' / 'age = 21'
	
	
//	Math : 산술연산 메소드 제공. 모든 메소드는 static타입. 클래스 이름으로 바로 호출해야함.
//	static double abs(double a) : 절댓값 리턴.
//	static double cos(double a) : cosine return
//	...
//	Math.PI : 원주율 상수 출력
//	Math.ceil : 올림
//	Math.floor(a) : 내림
//	Math.sqrt(9) : 제곱근 == 3
//	Math.exp(2) : e^2
//	Math.round(num) : 반올림
//	난수 발생 : static double random() : 0.0 ~ 1.0미만의 임의의 double 값 반환.
	
	
//	Calendar : 날짜클래스
//	생성자는 두종류 : Calendar() / Calendar(TimeZone zone, Locale aLocale)
//	다만, 추상클래스기 때문에 new Calendar 하지않음. >> Calendar now = Calendar.getInstance();
	
	
//	제네릭과 컬렉션.
//	collection : 요소(element) 객체들의 저장소. 객체들의 컨테이너라고도 불림.
//				요소의 갯수에 따라 크기 자동 조절. 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동. >> ArrayList와 비슷.
//				고정크기의 배열을 다루는 어려움 해소. 다양한 객체들의 삽입 삭제 검색등의 관리 용이.
//	Vector<E> >>>> ArrayList : 비슷한데, 속도가 개선된 버전이 ArrayList이다.
//	Vector<Interger> v = new Vector<Integer>(); >> <> 안에는 무조건 Wrapper Class를 써야함 ex) Integer / String ...
//	ArrayList : 가변 크기 배열을 구현한 클래스. 
//				벡터와 매우 유사하지만, 벡터와는 달리 스레드 동기화 기능이 없다. >> 속도가 빠름
//	Iterator<E> : Vector , ArrayList등이 상속받는 인터페이스.
//				  리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 메소드를 포함한다.
//				  boolean hasNext() : 방문할 요소가 남아있으면 true
//				  E next() : 다음 요소 리턴 
//	HashMap<K,V> : 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션.
//				   K는 키로 사용할 요소의 타입, V는 값으로 사용할 요소의 타입 지정.
//				   키와 값이 한쌍으로 삽입. >> 일종의 딕셔너리
//				   키는 해시맵에 삽입되는 위치 결정에 사용.
//				   값을 검색하기 위해서는 반드시 키 이용.
//				   요소 삽입 : put()
//				   요소 검색 : get()
	
	
	

}
