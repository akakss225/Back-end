import java.io.FileReader;

public class Class6 {

	public static void main(String[] args) {
		
		FileReader fin = null;
		
		
		try {
			fin = new FileReader("test");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(Exception e) {
			System.out.println("입출력 오류");
		}

	}

}
