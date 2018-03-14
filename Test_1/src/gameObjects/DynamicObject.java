package gameObjects;
/**
 * 
 * @author Marek Makovec
 * @version 1.0
 */
public interface DynamicObject{
	
	
	/**
	 * Sets X and Y of the object.
	 */
	public void move();


	/**
	 * Returns velocity in X axis.
	 * @return Velocity.
	 */
	public int getVelX();
	/**
	 * Setting the velocity in X axis.
	 * @param velX - Velocity
	 */
	public void setVelX(int velX);
	/**
	 * Returns velocity in Y axis.
	 * @return Velocity.
	 */
	public int getVelY();

	/**
	 * Setting the velocity in Y axis.
	 * @param velY - Velocity
	 */
	public void setVelY(int velY);
	/**
	 * 
	 * @return Value of the next expected coordinate X.
	 */
	public int nextX();
	/**
	 * 
	 * @return Value of the next expected coordinate Y.
	 */
	public int nextY(); 
	
}
