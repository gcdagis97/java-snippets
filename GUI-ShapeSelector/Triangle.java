package shapeselector;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

import java.awt.*;
import javax.swing.*;

// Triangle class to draw a circle at a specific displacement and with specified edge lengths (maintain symmetry and consistent scaling)


@SuppressWarnings("serial")
public class Triangle extends JPanel {
	
	// Color variable to be changed
	Color color;

	// Create double EdgeLength (will be multiplied by decimal #s)
	// x1/y1 Corresponds to fixed point (stays constant)
	// double x1 = 0;
	// double y1 = 0;
	
	// EdgeLength Coressponds to top right point's x position and bottom left point's y position
	// Finding the default EdgeLengths:
	// triangle.EdgeLength = 1.5*(Integer.valueOf(SizeSlider.getValue()));
	// triangle.EdgeLength = 1.5*[initial slider value] = 1.5*20 = 30
	double edgeLength = 30;

	// Method draws and paints a triangle
	// Triangle is made up of 3 points, each with x and y coordinates
	// EdgeLength values are used for one points x corodinate and another's y coordinate for consistency when scaling
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		// Cast to int since graphics doesn't take doubles
		int xpoints[] = {0, (int) edgeLength, 0};
	    int ypoints[] = {0, 0, (int) edgeLength};
	    int npoints = 3;
	    g.setColor(color);
	    g.fillPolygon(xpoints, ypoints, npoints);
	}
}