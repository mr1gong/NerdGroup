package gameObjects;
import java.awt.Image;
import java.awt.Rectangle;

public class StaticObject implements GameObject{
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int collisionDamage;
	protected Image img;
	protected boolean visible;
	protected boolean collidable;
	
	
	public StaticObject(int x, int y, int width, int height, boolean visible, boolean collidable){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.visible = visible;
		this.collidable = collidable;
		this.collisionDamage = 0;
	}
	public StaticObject(int x, int y, int width, int height, int collisionDamage, boolean visible, boolean collidable){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.visible = visible;
		this.collidable = collidable;
		this.collisionDamage = collisionDamage;
	}
	
	
	
	
	public Rectangle getBounds() {
		Rectangle r = new Rectangle();
	    return new Rectangle(x, y, width, height);
	}




	@Override
	public int getCollisionDamage() {
		return collisionDamage;
		
	}

	@Override
	public void setVisible(boolean b) {
	
		visible = b;
	}
	



	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setCollidable(boolean collidable) {
		this.collidable = collidable;
	}
	@Override
	public boolean isCollidable() {
		
		return collidable;
	}
	
	
	
	
}
