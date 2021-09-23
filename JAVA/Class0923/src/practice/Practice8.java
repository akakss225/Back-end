package practice;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	String bookName;
	String author;
	String publish;
	String price;
	public Book() {
		 
	}
	public String toString() {
		return "(" + bookName + ", " + author + ", " + publish + ", " + price + ")";
	}
	
}

public class Practice8 {

	public static void main(String[] args) {
//		8. 책제목, 저자, 출판사, 가격을 
//		키보드 입력을 통해서 ArrayList에 저장하시오.
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> book = new ArrayList<Book>();
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
			
			book.add(b);
			System.out.println("----------------------------------");
		}
		System.out.println(book);
		
		sc.close();

	}

}
