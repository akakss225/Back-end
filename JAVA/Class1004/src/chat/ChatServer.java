package chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatServer extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver; // 
	private JTextField sender; // 

	
	public ChatServer() {
		setTitle("채팅 프로그램"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout()); //BorderLayout 배치관리자의 사용
		receiver = new Receiver(); // 클라이언트에서 받은 메세지를 출력할 컴포넌트
		receiver.setEditable(false); // 편집 불가

		sender = new JTextField(); // 메세지를 입력할 컴포넌트
		sender.addActionListener(this);

		add(new JScrollPane(receiver),BorderLayout.CENTER); // 스크롤바
		add(sender,BorderLayout.SOUTH);
		
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver); // 상대로부터 메세지 수신을 위한 스레드 생성
		th.start();
	}
	private void setupConnection() throws IOException {
		listener = new ServerSocket(9999); // 서버 소켓 생성
		socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
		receiver.append("클라이언트 접속 완료");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버로부터 출력
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 서버에서 입력
	}

	private static void handleError(String string) { 
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String msg = null;
			while (true) {
				try {
					msg = in.readLine(); // 상대로부터 한 행의 문자열 받기
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				this.append("\n클라이언트 : " + msg); // 받은 문자열을 JTextArea에 출력
				int pos = this.getText().length(); // TextArea의 길이를 구해서 그 길이 만큼 스크롤의 위치를 내려줌
				this.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동. 스크롤을 자동으로 맨 아래로 내려줌
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // JTextField에 <Enter> 키 처리
		if (e.getSource() == sender) {
			String msg = sender.getText(); // 텍스트 필드에서 문자열 얻어옴
			try {
				out.write(msg+"\n"); // 문자열 전송
				out.flush();
				
				receiver.append("\n서버 : " + msg);// JTextArea에 출력
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
				sender.setText(null); // 입력창의 문자열 지움
			} catch (IOException e1) {
				handleError(e1.getMessage()); 
			} 
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}
