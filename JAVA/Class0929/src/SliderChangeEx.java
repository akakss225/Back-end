import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class SliderChangeEx extends JFrame {
	
	private JLabel colorLabel;
	private JSlider[] sl = new JSlider[3];
	public SliderChangeEx() {
		this.setTitle("슬라이더와 ChangeEvent예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("SLIDER EXAMPLE");
		for(int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128); // 0~ 255 틱 초기값은 절반값인 128에 놓이게 생성
			sl[i].setPaint
		}
	}

	public static void main(String[] args) {

		

	}

}
