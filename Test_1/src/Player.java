import java.awt.Rectangle;

import gameObjects.DynamicObject;
import gameObjects.GameObject;

public class Player implements DynamicObject, GameObject {
	
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int velX;
	private int velY;
	private boolean visible;
	private boolean collidable;

	

	

	public Player(int x, int y, int width, int height, int velX, int velY, boolean visible, boolean collidable) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velX = velX;
		this.velY = velY;
		this.visible = visible;
		this.collidable = collidable;
	}
	public Player(int x, int y, int width, int height,boolean visible, boolean collidable) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velX = 0;
		this.velY = 0;
		this.visible = visible;
		this.collidable = collidable;
	}

	
	@Override
	public void move() {
		x += velX;
		y += velY;

	}

	@Override
	public int getVelX() {
		// TODO Auto-generated method stub
		return velX;
	}

	@Override
	public void setVelX(int velX) {
		this.velX = velX;

	}

	@Override
	public int getVelY() {
		// TODO Auto-generated method stub
		return velY;
	}

	@Override
	public void setVelY(int velY) {
		this.velY = velY;

	}

	@Override
	public int nextX() {
		// TODO Auto-generated method stub
		return x+velX;
	}

	@Override
	public int nextY() {
		// TODO Auto-generated method stub
		return y+velY;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		 return new Rectangle(x, y, width, height);
	}

	@Override
	public void setVisible(boolean b) {
		this.visible = b;
		
	}

	@Override
	public boolean isCollidable() {
		// TODO Auto-generated method stub
		return collidable;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void setY(int y) {
		this.y = y;
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return visible;
	}

	@Override
	public void setCollidable(boolean collidable) {
		this.collidable = collidable;
		
	}

}
