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
	
//	텍스트필드 : 한줄짜리 텍스트 입력창을 구현한 컴포넌트
//	
//	생성자
//	>> JTextField()
//	>> JTextField(int cols) 입력창의 열의 개수가 cols개인 텍스트필드
//	>> JTextField(String text) text문자열로 초기화된 텍스트필드
//	>> JTextField(String text, int cols)
//	문자열 편집 불가능하게 하기 : JTextField.setEditable(false);
//	입력창에 문자열 출력 : JTextField.setText("Hello");
//	문자열의 폰트 지정 : JTextField.setFont(new Font("고딕체", Font.ITALIC, 20));
	
//	텍스트 영역 : 여러줄을 입력할 수 있는 텍스트 입력창
//
//	생성자
//	>> JTextArea()
//	>> JTextArea(int rows, int cols) row x cols의 텍스트영엉
//	>> JTextArea(String text) text문자열로 초기화된 텍스트영역
//	>> JTextArea(String text, int rows, int cols)
//	추가적으로 new JScrollPane(new JTextArea()) 를 이용해 텍스트영역에 스크롤을 추가하여 코딩한다.
	
//	JList : 여러개의 아이템을 리스트 형식으로 보여주고 선택하는 컴포넌트
//	
//	생성자
//	>> JList<E>()
//	>> JList<E>(E array) 배열을 넣음
//	>> JList<ImageIcon>(ImageIcon img) 이미지로 리스트를 만듬
//	마찬가지로 스크롤이 생성되게 하려면, JScrollPane(new JList()) 을 이용.
	
//	리스트를 수정하는 간단한 방법
//	Vector<String> v = new Vector<String>(); ~~ 데이터
//	v.add("이름1");
//	v.add("이름2");
//	JList<String> nameList = new JList<String>(v); >> 데이터를 담당하는 v를 넣어서 생성자를 만듬 ~~ ui
//	
//	벡터 v를 수정하고, 벡터 v를 리스트에 다시 담기
//	v.add("이름3");
//	nameList.setListData(v); >> 일종의 새로고침.
	
//	JComboBox<E> : 텍스트 필드와 버튼, 그리고 드롭다운 리스트로 구성
//	
//	생성자
//	>> JComboBox<E>()
//	>> JComboBox<E>(Vector ListData) 벡터로부터 아이템을 공급받는 콤보박스
//	>> JComboBox<E>(Object[] ListData) 배열로부터 아이템을 공급받는 콤보박스
	
//	JSlider : 마우스로 움직이면서 값을 선택하는 컴포넌트
//	
//	생성자
//	>> JSlider()
//	>> JSlider(int orientation) orientation  방향의 슬라이더 생성 : JSlider.HORIZONTAL > 수평  /  JSlider.VERTICAL 수직
//	>> JSlider(int min, int max, int val) 최소, 최대, 초기값을 가진 슬라이더 생성
//	ChangeListener와 함께 사용. 

	
	
	
	
//	****** MVC 패턴 ******
//	Model : 데이터
//	View : ui
//	Controller : 로직
//	>> 데이터와 ui와 로직을 분리해서 개발.
//	
//	~~ 예전에는 분리없이 개발을 했음. 이후에 처음 ui를 분리가 되고, 그 다음엔 데이터, 로직 순서대로 분리가 되어 작업이 됐음.
//	>> UI분리 : 디자이너와의 협업 편리 / Data분리 : Data 관리, DB연동 등이 편리
//	**********************
	
	
	
	
	
}
