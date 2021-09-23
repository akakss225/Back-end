import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Write a numbers(3) : ");
		String check = scan.nextLine();
		StringTokenizer st = new StringTokenizer(check, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
		
		ArrayList arr = new ArrayList();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(0).getClass().getSimpleName());
		
	}

}
