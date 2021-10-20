import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics1 extends JPanel {

	int[] xs = new int [100];
	int[] ys = new int [100];
	
	int numEntries = 0;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setContentPane(new Graphics1());
		frame.pack();
		frame.setVisible(true);
	}
	Graphics1() {
		setPreferredSize(new Dimension(600,600));
		MouseListener mickey = new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				 xs[numEntries] = event.getX();
				 
				 ys[numEntries] = event.getY();
				 numEntries = numEntries += 1;
				
			}
		};
		addMouseListener(mickey);

	}
		

		
		
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 600,600);
		g.setColor(Color.red);
		for (int i =0; i < numEntries; i += 1) {
			g.fillRect(xs[i], ys[i], 5, 5);
		}
		repaint();
	}
}



