import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Graphics3 extends JPanel {
	final int NUM_POINTS = 1000;
	Dot[] dots = new Dot[NUM_POINTS];
	int numClicks = 0;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setContentPane(new Graphics3());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	Graphics3() {
		setPreferredSize(new Dimension(600, 600));
		
		MouseMotionListener mickeyMotion = new MouseMotionListener() {
			public void mouseDragged(MouseEvent arg0) {
				// Do nothing
			}

			public void mouseMoved(MouseEvent event) {
				Dot dot = new Dot(); // Creates a new Dot object in memory
				dot.x = event.getX(); // Set the x coordinate of the new object
				dot.y = event.getY(); // Set the y coordinate
				dots[numClicks] = dot; // Store the new Dot object into the dots array
				numClicks += 1;
				if (numClicks == NUM_POINTS) numClicks = 0;

			}
		};
		addMouseMotionListener(mickeyMotion);		
		
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				for (int i = 0; i != NUM_POINTS; i += 1) {
					if (dots[i] != null) {
						dots[i].y += 1;
					}
				}
				repaint();
			}
		};
		Timer timer = new Timer(20, timerListener);
		timer.restart();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.WHITE);
		
		for (int i = 0; i < NUM_POINTS; i += 1) {
			if (dots[i] != null) {
				g.fillRect(dots[i].x,  dots[i].y, 10, 10);
			}
		}
	}
}