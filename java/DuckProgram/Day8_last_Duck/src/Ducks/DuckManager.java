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
		//랜덤하게 타입이 결정되도록 ~
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
				Flyable fd = (Flyable) d; // 강제 다운 캐스팅 형변환
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
