package GUI.Score;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Score.Info;

public class Score extends Frame implements ActionListener{

	Frame f;
	Panel p1, p2, p3, p4, p5, p6;
	Button b1, b2, b3, b4, b5, bSer, bCom;

	public static void main(String[] args){
		Score score = new Score();
	}

	TextField TestF, name, kor, mat, eng, ser; //sum, avg;
	TextArea  area;
	Label nameN;

	Info info = new Info();
	List<Info> list = new ArrayList<Info>();
	Scanner sc = new Scanner(System.in);

	public Score(){

		f  = new Frame("성적 처리 Program");
		p1 = new Panel();         
		p2 = new Panel();         
		p3 = new Panel();         
		p4 = new Panel();         
		p5 = new Panel();         
		p6 = new Panel();         

		b1 = new Button("정보 등록");
		b2 = new Button("정보 수정");
		b3 = new Button("개인 조회");
		b4 = new Button("전체 조회");
		b5 = new Button("정보 삭제");
		bSer = new Button("검색");
		bCom = new Button("종료");

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);

		p2.add(nameN = new Label("이름"));
		p2.add(ser = new TextField(30));
		p2.add(bSer);

		p3.add(new Label("이름         "));
		p3.add(new Label("국어         "));
		p3.add(new Label("수학         "));
		p3.add(new Label("영어"));
		//      p3.add(new Label("총점   "));
		//      p3.add(new Label("평균"));

		p4.add(name = new TextField(6));
		p4.add(kor = new TextField(6));
		p4.add(mat = new TextField(6));
		p4.add(eng = new TextField(6));
		//      p4.add(sum = new TextField(3));
		//      p4.add(avg = new TextField(3));

		p5.add(area = new TextArea("이름\t국어\t수학\t영어\t\n",5,45));
		p6.add(bCom);

		f.setLayout(new FlowLayout(FlowLayout.CENTER,10,15)); // 프레임 위치 조정
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		bSer.addActionListener(this);
		bCom.addActionListener(this);


		// 위치 좌표 지정
		f.setLocation(200,200);
		// 창 크기 지정
		f.setSize(400,400);
		// 창을 보이게 함
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		String pick = e.getActionCommand();

		if(pick.equals("정보 등록")) {

			Info info = new Info();
			info.setName(name.getText());
			info.setKor(Integer.parseInt(kor.getText()));
			info.setMat(Integer.parseInt(mat.getText()));
			info.setEng(Integer.parseInt(eng.getText()));
			list.add(info);

			area.append(info.getName()+"\t");
			area.append(kor.getText()+"\t");
			area.append(mat.getText()+"\t");
			area.append(eng.getText()+"\n");

		}else if(pick.equals("정보 수정")){

			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getName().equals(ser.getText()))
				list.get(i).setName(ser.getText());
				list.get(i).setKor(Integer.parseInt(kor.getText()));
				list.get(i).setMat(Integer.parseInt(mat.getText()));
				list.get(i).setEng(Integer.parseInt(eng.getText()));
			}
		}else if(pick.equals("개인 조회")) {

			for(int i=0; i<list.size(); i++) {
				if (list.get(i).getName().equals(ser.getText())) {
					area.append(list.get(i).getName()+"\t");
					area.append(list.get(i).getKor()+"\t");
					area.append(list.get(i).getMat()+"\t");
					area.append(list.get(i).getEng()+"\t");
				}
			}
		}else if(pick.equals("전체 조회")) {
			for(int i=0; i<list.size(); i++) {
//				area.append(list.get(i).getName()+"\t");
				area.append(list.get(i).getName()+"\t");
				area.append(list.get(i).getKor()+"\t");
				area.append(list.get(i).getMat()+"\t");
				area.append(list.get(i).getEng()+"\t\n");
			}
		}else if(pick.equals("정보 삭제")) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getName().equals(ser.getText())) {
					list.remove(i);
				}
			}
		}else if(pick.equals("검색")) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getName().equals(ser.getText())) {
					name.setText(list.get(i).getName()+"");
					kor.setText(list.get(i).getKor()+"");
					mat.setText(list.get(i).getMat()+"");
					eng.setText(list.get(i).getEng()+"");
				}
			}
		}else if(pick.equals("종료")) {
			System.exit(0);
		}	   
	}
}
