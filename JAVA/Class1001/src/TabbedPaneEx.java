import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class TabbedPaneEx extends JFrame {
	
	public TabbedPaneEx() {
		this.setTitle("옵션 팬 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		this.setSize(250, 250);
		this.setVisible(true);	
	}
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.addTab("tab1", new JLabel(new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/14장/chap14-ex11/images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/14장/chap14-ex11/images/img2.jpg")));
		pane.addTab("ta3", new MyPanel());
		return pane;
	}
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.black);
			g.drawString("tab3에 들거나는 JPanel입니다.", 30, 50);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabbedPaneEx();
	}

}
