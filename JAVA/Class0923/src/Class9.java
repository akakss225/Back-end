import java.util.ArrayList;

public class Class9 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Hello");
		arr.add("Hi");
		arr.add("Java");
		System.out.println(arr);
		
		int n = arr.size();
		System.out.println(n);
		
		
		arr.add(2, "Sahni");
		System.out.println(arr);
		
		String str = arr.get(1);
		
		System.out.println(str);
		
		System.out.println(arr.getClass().getSimpleName());
		
		arr.remove(3);
		System.out.println(arr);
		
		arr.clear();
		System.out.println(arr);
		

	}

}
