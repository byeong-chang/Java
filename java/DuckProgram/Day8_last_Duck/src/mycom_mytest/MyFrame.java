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
		//�����ϰ� Ÿ���� �����ǵ��� ~
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
				//�ٿ� ĳ������ �Ͻ������� �����ϴ�.
				if(d instanceof Flyable) {
					Flyable fd = (Flyable) d; // ���� �ٿ� ĳ���� ����ȯ
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