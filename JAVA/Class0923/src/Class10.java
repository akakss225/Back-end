import java.util.ArrayList;
import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String s = sc.next();
			a.add(s);
		}
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longestindex = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(longestindex).length() < a.get(i).length()) {
				longestindex = i;
			}
		}
		System.out.println("\n가장 긴 이름 출력 : " + a.get(longestindex));
		sc.close();
	}
	

}
