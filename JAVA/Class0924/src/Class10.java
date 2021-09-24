import java.io.*;

public class Class10 {

	public static void main(String[] args) {
		// 파일 복사하는 코드
		
		File src = new File("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/test.txt");
		File dest = new File("복사 파일을 붙혀넣을 경로");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
		}

	}

}
