import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx3 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx3() {
		this.setTitle("이미지 일부분을 잘라내어 이미지 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/12장/chap12-ex07/images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 20, 250, 100,/*원본이미지 시작위치*/ 100, 50, 200, 200, this); // this앞 4개가 원본 이미지에서 자르는 부분을 의미. 시작지점(100, 50) 끝지점(200, 200)
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx3();
	}

}
