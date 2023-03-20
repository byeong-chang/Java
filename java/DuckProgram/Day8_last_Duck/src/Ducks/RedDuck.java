package Ducks;

import java.awt.Color;
import java.awt.Graphics;

import mycom_mytest.Interfaces.Cryable;
import mycom_mytest.Interfaces.Flyable;
public class RedDuck extends Duck implements Cryable , Flyable{


	
	public RedDuck() {
		super();
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}
	
	@Override
	public void fly(Graphics g) {
		g.drawString("³¯´Ù", this.x-INDET_CHECK, this.y+TEXT_SPACE);
		
	}
	@Override
	public void cry(Graphics g) {
		g.drawString("²è²è", this.x+TEXT_SPACE-INDET_CHECK, this.y);
		
	}
}