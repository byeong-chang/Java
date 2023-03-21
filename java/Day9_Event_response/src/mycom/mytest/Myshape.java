package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Myshape {

	protected int x;
	protected int y;
	public static final int SHAPE_SIZE = 50;
	
	public Myshape() {
		Random rnd = new Random();
		this.x = rnd.nextInt(800);
		this.y = rnd.nextInt(600);
	}
	public Myshape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void display(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
	}
	
}
