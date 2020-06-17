package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {	
	int house = 0;
		Random num = new Random ();
	house = num.nextInt(500);	
	Robot ice = new Robot("mini");
	Robot.setWindowSize(500, 500);
	ice.penDown();
	ice.setPenWidth(5);
	ice.setSpeed(10);
	ice.setX(10);
	ice.setY(490);
	for (int i = 1; i < 11; i++) {
		robotHouse(ice, house);
		ice.turn(-90);
		if (i<=9) {
			ice.setPenColor(Color.green);
			ice.move(20);
			house = num.nextInt(500);
		}
		ice.penUp();
		ice.turn(-90);
		ice.setPenColor(Color.black);
		ice.move(6);
		ice.penDown();	
	}
	}
	
	void robotHouse(Robot ice, int height) {
	ice.move(height-6);
	ice.turn(90);
	ice.move(20);
	ice.turn(90);
	ice.move(height);

	}
	void robotHouse(Robot ice, String height) {
	if (height.equals("small")) {
		robotHouse(ice, 60);
	}
	if (height.equals("medium")) {
		robotHouse(ice, 120);
	}
	if (height.equals("large")) {
		robotHouse(ice, 250);
	}
	}

	}

