
public class Grammar {

	public static void main(String[] args) {
		
//		jFrame : 윈도우 역할하는 큰 틀. 이후에 내부에 Label / button 등으로 채우는 것이다.
		
//		vc++	빠르다	학습이어려움	코딩어려움
//		JAVA	중간		중간			중간
//		VB		느리다	학습쉽다		코딩쉽다  >> Visual Basic의 경우 객체지향이 아닌 객체기반 언어이다. 다만 현재는 VB.net으로, 객체지향이 새로 나왔다.
		
//		FlowLayout >> 왼쪽에서 순서대로.    >> JPanel
//		BorderLayout >> 동 서 남 북 중앙   >> JWindow, JFrame, JDialog
//		GridLayout >> 격자
//		
//		Layout생성자는 오버로딩 되어있다.
//		FlowLayout()
//		FlowLayout(int align) // 정렬 방법. 기본값은 중앙정렬임.
//		FlowLayout(int align, int hGap, int vGap) // 정렬방법, 가로간격, 세로간격
//		
//		BorderLayout()
//		BorderLayout(int hGap, int vGap)
//		add(new JButton("asd"), BorderLayout.WEST) >> CENTER가 기본값.
//		
//		GridLayout()
//		GridLayout(int row, int columm, int hGap, int vGap)  행, 열, 세로간격, 가로간격 
		
//		배치관리자가 없는 컨테이너 : 응용프로그램에서 컴포넌트의 절대 크기와 절대 위치결정.
//							  컴포넌트의 크기나 이치를 개발자 임의로 결정하고자 하는 경우에 사용.
//							  게임 프로그램과 같이 시간이나 마우스/ 키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는경우.
		
//		이벤트 소스 : 이벤트를 발생시킨 GUI 컴포넌트
//		이벤트 객체 : 발생한 이벤트에 대한 정보
//		이벤트 리스너 : 이벤트를 처리하는 코드
//		
//		Action : ActionListner 					>> 추상메소드 : void ACtionPerformed()
//		Item : ItemListner 						>> 추상메소드 : 
//		Key : KeyListner 						>> 추상메소드 : 
//		Mouse : MouseListner 					>> 추상메소드 : 
//		Mouse : MouseMotionListner 				>> 추상메소드 : 
//		Focus : FocusListner 					>> 추상메소드 : 
//		ListSelection : ListSelectionListner 	>> 추상메소드 : 
//		Window : WindowListner 					>> 추상메소드 : 
//		Adjustment : AdjustmentListner 			>> 추상메소드 : 
//		Component : ComponentListner 			>> 추상메소드 : 
//		Container : ContainerListner 			>> 추상메소드 : 
		 
//		컴포넌트와 이벤트 리스너를연결하는 방법 >> JButton.addActionListener( new MyButtonListener1() );
		
//		이벤트 리스너 작성 방법
//		1. 독립클래스로 작성 : 이벤트 리스너를 완전한 클래스로 작성
//						  이벤트 리스너를 여러 곳에서 사용할 때 용이.
//		2. 내부클래스로 작성 : 클래스 안에 멤버처럼 클래스 작성
//						  이벤트 리스너를 특정 클래스에서만 사용할 때 적합.
//		3. 익명클래스로 작성 : 클래스의 이름 없이 간단히 리스너 작성
//		4. Event Listener를 직접 상속
		

	}

}
