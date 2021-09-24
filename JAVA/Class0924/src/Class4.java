
class GStack<T>{ // 제네릭 타입을 임의로 T로 넣어놓으면 모든 타입을 사용 가능.
	int tos;
	Object[] stack;
	public GStack() {
		tos = 0;
		stack = new Object[10];
	}
	public void push(T item) {
		if(tos == 10) {
			return;
		}
		stack[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0) {
			return null;
		}
		tos--;
		return (T)stack[tos];
	}
}

public class Class4 {

	public static void main(String[] args) {
		// 제네릭 스택 만들기.
		
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}
		GStack<Integer> intStack = new GStack<Integer>();
		
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());
		}

	}

}
