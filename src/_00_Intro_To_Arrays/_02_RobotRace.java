package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		Robot[] robos = new Robot[5];
		Random ran = new Random();
		boolean top = false;
		
		for (int i = 0; i < robos.length; i++) {
			robos[i] = new Robot();
			robos[i].moveTo(i*200 + 50, 545);
			robos[i].setSpeed(20);
		}
		
		while (top == false) {
			for (int i = 0; i < robos.length; i++) {
				int random = ran.nextInt(50);
				robos[i].move(random);
				if (robos[i].getY() < 10) {
					top = true;
					JOptionPane.showMessageDialog(null, "Congrats! Robot " + i+1 + " has won the race!");
				}
			}
		}
	}

        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
