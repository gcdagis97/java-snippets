package shapeselector;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

import java.awt.Color;

// Iterations between View.java and Model.java
// Action events are handled here
// Logic to change shape colors / sizes are handled here

@SuppressWarnings("serial")
public class Controller extends View {
	
	// Cirle button press event
	// Remove any other shapes
	// Add circle shape in a specificly bounded area
	static void CirButtonPressed(java.awt.event.ActionEvent event) {
		Controller.DisplayCircle();
		mainPanel.updateUI();
	}
	
	// Rectangle button press event
	// Remove any other shapes
	// Add rectangle shape in a specificly bounded area
	static void RecButtonPressed(java.awt.event.ActionEvent event) {
		Controller.DisplayRectangle();
		mainPanel.updateUI();
	}
	
	// Triangle button press event
	// Remove any other shapes
	// Add triangle shape in a specificly bounded area
	static void TriButtonPressed(java.awt.event.ActionEvent event) {
		Controller.DisplayTriangle();
		mainPanel.updateUI();
	}
	
	// Blue button press event
	// Change the color of each shape to blue (maintain color when switching shapes)
	static void BluButtonPressed(java.awt.event.ActionEvent event) {
		Controller.ChangeToBlue();
		mainPanel.updateUI();
	}
	
	// Red button press event
	// Change the color of each shape to red(maintain color when switching shapes)
	static void RedButtonPressed(java.awt.event.ActionEvent event) {
		Controller.ChangeToRed();
		mainPanel.updateUI();
	}
	
	// Yellow button press event
	// Change the color of each shape to yellow (maintain color when switching shapes)
	static void YelButtonPressed(java.awt.event.ActionEvent event) {
		Controller.ChangeToYellow();
		mainPanel.updateUI();
	}

	// SizeSlider slide event
	// Call the ChangeSize() method to scale properly
    static void SizeSliderChanged(javax.swing.event.ChangeEvent event) {
        Controller.ChangeSize();
        mainPanel.updateUI();
    }
	
	//  Change all shapes to blue
	public static void ChangeToBlue() {
		circle.color = Color.BLUE;
		rectangle.color = Color.BLUE;
		triangle.color = Color.BLUE;
	}

	// Change all shapes to red
	public static void ChangeToRed() {
		circle.color = Color.RED;
		rectangle.color = Color.RED;
		triangle.color = Color.RED;
	}

	// Change all shapes to yellow
	public static void ChangeToYellow() {
		circle.color = Color.YELLOW;
		rectangle.color = Color.YELLOW;
		triangle.color = Color.YELLOW;
	}

	// Method to display a circle after removing the other shapes
	public static void DisplayCircle() {
		mainPanel.remove(rectangle);
		mainPanel.remove(triangle);
		mainPanel.add(circle);
		circle.setBounds(300,250,250,250);
	}

	// Method to display a rectangle after removing the other shapes
	public static void DisplayRectangle() {
		mainPanel.remove(circle);
		mainPanel.remove(triangle);
		mainPanel.add(rectangle);
		rectangle.setBounds(300, 250, 250, 250);
	}

	// Method to display a triangle after removing the other shapes
	public static void DisplayTriangle() {
		mainPanel.remove(circle);
		mainPanel.remove(rectangle);
		mainPanel.add(triangle);
		triangle.setBounds(300, 250, 250, 250);
	}

    // Change the size of each shape accordingly (maintain size when switching shapes)
    // Constant value of 1.5 is a good multiplier and provides for consistent scaling from slider's min to slider's max value
    static void ChangeSize() {
    	// Change size of circles radius
    	circle.radius = 1.5*(Integer.valueOf(SizeSlider.getValue()));
    	
    	// Change size of rectangle's width and height
    	// Maintain a 1:3 ratio between sides
    	rectangle.width = 1.5*(Integer.valueOf(SizeSlider.getValue()));
    	rectangle.height = rectangle.width/3;
    	
    	// Change size of triangle's edges
    	triangle.edgeLength = 1.5*(Integer.valueOf(SizeSlider.getValue()));
    }
}
