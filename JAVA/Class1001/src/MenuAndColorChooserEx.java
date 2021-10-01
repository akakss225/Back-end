import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

예제 14-10

public class MenuAndColorChooserEx extends JFrame {
	
	public MenuAndColorChooserEx() {
		
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
