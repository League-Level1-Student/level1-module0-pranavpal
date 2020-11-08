package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
   
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void showButton() {
        System.out.println("Button clicked");
   
    
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		frame.add(panel);
		
		button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    
	    panel.add(button1);  
	    panel.add(button2);
	    panel.add(button3);
	   
	    frame.pack();
	    
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed.equals(button1)) {
			playSound("Sawing Wood by Daniel Simon is playing");	
		}
		if (buttonPressed.equals(button2)) {
			playSound("Labrador barking sound is playing");	
		}
		if (buttonPressed.equals(button3)) {
			playSound("Van sliding door is playing");	
		}
		
	}
	 private void playSound(String fileName) {
	     //AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     //sound.play();
		 System.out.print(fileName);
		 
	}

	
}
	
	
	
	
	
	