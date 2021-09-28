import java.awt.Color;

public class Grammar {

	
//	마우스가 눌러진 위치에서 떼어지는 경우 메소드 호출 순서
//	: MousePressed / mouseReleased / mouseClicked
//	
//	마우스가 드래그될 때 호출되는 메소드 호출 순서
//	: mousePressed / mouseDragged / mouse Released
	
//	마우스 포인터 위치 : int getX() / int getY() / Point getPoint()
//	입력된 마우스 버튼 : int getButton()
//	마우스 클릭 횟수 : int getClickCount()
	
//	마우스 휠 이벤트 : 마우스 휠이 구를때 마다 발생하는 이벤트. 이벤트 발생시마다 MouseWheelEvent객체 생성.
//	getWheelRotation() : 값이 음수이면 up / 양수이면 down.
	
//	setBackground(Color.COLOR) : 배경색 설정
//	setOpaque(boolean) : 불투명성 설정
//	setFont(Font) : 폰트 설정
//	setEnabled(boolean) : 컴포넌트 활성화 / 비활성화
	
//	JLabel의 용도 : 문자열이나 이미지를 컴포넌트와 하여 출력하기 위한 목적.
//	>> JLabel(Icon image) : 이미지 레이블 ImageIcon 객체 사용 : ImageIcon img = new ImageIcon("경로");
//	>> JLabel(String text) : 문자열 레이블
//	>> JLabel(String text , Icon Image, sort) : 문자열 , 이미지, 정렬
	
//	버튼에 마우스가 올라갈 때 출력되는 이미지 : setRolloverIcon()
//	버튼을 누르고 있는 동안 ㅜㅊㄹ력되는 이미지 : setPressdIcon()
	
//	체크박스 생성자
//	>> JCheckBox()
//	>> JCheckBox(String text)
//	>> JCheckBox(String text, boolean) 문자열 체크박스, 체크여부
//	>> JCheckBox(String text, Icon image) 문자열과 이미지를 가진 체크박스.
//	item 이벤트 처리 : 체크박스나 라디오 버튼의 선택 상태가 바뀔 때 발생하는 이벤트를 item 이벤트라고 함.
//					itemStateChange(ItemEvent e) >> 추상메소드 존재.
//					>> 주요 메소드 : getStateChange() / getItem()
	
//	라디오 버튼 : 여러 버튼으로 그룹을 형성하고, 하나만 선택되는 기능
//			   다른 버튼이 선택되면 이전에 선택된 버튼은 자동으로 해제됨.
	
//	버튼 그룹 객체 생성 : ButtonGroup group = new ButtonGroup();
//					 btn1, btn2, btn3 >> group.add(btn1) / group.add(btn2) / group.add(btn3)
//			   
//	라디오 버튼 생성자
//	>> JRadioButton()
//	>> JRadioButton(Icon Image) 이미지 라디오버튼
//	>> JRadioButton(Icon Image, boolean selected) 이미지 라디오버튼 , 체크여부
//	>> JRadioButton(String text) 문자열 라디오버튼
//	>> JRadioButton(String text, boolean selected)
//	>> JRadioButton(String text, Icon image) 문자열과 이비지를 가진 라디오 버튼
	
}
