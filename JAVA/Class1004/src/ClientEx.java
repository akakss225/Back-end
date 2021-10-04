import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			
		}
		catch(IOException e) {
			
		}
		finally {
			try {
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
