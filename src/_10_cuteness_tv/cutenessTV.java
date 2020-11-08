package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
   
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
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");	
		}
		if (buttonPressed.equals(button2)) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		if (buttonPressed.equals(button3)) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		
	}
	
	/* void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
*/
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
	
	
	
	
	
	