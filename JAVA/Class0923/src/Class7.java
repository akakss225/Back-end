import java.util.Vector;

public class Class7 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);
		
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		int n = v.size();
		int c = v.capacity();
		
		System.out.println(n); // 요소의 갯수 << 실질적으로 중요한 속성
		System.out.println(c); // 벡터의 용량
		
		v.add(2, 100); // add메소드의 오버로딩/ 인덱스 2번의 자리에 100을 넣으라는 명령어. 이후의 요소는 자동정렬 됨.
					   // 다만, Python의 리스트처럼, 내부적으로는 이후의 요소의 갯수 n만큼의 수행시간을 들인다.
		
		
		System.out.println(v);
		
		Integer obj = v.get(1);
		int i = obj.intValue();
		System.out.println(i);
		
		v.remove(3);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
	}

}
