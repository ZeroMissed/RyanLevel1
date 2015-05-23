import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;


public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	
		/* 1. Get the panel to show */
		panel.showPanel();
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		
		/* 3. Instantiate a Turtle and add it to the panel */
		for (int i = 0; i < 500; i+=10) {
		Turtle turtle = new Turtle();
		panel.addTurtle(turtle);
		int b = new Random().nextInt(panel.getWidth()/2);
		int r = new Random().nextInt(panel.getHeight());
		turtle.setX(b + panel.getWidth()/2);
		turtle.setY(r);
		}
		
	}
}