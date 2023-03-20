package mycom.myhomework;

import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	protected static int DUCK_SIZE = 50;
	protected static int TEXT_SPACE = 50;
	protected static int INDET_CHECK = 10;
	
	public Duck() {
		Random rnd = new Random();
		this.x = rnd.nextInt(DUCK_SIZE,MyFrame.WIDTH - DUCK_SIZE);
		this.y = rnd.nextInt(DUCK_SIZE,MyFrame.HEIGHT-DUCK_SIZE);
	}
	public abstract void Swim(Graphics g);
	public abstract void Display(Graphics g);
}
