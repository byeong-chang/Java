package Ducks;



import java.awt.Color;
import java.awt.Graphics;

import mycom_mytest.Interfaces.Cryable;

public class RubberDuck extends Duck implements Cryable{


	@Override
	public void display(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);	
	}

	@Override
	public void cry(Graphics g) {
		g.drawString("»à»à",this.x+TEXT_SPACE-INDET_CHECK, this.y);	
		
	}
}