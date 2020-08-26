package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutnessTV implements ActionListener {

	JButton button = new JButton();
	JButton b = new JButton();
	JButton bu = new JButton();

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(bu);
		panel.add(b);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
		b.addActionListener(this);
		bu.addActionListener(this);
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {

		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
		// work on some Linux implementations
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg- open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		if (buttonPressed == b) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		if (buttonPressed == bu) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

	}

}
