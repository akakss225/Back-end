
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
	
	스윙에서 이미지를 그리는 두가지 방법
	1. JLabel을 이용해서 이미지 아이콘을 넣기.
	2. JPanel에 Graphics를 이용해서 그리기 >> drawImage
	
	
	
	
}
