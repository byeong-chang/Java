package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck{

	@Override
	public void Swim(Graphics g) {
		g.drawString("¼ö¿µ",this.x-INDET_CHECK, this.y);	
	}

	public void bbick(Graphics g) {
		g.drawString("»à»à",this.x+TEXT_SPACE-INDET_CHECK, this.y);	
	}

	@Override
	public void Display(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);	
	}
}
