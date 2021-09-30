package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Practice2 extends JFrame {
	private JPanel imgPanel = new JPanel();
	public Practice2() {
		this.setTitle("배경색바꾸기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(imgPanel, BorderLayout.CENTER);
		createMenu();
		this.setSize(300, 300);
		this.setVisible(true);
	}
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenuItem[] menuItems = new JMenuItem[3];
		String[] menus = {"RED", "GREEN", "BLUE"};
		JMenu menu = new JMenu("Color");
		
		MenuActionListener listener = new MenuActionListener();
		for(int i = 0; i < menus.length; i++) {
			menuItems[i] = new JMenuItem(menus[i]);
			menuItems[i].addActionListener(listener);
			menu.add(menuItems[i]);
		}
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("RED")) {
				imgPanel.setBackground(Color.RED);
			}
			else if(cmd.equals("GREEN")) {
				imgPanel.setBackground(Color.GREEN);
			}
			else {
				imgPanel.setBackground(Color.BLUE);
			}
		}
		
	}

	public static void main(String[] args) {
//		2. Color 메뉴를 만들어서 메뉴아이템을 클릭해서
//		red => 빨강, green=> 녹색, blue => 파랑 으로 배경색 지정하기
		new Practice2();

	}

}
