package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the default java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the default package, and change the names below.

	String firstImage = "src/_05_body_part_quiz/arnold schwarzenegger.jpeg";
	String secondImage = "src/_05_body_part_quiz/leonardo diCaprio.jpeg";
	String thirdImage = "src/_05_body_part_quiz/morgan freeman.jpeg";
	String fourthImage = "src/_05_body_part_quiz/jack black.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(250, 250);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;

		// 2. Set the size of the window in the initializeGui() method
		initializeGui();
		// 4. Ask the user who this person is and store their answer
		String guess = "";
	
		
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equalsIgnoreCase("Arnold Schwarzenegger")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + " !");
		} else {
			JOptionPane.showMessageDialog(null, "The correct answer is Arnold Schwarzenegger!");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equalsIgnoreCase("Leonardo DiCaprio")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + " !");
		} else {
			JOptionPane.showMessageDialog(null, "The correct answer is Leonardo DiCaprio!");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equalsIgnoreCase("Morgan Freeman")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + " !");
		} else {
			JOptionPane.showMessageDialog(null, "The correct answer is Morgan Freeman!");
		}
		showNextImage();
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equalsIgnoreCase("Jack Black")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + " !");
		} else {
			JOptionPane.showMessageDialog(null, "The correct answer is Jack Black!");
		}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score
JOptionPane.showMessageDialog(null, "Your total/final score is " + score + "!");
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
