package shapeselector;

/*
 * @author George Dagis
 * @version 1.0
 * @since 4-28-19
*/

import javax.swing.*;

// View class which displays GUI and communicates with the controller

@SuppressWarnings("serial")
public class View extends javax.swing.JFrame {
	
	public View() {
		initialize();
	}
	
	// Create frame and panel for components
	JFrame mainFrame = new JFrame();
	static JPanel mainPanel = new JPanel();
	
	// Create interactive components (buttons and vertical slider)
	JButton CirButton = new JButton("Circle");
	JButton RecButton = new JButton("Rectangle");
	JButton TriButton = new JButton("Triangle");
	JButton BluButton = new JButton("Blue");
	JButton RedButton = new JButton("Red");
	JButton YelButton = new JButton("Yellow");
	static JSlider SizeSlider = new JSlider(JSlider.VERTICAL, 20, 150, 20);
	
	// Create shapes
	static Circle circle = new Circle();
	static Rectangle rectangle = new Rectangle();
	static Triangle triangle = new Triangle();
	
	private void initialize() {
		
		// Buttons
		// Set the text
		CirButton.setText("Circle");
		RecButton.setText("Rectangle");
		TriButton.setText("Triangle");
		BluButton.setText("Blue");
		RedButton.setText("Red");
		YelButton.setText("Yellow");
		
		// Wait to perform an action when the Cir button is pressed
		CirButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform CirButtonPressed
				Controller.CirButtonPressed(event);
			}
		});
		
		// Wait to perform an action when the Rec button is pressed
		RecButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform RecButtonPressed
				Controller.RecButtonPressed(event);
			}
		});

		// Wait to perform an action when the Tri button is pressed
		TriButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform TriButtonPressed
				Controller.TriButtonPressed(event);
			}
		});
		
		// Wait to perform an action when the Blu button is pressed
		BluButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform BluButtonPressed
				Controller.BluButtonPressed(event);
			}
		});
		
		// Wait to perform an action when the Red button is pressed
		RedButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform RedButtonPressed
				Controller.RedButtonPressed(event);
			}
		});
		
		// Wait to perform an action when the Yel button is pressed
		YelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				// Perform YelButtonPressed
				Controller.YelButtonPressed(event);
			}
		});
		
		// Slider
		// Wait to perform an action when slider is moved
		SizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent event) {
				// Perform SizeSliderChanged
				Controller.SizeSliderChanged(event);
			}
		});
		
		mainPanel.setLayout(null);
		
		// Specify each button's position and dimensions
		// x, y, width, height
		RecButton.setBounds(178, 10, 176, 40);
		TriButton.setBounds(363, 10, 153, 40);
		CirButton.setBounds(525, 10, 120, 40);
		RedButton.setBounds(215, 700, 105, 40);
		BluButton.setBounds(326, 700, 115, 40);
		YelButton.setBounds(450, 700, 150, 40);
		
		// Specify the slider's properties (ticks, position, dimensions)
        SizeSlider.setMinorTickSpacing(5);
        SizeSlider.setMajorTickSpacing(10);
        SizeSlider.setPaintTicks(true);
        SizeSlider.setPaintLabels(true);
        SizeSlider.setBounds(1, 70, 100, 600);

        // Add the components to the main panel
		mainPanel.add(CirButton);
		mainPanel.add(RecButton);
		mainPanel.add(TriButton);
		mainPanel.add(BluButton);
		mainPanel.add(RedButton);
		mainPanel.add(YelButton);
		mainPanel.add(SizeSlider);
		
		// Add the mainPanel onto the mainFrame
		// Set the size of the frame
		mainFrame.add(mainPanel);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setSize(825, 810);
		mainFrame.setVisible(true);
	}
}
