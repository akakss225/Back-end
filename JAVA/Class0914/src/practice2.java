
public class practice2 {

	public static void main(String[] args) {

//		1. 1부터 100까지 홀수만 출력하기. continue사용
		
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
