class MethodOverloading{
	public int getSum(int i, int j) {
		return i + j;
	}
	public int getSum(int i, int j, int k) {
		return i+ j + k;
	}
}

public class Class2 {

	public static void main(String[] args) {

		// 메소드 오버로딩 : 이름이 같은 메소드 작성. 매개변수의 갯수나 타입이 서로 다른 경우.
		
		MethodOverloading a = new MethodOverloading();
		
		int i = a.getSum(1, 2);
		
		int j = a.getSum(1, 2, 3);
		
		System.out.println(i);
		System.out.println(j);
		
	}

}
