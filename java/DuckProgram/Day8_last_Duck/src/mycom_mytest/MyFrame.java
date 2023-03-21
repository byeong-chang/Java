package mycom_mytest;


import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import Ducks.DecoyDuck;
import Ducks.Duck;
import Ducks.DuckManager;
import Ducks.MallardDuck;
import Ducks.RedDuck;
import Ducks.RubberDuck;
import Interfaces.Cryable;
import Interfaces.Flyable;

public class MyFrame extends Frame{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	private DuckManager dm = new DuckManager();
	
	
	public MyFrame() {
		super();
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		if(dm != null) {
			dm.displayAllDucks(g);
			dm.quackAllDucks(g);
			dm.flyAllDucks(g);
			dm.swimAllDucks(g);
		}
	}
}