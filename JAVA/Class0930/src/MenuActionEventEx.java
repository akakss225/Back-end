import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame {
	
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		this.setTitle("Menu에 Action리스너 만들기");
		createMenu();
		this.getContentPane().add(imgLabel, BorderLayout.CENTER);
		this.setSize(250, 220);
		this.setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		MenuActionListener listener = new MenuActionListener();
		for(int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
		
	}
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd){
				case "Load":
					if(imgLabel.getIcon() != null) {
						return;
					}
					imgLabel.setIcon(new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/14장/chap14-ex02/images/img.jpg"));
					break;
				case "Hide":
					imgLabel.setVisible(false);
					break;
				case "ReShow":
					imgLabel.setVisible(true);
					break;
				case "Exit":
					System.exit(0);
					break;
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		new MenuActionEventEx();

	}

}
