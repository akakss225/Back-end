package practice;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
//		7. 아이디에 !,@,#,$,%,^가 포함된 경우
//		'아이디에 !,@,#,$,%,^가 포함되면 안됩니다.'
//		메시지 출력하기. charAt()참고.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			if(id.contains("!") || id.contains("@") || id.contains("#") || id.contains("$") ||
					id.contains("%") || id.contains("^")) {
				System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
			}
			else {
				System.out.println("Your id : " + id);
				break;
			}
		}
		
	
		
		
	}

}


