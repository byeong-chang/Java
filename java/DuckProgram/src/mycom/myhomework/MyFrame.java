package mycom.myhomework;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	private Duck[] dk = new Duck[15];
	
	
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
				d.Display(g);
				d.Swim(g);
				//�ٿ� ĳ������ �Ͻ������� �����ϴ�.
				if(d instanceof MallardDuck) {
					MallardDuck md = (MallardDuck) d; // ���� �ٿ� ĳ���� ����ȯ
					md.quack(g);
					md.Fly(g);
				}
				else if(d instanceof RedDuck){
					RedDuck rd = (RedDuck) d;
					rd.quack(g);
					rd.Fly(g);
				}
				else if(d instanceof RubberDuck){
					RubberDuck rubd = (RubberDuck) d;
					rubd.bbick(g);
				}
				
			}
		}
	}
}
