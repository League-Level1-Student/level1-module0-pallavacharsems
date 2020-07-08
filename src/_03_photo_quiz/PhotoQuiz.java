package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String URL = "https://images-na.ssl-images-amazon.com/images/I/81HIbfYm9CL.png";
		// 2. create a variable of type "Component" that will hold your image
		Component ice = createImage(URL);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(ice);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String pic = JOptionPane.showInputDialog("What is this picture of?");
		// 7. print "CORRECT" if the user gave the right answer
		if (pic.equalsIgnoreCase("Basketball")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(ice);
		// 10. find another image and create it (might take more than one line
		// of code)
String url = "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/SpongeBob_SquarePants_character.svg/1200px-SpongeBob_SquarePants_character.svg.png";
		// 11. add the second image to the quiz window
Component ICE = createImage(url);
quizWindow.add(ICE);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
String image = JOptionPane.showInputDialog("Who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (image.equalsIgnoreCase("Spongebob")) {
	JOptionPane.showMessageDialog(null, "Correct!");
} else {
	JOptionPane.showMessageDialog(null, "Incorrect!");
}
	quizWindow.remove(ICE);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
