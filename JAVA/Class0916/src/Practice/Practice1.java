package Practice;

public class Practice1 {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		
		WheelMouse wm = new WheelMouse();
		
		GamingMouse gm = new GamingMouse();
		
		System.out.println("광 마우스\n");
		mouse.left();
		mouse.right();
		System.out.println();
		mouse.mouseMove();
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("휠 마우스\n");
		wm.left();
		wm.right();
		System.out.println();
		wm.mouseMove();
		
		System.out.println();
		wm.scroll();
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("게이밍 마우스\n");
		gm.left(); 
		gm.right();
		System.out.println();
		gm.mouseMove();
		
		System.out.println();
		gm.scroll();
		
		System.out.println();
		System.out.println("속도조절버튼 클릭시");
		gm.speedBtn();
		gm.speedBtn();
		gm.speedBtn();
		gm.speedBtn();
		gm.speedBtn();

	}

}
