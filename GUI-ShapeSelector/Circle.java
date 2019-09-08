package shapeselector;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

import java.awt.*;
import javax.swing.*;

// Circle class to draw a circle at a specific displacement and with a certain sized radius (width / height)

@SuppressWarnings("serial")
public class Circle extends JPanel {
	
	// Color variable to be changed
	Color color;
	
	// Create double radius (will be multiplied by decimal #s)
	// Finding the default radius:
	// circle.radius = 1.5*(Integer.valueOf(SizeSlider.getValue()));
	// circle.radius = 1.5*[initial slider value] = 1.5*20 = 30
	double radius = 30;
	
	// Method draws and paints a circle
	// Circle requires 4 values: a,b,c,d
	// a for x displacement (from left), b for y displacement (from top), c for width (radius), and d for height (radius)
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		// Cast to int since graphics doesn't take doubles
	    g.setColor(color);
	    g.fillOval(0, 0, (int) radius, (int) radius);
	}
}
