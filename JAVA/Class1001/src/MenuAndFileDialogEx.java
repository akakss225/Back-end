import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	public MenuAndFileDialogEx() {
		this.setTitle("Menu와 JFileChooser활용예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imgLabel);
		createMenu();
		
		this.setSize(350, 200);
		this.setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Images","jpg", "gif", "png");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imgLabel.setIcon(new ImageIcon(filePath));
			
			pack(); // 이미지 크기에 맞춰 프레임 크기 조절
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuAndFileDialogEx();
	}

}
