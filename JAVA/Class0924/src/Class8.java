import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("/Users/sumin/Desktop/Back-end/JAVA/Class0924/src/test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
