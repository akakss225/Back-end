import java.io.*;

public class Class10 {

	public static void main(String[] args) {
		// 파일 복사하는 코드
		
		File src = new File("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/test.txt");
		File dest = new File("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/test2.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다." );
			
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
