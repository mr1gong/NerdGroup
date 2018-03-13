package gameObjects;
import java.awt.Rectangle;

public interface GameObject {
	
	public int getCollisionDamage();
	public Rectangle getBounds();
	public void setVisible(boolean b);
	public boolean isCollidable();
	
	public int getX();
	public void setX(int x);
	public int getY();
	public void setY(int x);
	public int getWidth();
	public int getHeight();
	public boolean isVisible();
	public void setCollidable(boolean collidable);
	


	
	

}
