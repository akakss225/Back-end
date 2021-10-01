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
	

}
