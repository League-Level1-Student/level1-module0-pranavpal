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
		// “Copy Image Address”)
		String image = new String("https://vignette.wikia.nocookie.net/all-characters/images/e/e3/Mario_SM64.png/revision/latest?cb=20190306133737");

		// 2. create a variable of type "Component" that will hold your image
			Component x;
			

		// 3. use the "createImage()" method below to initialize your Component
			x = createImage(image);
			
		// 4. add the image to the quiz window
			quizWindow.add(x);

		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			String input = JOptionPane.showInputDialog("Which video game character is shown in this image?");
		// 7. print "CORRECT" if the user gave the right answer
			if (input.equals("Mario")) {
				System.out.println("CORRECT");
			} else {
				System.out.println("INCORRECT");
			}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
			quizWindow.remove(x);

		// 10. find another image and create it (might take more than one line
		// of code)
			String image2 = new String("https://mlpnk72yciwc.i.optimole.com/cqhiHLc.WqA8~2eefa/w:auto/h:auto/q:75/https://bleedingcool.com/wp-content/uploads/2020/07/Luigi-Super-Mario-64-Render.jpg");
			Component y;
			y = createImage(image2);

		// 11. add the second image to the quiz window
			quizWindow.add(y);

		// 12. pack the quiz window
			quizWindow.pack();

		// 13. ask another question
			String input2 = JOptionPane.showInputDialog("Which video game character is shown in this image?");
			
		// 14+ check answer, say if correct or incorrect, etc.
			if (input2.equals("Luigi")) {
				System.out.println("CORRECT");
			} else {
				System.out.println("INCORRECT");
			}
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
