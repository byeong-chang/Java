package Ducks;

import java.awt.Graphics;
import java.util.Random;

import Interfaces.Cryable;
import Interfaces.Flyable;

public class DuckManager {

	private Duck[] dk = new Duck[20];
	
	public DuckManager(){
		makeDucks();
	}
	
	private void makeDucks() {
		//�����ϰ� Ÿ���� �����ǵ��� ~
		int type = 0;
		Random rnd = new Random();
		for(int iter = 0; iter < dk.length ; iter++) {
			type = rnd.nextInt(4); // 0,1,2,3
			switch(type) {
			case 0:
				dk[iter] = new RedDuck();
				break;
			case 1:
				dk[iter] = new MallardDuck();
				break;
			case 2:
				dk[iter] = new RubberDuck();
				break;
			case 3:
				dk[iter] = new DecoyDuck();
				break;
			default:
				dk[iter] = new MallardDuck();
			}
		}
	}
	
	public void displayAllDucks(Graphics g) {
		for(Duck d : dk) {
			if (dk != null) {
				d.display(g);
			}
		}
	}

	public void quackAllDucks(Graphics g) {
		for(Duck d : dk) {
			if(d instanceof Cryable){
				Cryable cd = (Cryable) d;
				cd.cry(g);
			}
		}
	}

	public void flyAllDucks(Graphics g) {
		for(Duck d : dk) {
			if(d instanceof Flyable) {
				Flyable fd = (Flyable) d; // ���� �ٿ� ĳ���� ����ȯ
				fd.fly(g);
			}
		}
	}

	public void swimAllDucks(Graphics g) {
		for(Duck d : dk) {
			if (dk != null) {
				d.swim(g);
			}
		}
	}
}
