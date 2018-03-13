package gameObjects;

public class DynamicObject extends StaticObject implements GameObject {
	
	private int velX;
	private int velY;

	public DynamicObject(int x, int y, int width, int height, boolean visible, boolean collidable) {
		super(x, y, width, height, visible, collidable);
		velX = 0;
		velY = 0;
		
	}
	
	public void move() {
		super.x += velX;
		super.y += velY;
	}
	/*
	public void move(int x, int y, int time) {
		velX = (super.x - x)/time;
		velX = (super.x - x)/time;
	}*/

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}
	public int nextX() {
		return x+velX;
	}
	public int nextY() {
		return y+velY;
	}
	
}
