import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics1 extends JPanel {

	int x = 0;
	int y = 0;
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
				 x = event.getX();
				 y = event.getY();
				repaint();
			}
		};
		addMouseListener(mickey);

	}


	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 600,600);
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);
	}
}



