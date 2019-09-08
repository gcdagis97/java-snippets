package shapeselector;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

import java.awt.*;
import javax.swing.*;


// Rectangle class to draw a circle at a specific displacement and with a specified width & height


@SuppressWarnings("serial")
public class Rectangle extends JPanel {
	
	// Color variable to be changed
	Color color;
	
	// Create double width and double height (will be multiplied by decimal #s)
	// Finding the default width and height:
	// rectangle.width = 1.5*(Integer.valueOf(SizeSlider.getValue()));
	// rectangle.width = 1.5*[initial slider value] = 1.5*20 = 30
	double width = 30;
	
	// Maintain aspect ratio 3:1
	// Therefore height = width/3 = 30/3 = 10
	double height = 10;
	
	// Method draws and paints a rectangle
	// Rectangle requires 4 values: a,b,c,d
	// // a for x displacement (from left), b for y displacement (from top), c for width, and d for height
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(color);
		
		// Cast to int since graphics doesn't take doubles
		g.fillRect(0, 0, (int) width, (int) height);
	}
}