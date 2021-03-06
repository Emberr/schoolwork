import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Graphics1 extends JPanel {
	Image background;
	final int NUM_POINTS = 1000;
	int[] xs = new int[NUM_POINTS];
	int[] ys = new int[NUM_POINTS];
	int numClicks = 0;
	int counter = 0;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setContentPane(new Graphics1());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	Graphics1() {
		setPreferredSize(new Dimension(600, 600));
		
		MouseMotionListener mickeyMotion = new MouseMotionListener() {
			public void mouseDragged(MouseEvent arg0) {
				// Do nothing
			}

			public void mouseMoved(MouseEvent event) {
				xs[numClicks] = event.getX();
				ys[numClicks] = event.getY();
				numClicks += 1;
				if (numClicks == NUM_POINTS) numClicks = 0;

			}
		};
		addMouseMotionListener(mickeyMotion);		
		
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				for (int i = 0; i != NUM_POINTS; i += 1) {
					ys[i] += 1;
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
			g.fillRect(xs[i],  (int)ys[i], 10, 10);
		}
	}
}
