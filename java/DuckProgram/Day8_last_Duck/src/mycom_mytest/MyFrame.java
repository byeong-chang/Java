package mycom_mytest;


import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom_mytest.Interfaces.Cryable;
import mycom_mytest.Interfaces.Flyable;

public class MyFrame extends Frame{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	private Duck[] dk = new Duck[20];
	
	
	public MyFrame() {
		super();
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		makeDucks();
		
	}
	private void makeDucks() {
		//랜덤하게 타입이 결정되도록 ~
		int type = 0;
		Random rnd = new Random();
		for(int iter = 0; iter < dk.length ; iter++) {
			type = rnd.nextInt(4);
			switch(type) {
			case 1:
				dk[iter] = new RedDuck();
				break;
			case 2:
				dk[iter] = new MallardDuck();
				break;
			case 3:
				dk[iter] = new RubberDuck();
				break;
			case 0:
				dk[iter] = new DecoyDuck();
				break;
			default:
				dk[iter] = new MallardDuck();
			}
		}
	}

	@Override
	public void paint(Graphics g) {

		for(Duck d : dk) {
			if(d != null) {
				d.display(g);
				d.swim(g);
				//다운 캐스팅이 일시적으로 가능하다.
				if(d instanceof Flyable) {
					Flyable fd = (Flyable) d; // 강제 다운 캐스팅 형변환
					fd.fly(g);
				}
				if(d instanceof Cryable){
					Cryable cd = (Cryable) d;
					cd.cry(g);
				
				}
				
			}
		}
	}
}