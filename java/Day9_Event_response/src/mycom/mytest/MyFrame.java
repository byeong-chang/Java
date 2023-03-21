package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	LinkedList<Myshape> arr = new LinkedList<Myshape>();
	
	public MyFrame() {
		super("�̺�Ʈ ���α׷�");
		this.addMouseListener(new MyHandler());//�̺�Ʈ ó���� ���
		//������ â�ݱ� ó���� ���
		this.addWindowListener(new WindowAdapter(){
		        public void windowClosing(WindowEvent e) //WindowAdapter class Overriding
		        { 
		        	System.out.println("�����մϴ� 	");
		            System.exit(0); //���α׷� ���� �ϱ�
		        }
		   });
		
		this.setSize(MyFrame.FRAME_WIDTH,MyFrame.FRAME_HEIGHT);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		for(Myshape s:arr) {
			s.display(g);
		}
	}
	
	//User�� ���� ���콺 Ŭ���� �Ͼ�� �׸��� ������ ����
	//Ŭ���� ���� Listener�� �ʿ���.
	class MyHandler implements MouseListener{ // iner Class�� Life Cycle�� �����ϰ� �Ѵ�.

		@Override
		public void mousePressed(MouseEvent e){
			arr.add(new Myshape(e.getX(),e.getY()));
			repaint();
		}
		@Override
		public void mouseClicked(MouseEvent e){;}
		@Override
		public void mouseReleased(MouseEvent e) {;}
		@Override
		public void mouseEntered(MouseEvent e){;}
		@Override
		public void mouseExited(MouseEvent e){;}
		
	}
}
