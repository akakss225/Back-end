
public class Grammar {

//	좌표의 경우 좌측 상단 꼭지점이 0,0 의 값을 갖지만, draw의 경우 좌측 하단이 기준이 된다.
	
//	Color : RGB성분으로 구성. 각성부의 크기는 8비트 ( 0~ 255 )
//	생성자 >> Color(int r, int g, int b) : new Color(int r, int g, int b)
	
//	Font : 폰트를 표현하는 클래스
//	생성자 >> Font(String fontFace, int style, int size) 글꼴, 스타일(고딕, 이텔릭 등과같은), 크기
	
//	도형 그리기
//	1. drawLine : 시작점과 끝점을 설정
//	2. drawOval(int x, int y, int width, int height) : 원 그리기 
//	3. drawRect(int x, int y, int width, int height) : 사각형 그리기
//	4. drawRoundRect(int x, int y, int width, int height, int roundX, int roundY) : 모서리가 둥근 사각형 그리기
//	5. drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) : 원 호 >> start angle은 원호의 시작 각도. arcAngle은 그리는 각도
//	6. drawPolygon(int[] x, int[] y, int n) : 다각형 그리기 int[] x 는 x좌표만 저장됨, int[] y는 y좌표만 저장됨. n은 꼭지점의 갯수이다.
	
//	도형 칠하기
//	1. fillOval(int x, int y, int width, int height)
//	2. fillRect(int x, int y, int width, int height)
//	3. fillRoundRect(int x, int y, int width, int height, int roundX, int roundY)
//	4. fillArc(int x, int y, int width, int height, int startAngle, int arcAngle))
//	5. fillPolygon(int[] x, int[] y, int n)
	
//	스윙에서 이미지를 그리는 두가지 방법
//	1. JLabel을 이용해서 이미지 아이콘을 넣기.
//	2. JPanel에 Graphics를 이용해서 그리기 >> drawImage
//	>> ImageIcon icon = new ImageIcon("이미지경로")
//	>> Image img = icon.getImage();
//	drawImage(Image img, int x, int y, ImageObserver observer) >> ImageObserver : 이미지가 다 그려졌을 때, 통보를 받는 객체를 지정하는 매개변수
//	drawImage() >> 원본사이즈 가져오기
//	drawImage(img, int x, int y, this) >> x, y크기의 이미지
//	drawImage(img, int x, int y, 100, 100, this) >> 화면에 꽉차게
	
//	클리핑이란? : 클리핑 영역에서만 그래픽이 이루어지도록 하는 기능. >> 클리핑 영역이란 하나의 사각형 영역을 의미
//	클리핑이 작동하는 그래픽 기능 : 그리기, 칠하기, 이미지 그리기, 문자열 출력 등
//	>> 쉽게 생각하면, 지정한 사각형 부분을 제외한 나머지 이미지부분을 하얗게 칠해 안나오게 하는것.
//	
//	setClip(int x, int y, int w, int h) : 그래픽 대상 컴포넌트의 xy위치에서 w h 의 사각형 영역을 클리핑 영역으로 지정
//	setRect(int x, int y, int w, int h) : 기종 클리핑 영역과 지정된 사각형 영역의 교집합을 구하여 새로운 클리핑 영역으로 설정
	
//	revalidate() : 컨테이너에 부착된 컴포넌트의 재배치를 지시
//	repaint() : 컨테이너 다시그리기 지시
	
	
	
	
	
	
}
