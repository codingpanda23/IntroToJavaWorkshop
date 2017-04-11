package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot ada = new Robot("mini");
	ada.setSpeed(22);
	ada.move(100);
	ada.penDown();
	ada.setPenColor(Color.YELLOW);
	ada.move(15);
	ada.penDown();
	ada.turn(90);
	ada.move(20);
	
}
}
