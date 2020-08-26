package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
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
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed == button) {
		playSound("No Fair sound.wav");
	} if (buttonPressed == b) {
		playSound("Call sound.wav");
	} if (buttonPressed == bu) {
		playSound("Sons sound.wav");
	}

	
	
}




}