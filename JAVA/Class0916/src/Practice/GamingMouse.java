package Practice;

class GamingMouse extends WheelMouse {
	
	private int speed = 1;
	
	public void speedBtn() {
		// cursor speed Button 총 4단계로 구성.
		
		speed++;
		if(speed > 4) {
			speed = 1;
		}
		System.out.println("현재 속도 : " + speed);
		
	}
}
