package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import com.sun.xml.internal.bind.v2.model.core.Adapter;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot ada = new Robot("mini");

	void go() {
		// 4. Make the robot move as fast as possible
ada.setSpeed(1000);
		// 5. Set the pen width to 5
ada.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	ada.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
ada.turn(90);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		ada.penDown();
		ada.move(100);
		ada.turn(90);
		ada.move(100);
		ada.turn(90);
		ada.move(100);
		ada.turn(90);
		ada.move(100);
		ada.turn(90);
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
