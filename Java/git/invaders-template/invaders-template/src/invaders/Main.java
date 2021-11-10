package invaders;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import invaders.graphics.ImageLoader;
import invaders.sounds.SoundLoader;
import projectiles.Bullet;

public class Main extends JPanel {
	
	final int NUM_POINTS = 1000;
	int playerX;
	int playerY;
	int numClicks = 0;
	int counter = 0;
	 
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setContentPane(new Main());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	Image playerImage = ImageLoader.load("invaders.png", 0 , 0, 100, 100);
	Bullet[] bullets = new Bullet[100];
	int numBullets = 0;
	
	Main() {
		setPreferredSize(new Dimension(600, 900));
		
		MouseListener clickListener = new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				Bullet bullet = new Bullet();
				bullet.x = event.getX();
				bullet.y = event.getY();
				bullet.speed = 10;
				bullets[numBullets] = bullet;
				numBullets += 1;
				if(numBullets == 100) {
					numBullets = 0;
				}
				
			}
		};
		addMouseListener(clickListener);
		
		MouseMotionListener motionListener = new MouseMotionListener() {
			public void mouseDragged(MouseEvent arg0) {
			}

			public void mouseMoved(MouseEvent event) {
				playerX = event.getX();
				playerY = event.getY();
				numClicks += 1;
				
			}
		};
		addMouseMotionListener(motionListener);		
		
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				repaint();
			}
		};
		
		Timer timer = new Timer(20, actionListener);
		timer.start();
		
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 900);
		g.drawImage(playerImage,playerX-50,playerY-50,null);
		g.setColor(Color.red);
		for(int i=0; i<numBullets; i++) {
			Bullet bullet = bullets[i];
			g.fillRect(bullet.x-2, bullet.y-50,2,5);
			bullet.y -= bullet.speed;
		}
	}
}
