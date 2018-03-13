import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import gameObjects.DynamicObject;
import gameObjects.StaticObject;

@SuppressWarnings("serial")
public class Test extends JPanel implements ActionListener, KeyListener{
	private static JFrame frame;
	Timer tm = new Timer(5, this);
	int x = 0, velX = 0;
	StaticObject s1 = new StaticObject(60, 10, 20, 20, true, true);
	DynamicObject d1 = new DynamicObject(0, 10, 20, 20, true, true);
	
	public Test(){
		tm.start();
		
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
	}
	public void paintComponent(Graphics g) {
		
		
		
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawRect(x, 10, 20, 20);
		g.fillRect(s1.getX(), s1.getY(), s1.getWidth(), s1.getHeight());
		g.fillRect(d1.getX(), d1.getY(), d1.getWidth(), d1.getHeight());
		
		
	}
    public void actionPerformed(ActionEvent e){

		d1.move();
		repaint();
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		frame = new JFrame();
		frame.setTitle("Test");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(t);
		frame.setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_LEFT){}
		if(c == KeyEvent.VK_RIGHT){}
		if(c == KeyEvent.VK_UP){}
		if(c == KeyEvent.VK_DOWN){}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_LEFT){}
		if(c == KeyEvent.VK_RIGHT){}
		if(c == KeyEvent.VK_UP){}
		if(c == KeyEvent.VK_DOWN){}
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
