package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck{


	@Override
	public void Display(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}

	@Override
	public void Swim(Graphics g) {
		g.drawString("¼ö¿µ",this.x-INDET_CHECK, this.y);	
	}
}
