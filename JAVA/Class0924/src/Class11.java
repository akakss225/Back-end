import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class11 {

	public static void main(String[] args) {
		// 이미지 복사 코드
		
		File src = new File("/Users/sumin/Desktop/WEB/WEB_tutorial/Portfolio/img/java.jpeg");
		File dest = new File("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/dest.jpeg"); // 복사 할 경로 뒤에 복사할 이름.
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		
		

	}

}
