## UML
![image](https://user-images.githubusercontent.com/43203949/226222568-c082c81e-fdca-44e0-a316-6b99032000dd.png)


## 출력예시
![image](https://user-images.githubusercontent.com/43203949/226222587-b84c76d9-aef9-4da8-8e2d-c6aa1bbed018.png)

## Main

``` java
package mycom.myhomework;

public class Main {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
```
## MyFrame

```java
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
				d.Display(g);
				d.Swim(g);
				//다운 캐스팅이 일시적으로 가능하다.
				if(d instanceof MallardDuck) {
					MallardDuck md = (MallardDuck) d; // 강제 다운 캐스팅 형변환
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
```

## Duck

```java
package mycom.myhomework;

import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	protected static int DUCK_SIZE = 50;
	protected static int TEXT_SPACE = 50;
	protected static int INDET_CHECK = 10;
	
	public Duck() {
		Random rnd = new Random();
		this.x = rnd.nextInt(DUCK_SIZE,MyFrame.WIDTH - DUCK_SIZE);
		this.y = rnd.nextInt(DUCK_SIZE,MyFrame.HEIGHT-DUCK_SIZE);
	}
	public abstract void Swim(Graphics g);
	public abstract void Display(Graphics g);
}
```

## RedDuck
``` java

package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}
	@Override
	public void Display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}
	
	public void quack(Graphics g) {
		g.drawString("꿱꿱", this.x+TEXT_SPACE-INDET_CHECK, this.y);
	}
	public void Fly(Graphics g) {
		g.drawString("날다", this.x-INDET_CHECK, this.y+TEXT_SPACE);
		
	}
	@Override
	public void Swim(Graphics g) {
		g.drawString("수영", this.x-INDET_CHECK, this.y);
		
	}
}
```

## MallardDuck

``` java
package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
	}

	@Override
	public void Display(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);
	}

	public void quack(Graphics g) {
		g.drawString("꿱꿱", this.x+TEXT_SPACE-INDET_CHECK, this.y);
	}

	public void Fly(Graphics g) {
		g.drawString("날다",this.x-INDET_CHECK, this.y+TEXT_SPACE);
	}

	@Override
	public void Swim(Graphics g) {
		g.drawString("수영",this.x-INDET_CHECK, this.y);	
	}
}
```

## RubberDuck

``` java
package mycom.myhomework;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck{

	@Override
	public void Swim(Graphics g) {
		g.drawString("수영",this.x-INDET_CHECK, this.y);	
	}

	public void bbick(Graphics g) {
		g.drawString("삑삑",this.x+TEXT_SPACE-INDET_CHECK, this.y);	
	}

	@Override
	public void Display(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillOval(this.x, this.y ,DUCK_SIZE , DUCK_SIZE);	
	}
}
``` 

## DecoyDuck

``` java
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
		g.drawString("수영",this.x-INDET_CHECK, this.y);	
	}
}
```
