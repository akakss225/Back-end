import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;


public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("Hello");
	public MenuAndColorChooserEx() {
		this.setTitle("JColorChooser");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		this.setSize(250, 200);
		this.setVisible(true);
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
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
				if(selectedColor != null) {
					label.setForeground(selectedColor);
				}
				
			}
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuAndColorChooserEx();
	}


}
