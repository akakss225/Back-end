package chat;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private Socket socket = null;
	private Receiver receiver = null;
	private JTextField sender = null; 
	
	public ChatClient() {
		setTitle("클라이언트 채팅창"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout()); //BorderLayout 
		receiver = new Receiver(); // 서버에서 받은 메세지를출력할 컴포넌트
		receiver.setEditable(false); // 편집 불가
		
		sender = new JTextField();
		sender.addActionListener(this);

		c.add(new JScrollPane(receiver),BorderLayout.CENTER); // 스크롤바를 위해  ScrollPane 이용
		c.add(sender,BorderLayout.SOUTH);
		
		setSize(400, 200); // 폭 400  200 �ȼ��� ũ��� ������ ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ��Ÿ������ ����
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver); // ���κ��� �޽��� ������ ���� ������ ����
		th.start();
	}
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성
		// System.out.println("�����");
		receiver.append("서버에 연결 완료");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos); // caret포지션을 가장 마지막으로 이동
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트부터로 입력
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 클라이언트로의 출력
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
				this.append("\n  서버 : " + msg); // 받은 문자열을 JTextArea에 출력
				int pos = this.getText().length();
				this.setCaretPosition(pos); // caret(커서)을 가장 마지막으로 이동
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // JTextFiel에 <Enter>키 처리
		if (e.getSource() == sender) {
			String msg = sender.getText(); // 텍스트 필드에 사용자가 입력한 문자열
			try {
				out.write(msg+"\n"); // 문자열 전송
				out.flush();
				
				receiver.append("\n클라이언트 : " + msg); // JTextArea에 출력
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
				sender.setText(null); // 입력창의 문자열 지움
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}
