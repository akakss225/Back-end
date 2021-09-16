package Practice;

class WheelMouse extends Mouse {
	
	public void scroll() {
		System.out.println("스크롤 휠 회전 >> 스크롤 휠 인코더 디스크 회전 >> 2가지 구형파 발생 >>");
		System.out.println("DSP에 입력 >> 구형파 간 위상 비교 >> 스크롤 방향 판단 >> 스크롤 이동.");
		System.out.println(" ++) 추가적으로 입력되는 구형파의 갯수를 산출해 이동량과 속도를 계산한다.");
	}
}
