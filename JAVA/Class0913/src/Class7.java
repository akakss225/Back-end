import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Order : ");
		String order = sc.next();
		
		int price = 0;
		
		switch (order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라뗴":
				price = 3500;
				break;
			case "아메리카노":
				price = 2000;
				break;
			default:
				System.out.println("없는 메뉴입니다.");
		
		}
		
		if( price != 0 ) {
			System.out.println("ordered : " + price);
		}
		else {
			System.out.println("메뉴를 택해주세요.");
		}
		sc.close();
		
		
	}

}
