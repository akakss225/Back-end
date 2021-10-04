import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다.....");
			socket = listener.accept(); // 클라이언트의 요청이 있어야지 완결이 되는 메소드. 즉, 요청이 없다면 끝나지 않는다.
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputmsg = in.readLine();
				if(inputmsg.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료합니다.");
					break;
				}
				System.out.println("클라이언트 : " + inputmsg);
				System.out.println("보내기 >>");
				String outputmsg = sc.nextLine();
				out.write(outputmsg + "\n");
				out.flush();
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			}
			catch(IOException e) {
				System.out.println("서버와 채팅중 오류가 발생했습니다.");
			}
		}
		
	}

}
