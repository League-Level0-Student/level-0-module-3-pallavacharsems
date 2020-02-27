//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot ice = new Robot("mini");
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 2; i++) {
			String p = JOptionPane.showInputDialog("Which color would you like me to draw");
		// 5. Use an if/else statement to set the pen color that the user requested
		
			
		
			if (p.equals("red"))
				ice.setPenColor(Color.red);
			else if (p.equals("blue"))
				ice.setPenColor(Color.blue);
			else if (p.equals("yellow"))
				ice.setPenColor(Color.yellow);
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				ice.setRandomPenColor();
			}
		
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

		// 4. Set the pen width to 10
		ice.setPenWidth(10);

		// 2. Make the robot draw a shape (this will take more than one line of code)

		ice.setSpeed(10);
		ice.penDown();
		ice.move(100);
		for (int j = 0; j < 4; j++) {
			ice.move(50);
			ice.turn(90);
		}
		ice.moveTo(540, 300);
		ice.setAngle(20);
//		p = JOptionPane.showInputDialog("Which color would you like me to draw!");
		ice.move(150);
		ice.setAngle(-200);
		ice.move(150);
		ice.setAngle(90);
		ice.moveTo(570, 220);
		ice.move(50);
		}
	
	
	
	
	}
	
}
