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
}
