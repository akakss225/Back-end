import java.awt.Color;

import javax.sound.sampled.AudioSystem;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class Grammar {
	
//	툴팁 : 툴바 위에 마우스커서가 올라가면 무슨 버튼인지 설명이 나오는 것
//	JComponent.setTooltipText(String msg) 이용
//	툴팁 매니저 객체 생성
//	javax.swing.ToolTipManager m = ToolTipManager.sharedInstance();
//	툴팁 활성/비활성
//	m.setEnabled(false);
//	툴팁이 나타나는 최초 지연 시간
//	m.setInitialDelay(1000);
//	툴팁이 켜져있는 지연시간 제어
//	m.setDismissDelay(1000);
//	
//	
//	다이얼로그 만들기
//	다이얼로그란? : 사용자로부터 입력을 받기위한 대화상자
//	JDialog : 스윙에서 다이얼로그를 만들기 위한 슈퍼클래스
//			  최상위 컨테이너
//	300x300크기위 다이얼로그
//	JDialog dialog = new JDialog();  기본 레이아웃은 BorderLayout()
//	dialog.setTitle(msg);
//	dialog.add(new JButton("click!"));
//	dialog.setSize(300, 300);
//	dialog.setVisible(true);
//	>> JFrame과 거의 같음
//	
//	
//	모달 다이얼로그와 모달리스 다이얼로그
//	모달 다이얼로그 : 사용자 입력을 독점하는 다이얼로그. 닫기 전에는 다른창에서 작업을 전혀 할 수 없는 다이얼로그
//	JDialog(Frame owner, String title, boolean modal) >> 생성자에서 마지막값을 true로함.
//	모달리스 다이얼로그 : 다른창과 독립적으로 작동하는 다이얼로그
//	
//	
//	JOptionPane : 간단하고 유용한 팝업 다이얼로그 지원(static)
//	입력 다이얼로그
//	>> String JOptionPane.showInputDialog(String msg);
//	확인 다이얼로그
//	>> int JOptionPane.showConfirmDialog(Component parentComponent, Object msg, String title, int optionType); // 마지막 매개변수는 버튼 종류를 의미
//	메세지 다이얼로그
//	>> void JOptionPane.showMessageDialog(Component parentComponent, Object msg, String title, int optionType); // 마지막 매개변수는 아이콘 모양을 의미
//	
//	
//	파일 다이얼로그 : 파일을 열수있게 하는 다이얼로그 생성
//	JFileChooser : 파일 시스템의 탐색기와 같은 기능을 하는 다이얼로그
//				   사용자에게 파일이나 디렉토리를 쉽게 선택하도록 하는 기능
//	>> 파일 열기 다이얼로그 / 파일 저장 다이얼로그 존재
//	
//   이미지 포맷
//   1. bmp(bitmap)
//   2. gif >> 저해상도. 아이콘. 썸네일 등
//   3. jpg >> 고해상도. 사진 등
//   4. png >> gif와 jpg의 장점을 모아 만듬. 현재 기준값임
//   
//	
//   컬러 다이얼로그
//   JColorChooser
//   >> Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);  두번째 파라미터 : 창 이름 / 세번쨰 파라미터 : 기본값
//   
//   탭팬
//   JTabbedPane : 여러 패널을 겹치게 하여 공간을 공유하도록 지원하는 팬
//   생성자
//   >> JTabbedPane();
//   >> JTabbedPane(int tabPlacement); tabPlacement : JTabbedPane.TOP / JTabbedPane.BOTTOM / JTabbedPane.LEFT / JTabbedPane.RIGHT
//   
//   int getTabCount() : 탭 팬에 붙은 탭의 개수 리턴
//   int getSeletedIndex() : 현재 선택된 탭
//   void remove(Component comp) / void remove(int index) / void removeTabAt(int index) : 탭 삭제
//   void setTabPlacement(int tabPlacement) : 탭 위치변경
//   
//   자바의 오디오 API
//   >> 디지털 오디오
//   >> 미디
//   Clip clip = AudioSystem.getClip();
//   File audioFile = new File("애국기.wav");
//   AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
//   기본적으로 open / play / close의 구조를 갖는다
//   void open(AudioInputStream stream);		: 파일 열기
//   void start();							: 실행
//   void stop();								: 중단
//   void setFramePosition(int frames);		: 오디오 샘플내에 재생할 프레임 위치
//   void loop(int count);					: 현재 프레임의 위치에서 시작해 count만큼 반복
//   void close();							: 오디오 클립의 모든 자원 반환
//   
//   line이벤트
//   : 오디오 재생 과정에서 오디오 클립에 발생하는 이벤트
//   
//   
//   
//   15 장
//   
//   OSI 모형 
//   1. 물리계층
//   2. 데이터링크 계층
//   3. 네트워크 계층		>> IP
//   4. 전송 계층		>> TCP
//   5. 세션 계층		>> 사용자가 서버에 접속한 상태 또는 접속하는 / 행위 SSL(Secure Socket Layer)
//   6. 표현 계층		>> MIDI, ASCII, MPEG등 오디오, 동영상 문자 등
//   7. 응용 계층		>> HTTP(HyperText Transfer Protocol) / SMTP (Simple Mail Transfer Protocol) / FTP (File Transfer Protocol)
//   
//   >> 아래로 내려갈수록 S/W를 나타내고 위로 올라갈수록 H/W를 나타낸다.
//   
//   TCP / IP 소개
//   TCP (Transmission COntrol Protocol) >> 프로토콜? 쌍방이 통신할 떄 필요한 통신 규약
//   : 두 시스템 간에 신뢰성 있는 데이터의 전송을 관장하는 프로토콜. TCP에서 동작하는 응용프로그램 사례 >> e-mail
//   
//   IP
//   IP (Internet Protocol)
//   : 패킷 교환 네트워크에서 송신 호스트와 수신 호스트가 데이터를 주고 받는 것을 관장하는 프로토콜
//   TCP보다 하위 레벨 프로토콜
//   >> 네트워크 상에서 유일하게 식별될 수 있는 컴퓨터 주소
//   4개의 숫자가 .으로 연결됨 ex) 192.168.0.103 >> IPv4 / fe80::40e4:70c0:d25d:a65a%11 >> IPv6
//  	숫자로 된 주소는 기억하기 어려우므로 www.naver.com과 같은 문자열로 구성된 도메인 이름으로 바꿔 사용(url주소)
//  	현재는 32비트의 IP버전 IPv4가 사용되고 있음.
//  	
  	
}
