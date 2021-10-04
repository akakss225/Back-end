import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localHost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("보내기 >>");
				String outputmsg = sc.nextLine();
				if(outputmsg.equalsIgnoreCase("bye")) {
					out.write(outputmsg + "\n");
					out.flush();
					break;
				}
				out.write(outputmsg + "\n");
				out.flush();
				String inputmsg = in.readLine();
				System.out.println("서버 : " + inputmsg);
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(sc != null) {
					sc.close();
				}
				if(socket != null) { // null point exception, 이게 좋은코드임
					socket.close();
				}
			}
			catch(IOException e) {
				System.out.println("서버와 채팅중 오류가 발생했습니다.");
			}
		}

	}

}
