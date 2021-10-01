import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LineEventEx extends JFrame {
	
	private Clip clip;
	private String song = "/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/14장/chap14-ex13/audio/애국가1절.wav";
	private JLabel label = new JLabel(song);
	
	public LineEventEx() {
		this.setTitle("애국가 1절 연주");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		c.add(label);
		this.setSize(300,150);
		this.setVisible(true);
		
		loadAudio(song);
		
	}
	private void loadAudio(String pathName) {
		try {
			File audioFile = new File(pathName);
			final AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			
			clip.addLineListener(new LineListener() {
				public void update(LineEvent e) {
					if(e.getType() == LineEvent.Type.STOP) {
						try {
							getContentPane().setBackground(Color.ORANGE);
							label.setText(song + "연주 끝");
							audioStream.close();
						}
						catch(Exception e1) {
							e1.printStackTrace();
						}
					}
				}
			});
			clip.open(audioStream);
			clip.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LineEventEx();
	}

}
