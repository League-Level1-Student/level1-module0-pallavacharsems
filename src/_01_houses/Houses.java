package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run()  {	
		Robot.setWindowColor(Color.BLACK);
		int house = 0;
		int color = 0;
		int acolor = 0;
		int bcolor = 0;
		Random num = new Random ();
	house = num.nextInt(3);	
	 color = num.nextInt(250);
	 acolor = num.nextInt(250);
	 bcolor = num.nextInt(250);
	 
	Robot ice = new Robot("mini");
	Robot.setWindowSize(500, 500);
	ice.penDown();
	ice.setPenWidth(5);
	ice.setSpeed(10);
	ice.setX(10);
	ice.setY(490);
	for (int i = 1; i < 11; i++) {
		
		if (house == 0) {
			robotHouse(ice, "small", new Color(color, acolor, bcolor));
		}
		if (house == 1) {
			robotHouse(ice, "medium", new Color(color, acolor, bcolor));
		}
		if (house == 2) {
			robotHouse(ice, "large", new Color(color, acolor, bcolor));
		}
		if (i<=9) {
			ice.setPenColor(Color.green);
			ice.turn(-90);
			ice.move(20);
			house = num.nextInt(3);
			
		}
		ice.penUp();
		ice.turn(-90);
		ice.setPenColor(Color.black);
		ice.move(6);
		ice.penDown();	
	}
	}
	
	void drawFlatHouse(Robot ice, int height, Color c) {
		ice.setPenColor(c);
		ice.move(height-6);
		ice.turn(90);
		ice.move(20);
		ice.turn(90);
		ice.move(height);
	}
	void drawPeakedHouse(Robot ice, int height, Color c) {
		ice.setPenColor(c);
		ice.move(height-6);
		ice.turn(45);
		ice.move(20);
		ice.turn(90);
		ice.move(20);
		ice.turn(45);
		ice.move(height);
	}
	
	void robotHouse(Robot ice, int height, Color c) {
	ice.setPenColor(c);
	ice.move(height-6);
	ice.turn(90);
	ice.move(20);
	ice.turn(90);
	ice.move(height);
	

	}
	void robotHouse(Robot ice, String height, Color c ) {
	if (height.equals("small")) {
		drawPeakedHouse(ice, 60, c);
	}
	if (height.equals("medium")) {
	drawPeakedHouse(ice, 120, c);
	}
	if (height.equals("large")) {
	drawFlatHouse(ice, 250, c);
	}
	}

	}

