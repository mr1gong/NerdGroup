package gameObjects;
import java.awt.Rectangle;

public interface GameObject {
	/**
	 * 
	 * @return Bounds of gameObject.
	 */
	public Rectangle getBounds();
	/**
	 * Sets the visibility of an object
	 * @param b - True for visible. False for invisible.
	 */
	public void setVisible(boolean b);
	/**
	 * 
	 * @return - Returns true if other objects can collide with this object.
	 */
	public boolean isCollidable();
	/**
	 * 
	 * @return - Position on the X axis.
	 */
	public int getX();
	/**
	 * 
	 * @param x - New X axis position.
	 */
	public void setX(int x);
	/**
	 * 
	 * @return - Position on the Y axis.
	 */
	public int getY();
	/**
	 * 
	 * @param y - New Y axis position.
	 */
	public void setY(int y);
	public int getWidth();
	public int getHeight();
	
	/**
	 * 
	 * @return - Returns true if the object is visible
	 */
	public boolean isVisible();
	/**
	 * 
	 * @param collidable - Sets collision.
	 */
	public void setCollidable(boolean collidable);
	


	
	

}
