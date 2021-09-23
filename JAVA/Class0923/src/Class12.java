import java.util.HashMap;

public class Class12 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("kiwi", "키위");
		map.put("strawberry", "딸기");
		System.out.println(map);
		
		String apple = map.get("apple");
		
		System.out.println(apple);
		
		map.remove("apple");
		System.out.println(map);
		

	}

}
