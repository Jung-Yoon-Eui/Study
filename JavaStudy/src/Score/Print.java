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
		f  = new Frame("성적 처리 Program");
		p1 = new Panel();			
		p2 = new Panel();			
		p3 = new Panel();			
	
		b1 = new Button("정보 등록");
		b2 = new Button("정보 수정");
		b3 = new Button("개인 조회");
		b4 = new Button("전체 조회");
		b5 = new Button("정보 삭제");
		bSer = new Button("검색");
		bCom = new Button("저장");
		bDel = new Button("삭제");
		
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
