package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}
	@Override
	public void Display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}
	
	public void quack(Graphics g) {
		g.drawString("²è²è", this.x+TEXT_SPACE-INDET_CHECK, this.y);
	}
	public void Fly(Graphics g) {
		g.drawString("³¯´Ù", this.x-INDET_CHECK, this.y+TEXT_SPACE);
		
	}
	@Override
	public void Swim(Graphics g) {
		g.drawString("¼ö¿µ", this.x-INDET_CHECK, this.y);
		
	}
}