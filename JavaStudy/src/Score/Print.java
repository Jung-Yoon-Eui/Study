package Score;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Print{
	
	Frame f;
	Panel p1, p2, p3;
	
	TextField tf;
	TextArea ta;

	Button b1, b2, b3, b4, b5, bSer, bCom, bDel;
	
	public Print() {
		f  = new Frame("���� ó�� Program");
		p1 = new Panel();			
		p2 = new Panel();			
		p3 = new Panel();			
	
		b1 = new Button("���� ���");
		b2 = new Button("���� ����");
		b3 = new Button("���� ��ȸ");
		b4 = new Button("��ü ��ȸ");
		b5 = new Button("���� ����");
		bSer = new Button("�˻�");
		bCom = new Button("����");
		bDel = new Button("����");
		
		tf = new TextField(200);
		ta = new TextArea(10,200);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p2.add(bSer);
		p3.add(bCom);
//		p3.add(bDel);
		
		f.add("North",p1);
		f.add("Center",p2);
		f.add("South",p3);
		
		f.setLocation(200,200);
		f.setSize(1000,500);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Print();
		
	}
}
