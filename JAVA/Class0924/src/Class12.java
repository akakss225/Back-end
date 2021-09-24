import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class12 {

	public static void main(String[] args) {
		// 이미지 고속복사 ( 버퍼를 이용 )
		File src = new File("/Users/sumin/Desktop/WEB/WEB_tutorial/Portfolio/img/slide5.jpeg");
		File dest = new File("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/dest2.jpeg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10]; // 10KB 버퍼
			while(true) {
				int n = fi.read(buf);
				fo.write(buf,0,n); // buf[0] 부터 n바이트 쓰기
				if(n < buf.length) {
					break;
				}
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
