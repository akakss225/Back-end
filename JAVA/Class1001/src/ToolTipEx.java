import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	JButton btnNew = null;
	public ToolTipEx() {
		this.setTitle("ToolBar 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.contentPane = getContentPane();
		createToolBar(); // 툴바 생성
		
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	protected void createToolBar() {
		JToolBar toolBar = new JToolBar("Song Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// new 메뉴를 클릭했을때 할 작업
				System.out.println("New");
			}
		});
		btnNew.setToolTipText("New");
		toolBar.add(btnNew);
		
		this.contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolTipEx();
	}

}
