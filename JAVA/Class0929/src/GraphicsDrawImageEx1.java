import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx1() {
		this.setTitle("패널 크기에 맞추어 이미지 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(300, 420);
		this.setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/12장/chap12-ex07/images/image0.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx1();
	}

}