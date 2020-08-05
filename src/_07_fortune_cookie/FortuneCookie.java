package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "You will be very happy when you grow up!");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will be very rich!");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will have a very fun life!");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will live very long!");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will be whatever you want!");
		}
		JOptionPane.showMessageDialog(null, "Woohoo");

	}

}
