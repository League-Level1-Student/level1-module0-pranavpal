package _07_fortune_cookie;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
   }
    {
		// 1. Declare and initialize an object of the JFrame class
		JFrame frame = new JFrame();

		// 2. Set your JFrame object to be visible
		frame.setVisible(true);

		// 3. Open MyFirstSwingGUIRunner and run your program. Do you see your window? It's probably very
		// small.

		// 4. Use your JFrame to call setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 5. Declare and initialize an object of the JPanel class
		JPanel panel = new JPanel();

		// 6. Declare and initialize an object of the JLabel class
		JLabel label = new JLabel();
		
	    JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    
	    button.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		//JOptionPane.showMessageDialog(f, "Woohoo");
		
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(f, "Pick another fortune cookie");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(f, "You will win the lottery");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(f, "You learn from your mistakes... you will learn a lot today");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(f, "You will marry your lover");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(f, "It's better to be alone sometimes");
		}
	}
} 








