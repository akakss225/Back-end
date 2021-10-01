import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class Grammar {
	
	툴팁 : 툴바 위에 마우스커서가 올라가면 무슨 버튼인지 설명이 나오는 것
	JComponent.setTooltipText(String msg) 이용
	툴팁 매니저 객체 생성
	javax.swing.ToolTipManager m = ToolTipManager.sharedInstance();
	툴팁 활성/비활성
	m.setEnabled(false);
	툴팁이 나타나는 최초 지연 시간
	m.setInitialDelay(1000);
	툴팁이 켜져있는 지연시간 제어
	m.setDismissDelay(1000);
	
	
	다이얼로그 만들기
	다이얼로그란? : 사용자로부터 입력을 받기위한 대화상자
	JDialog : 스윙에서 다이얼로그를 만들기 위한 슈퍼클래스
			  최상위 컨테이너
	300x300크기위 다이얼로그
	JDialog dialog = new JDialog();  기본 레이아웃은 BorderLayout()
	dialog.setTitle(msg);
	dialog.add(new JButton("click!"));
	dialog.setSize(300, 300);
	dialog.setVisible(true);
	>> JFrame과 거의 같음
	
	
	모달 다이얼로그와 모달리스 다이얼로그
	모달 다이얼로그 : 사용자 입력을 독점하는 다이얼로그. 닫기 전에는 다른창에서 작업을 전혀 할 수 없는 다이얼로그
	JDialog(Frame owner, String title, boolean modal) >> 생성자에서 마지막값을 true로함.
	모달리스 다이얼로그 : 다른창과 독립적으로 작동하는 다이얼로그
	
	
	JOptionPane : 간단하고 유용한 팝업 다이얼로그 지원(static)
	입력 다이얼로그
	>> String JOptionPane.showInputDialog(String msg);
	확인 다이얼로그
	>> int JOptionPane.showConfirmDialog(Component parentComponent, Object msg, String title, int optionType); // 마지막 매개변수는 버튼 종류를 의미
	메세지 다이얼로그
	>> void JOptionPane.showMessageDialog(Component parentComponent, Object msg, String title, int optionType); // 마지막 매개변수는 아이콘 모양을 의미
	
	
	파일 다이얼로그 : 파일을 열수있게 하는 다이얼로그 생성
	JFileChooser : 파일 시스템의 탐색기와 같은 기능을 하는 다이얼로그
				   사용자에게 파일이나 디렉토리를 쉽게 선택하도록 하는 기능
	>> 파일 열기 다이얼로그 / 파일 저장 다이얼로그 존재
	
   이미지 포맷
   1. bmp(bitmap)
   2. gif >> 저해상도. 아이콘. 썸네일 등
   3. jpg >> 고해상도. 사진 등
   4. png >> gif와 jpg의 장점을 모아 만듬. 현재 기준값임
   
	
   컬러 다이얼로그
   JColorChooser
   >> Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);  두번째 파라미터 : 창 이름 / 세번쨰 파라미터 : 기본값
   
   탭팬
   JTabbedPane : 여러 패널을 겹치게 하여 공간을 공유하도록 지원하는 팬
   생성자
   >> JTabbedPane();
   >> JTabbedPane(int tabPlacement); tabPlacement : JTabbedPane.TOP / JTabbedPane.BOTTOM / JTabbedPane.LEFT / JTabbedPane.RIGHT
   
   int getTabCount() : 탭 팬에 붙은 탭의 개수 리턴
   int getSeletedIndex() : 현재 선택된 탭
   void remove(Component comp) / void remove(int index) / void removeTabAt(int index) : 탭 삭제
   void setTabPlacement(int tabPlacement) : 탭 위치변경
   
	
	

}
