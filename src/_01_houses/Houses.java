package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		rob.setX(0);
		rob.setSpeed(50);
		rob.penDown();
		
		
		drawHouse("small", "green");
		drawHouse("medium", "red");
		drawHouse("large", "pink");
		drawHouse("small", "cyan");
		drawHouse("medium", "blue");
		drawHouse("large", "purple");
		drawHouse("small", "yellow");
		drawHouse("medium", "orange");
		drawHouse("large", "white");
		drawHouse("small", "black");
		//}
	}
	
	public void drawHouse(String height, String color) {
		int x=0;
		if(height.equals("small")) {
			x=60;
		}
		if(height.equals("medium")) {
			x=120;
		}
		if(height.equals("large")) {
			x=250;
		}
		
		if(color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if(color.equals("yellow")) {
			rob.setPenColor(Color.yellow);
		}
		if(color.equals("orange")) {
			rob.setPenColor(Color.orange);
		}
		if(color.equals("purple")) {
			rob.setPenColor(Color.magenta);
		}
		if(color.equals("white")) {
			rob.setPenColor(Color.white);
		}
		if(color.equals("black")) {
			rob.setPenColor(Color.black);
		}
		if(color.equals("cyan")) {
			rob.setPenColor(Color.cyan);
		}
		if(color.equals("pink")) {
			rob.setPenColor(Color.pink);
		}
		if(color.equals("green")) {
			rob.setPenColor(Color.green);
		}
	

	
		if (height.equals("large")) {
			rob.move(x);
			rob.turn(45);
			rob.move(x/5);
			rob.turn(90);
			rob.move(x/5);
			rob.turn(45);
			rob.move(x);
			rob.turn(-90);
			rob.move(x/10);
			rob.turn(-90);
		} else {
			rob.move(x);
			rob.turn(90);
			rob.move(x/5);
			rob.turn(90);
			rob.move(x);
			rob.turn(-90);
			rob.move(x/10);
			rob.turn(-90);
		}
		
	}
	}
	/*public void drawPointyRoof(String height, String color) {
		int x=0;
		if(height.equals("small")) {
			x=60;
		}
		if(height.equals("medium")) {
			x=120;
		}
		if(height.equals("large")) {
			x=250;
		}
		if(color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if(color.equals("yellow")) {
			rob.setPenColor(Color.yellow);
		}
		if(color.equals("orange")) {
			rob.setPenColor(Color.orange);
		}
		if(color.equals("purple")) {
			rob.setPenColor(Color.magenta);
		}
		if(color.equals("white")) {
			rob.setPenColor(Color.white);
		}
		if(color.equals("black")) {
			rob.setPenColor(Color.black);
		}
		if(color.equals("cyan")) {
			rob.setPenColor(Color.cyan);
		}
		if(color.equals("pink")) {
			rob.setPenColor(Color.pink);
		}
		if(color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		rob.move(x);
		rob.turn(45);
		rob.move(x/5);
		rob.turn(90);
		rob.move(x/5);
		rob.turn(45);
		rob.move(x);
		rob.turn(-90);
		rob.move(x/10);
		rob.turn(-90);
	}
} */
