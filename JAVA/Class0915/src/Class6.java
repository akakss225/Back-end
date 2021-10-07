
public class Class6 {

	public static void main(String[] args) {

		String[] numbers = {"23", "12", "3.141592", "998"};
		
		for(int i = 0; i < numbers.length; i++) {
			try {
				int j = Integer.parseInt(numbers[i]);
				System.out.println("숫자로 변환된 값 : " + j);
			}
			catch(NumberFormatException e) {
				System.out.println(numbers[i] + " 는 정수로 변환할 수 없습니다.");
				continue;
			}
		}

	}

}
