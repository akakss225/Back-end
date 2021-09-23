package practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
//		9. 8번을 HashMap을 이용해서 저장하고 출력하시오.
//		key => 책제목, 저자, 출판사, 가격		
		
Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> book = new HashMap<String, String>();
		String check = "yes"; 
		
		while(true) {
			System.out.print("책을 등록하시겠습니까?(yes or no) ");
			check = sc.next();
			if(check.equals("no")) {
				System.out.println("책 등록을 마칩니다.");
				break;
			}
			System.out.println("책 등록을 시작합니다.");
			Book b = new Book();
			
			System.out.print("책 제목 : ");
			b.bookName = sc.next();
			System.out.print("저자 : ");
			b.author = sc.next();
			System.out.print("출판사 : ");
			b.publish = sc.next();
			System.out.print("가격 : ");
			b.price = sc.next();
			
			book.put("첵제목", b.bookName);
			book.put("저자", b.author);
			book.put("출판사", b.publish);
			book.put("가격", b.price);
			System.out.println("----------------------------------");
		}
		System.out.println(book);
		
		sc.close();

	}

}
