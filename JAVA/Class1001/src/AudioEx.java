import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AudioEx extends JFrame {
	private JButton btns[] = {new JButton("play"), new JButton("stop"), new JButton("play again")};
	private Clip clip;
	public AudioEx() {
		this.setTitle("오디오 제거");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyActionListener al = new MyActionListener();
		for(int i = 0; i < btns.length; i++) {
			c.add(btns[i]);
			btns[i].addActionListener(al);
		}
		this.setVisible(true);
		loadAudio("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/14장/chap14-ex12/audio/애국가1절.wav");
	}
	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip(); // 비어있는 오디오클립 만들기
			File audioFile = new File(pathName); // 오디오파일의 경로명
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream); // 재생할 오디오 스트림 열기
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "play" : clip.start(); break;
			case "stop" : clip.stop(); break;
			case "play again" : clip.setFramePosition(0); clip.start(); break;
			}
			
		}
		
	}

	public static void main(String[] args) {
		new AudioEx();

	}

}
