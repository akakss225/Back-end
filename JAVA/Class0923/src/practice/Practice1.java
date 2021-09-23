package practice;

public class Practice1 {

	public static void main(String[] args) {
//		1. 전화번호(010-1234-5678)에서 국번(010)을 추출하시오.
		
		String phone = "010-1234-1234";
		int indexOfDash = phone.indexOf("-");
		
		System.out.println("국번 : " + phone.substring(0, indexOfDash));

	}

}
