package Ducks;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck{

	@Override
	public void display(Graphics g) {

		g.setColor(Color.yellow);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}
}