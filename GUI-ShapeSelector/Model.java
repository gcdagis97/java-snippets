package shapeselector;

import java.awt.Color;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

// Sizes and colors of the icons

public class Model {
	
	// Color
	Color color;
	
	// Circle
	private int radius;
	
	// Rectangle
	private int height;
	private int width;
	
	// Triangle
	private int edgeLength;
	
	public Model(Color color, int radius, int height, int width, int edgelength) {
		this.color = color;
		this.radius = radius;
		this.height = height;
		this.width = width;
		this.edgeLength = edgelength;
	}
	
	// Color
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Circle Size
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	// Rectangle Size
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	// Triangle Size
	public int getEdgeLength() {
		return edgeLength;
	}
	
	public void setEdgeLength(int edgeLength) {
		this.edgeLength = edgeLength;
	}
}
