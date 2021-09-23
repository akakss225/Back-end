package practice;

public class Practice2 {

	public static void main(String[] args) {
		// 2. 전화번호(010-1234-5678)에서 '-'을 제거하시오.
		// =>01012345678 로 변경하기.
		
		String phone = "010-1234-1234";
		String num[] = phone.split("-");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}

	}

}
