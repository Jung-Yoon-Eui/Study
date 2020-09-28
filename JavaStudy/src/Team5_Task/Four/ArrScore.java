package Team5_Task.Four;

import java.util.Scanner;

public class ArrScore {

	private String name;	// �̸�
	private int[] score;	// ����
	private double avg;		// ���
	private int num;		// �պ�
	
	
	public ArrScore(){
		this.name = "noName";
		score = new int [4];
		this.avg = 0.0;
		this.num = 0;
	}
	
//	�̸�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	����
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	
	public int getScore(int a) {
		return score[a];
	}
	public void setScore(int a, int score) {
		this.score[a] = score;
	}

//	���
	public double getAvg() {
		for(int i = 0; i<score.length; i++){
			avg += score[i];
		}
		return avg/(score.length);
	}
	
//	�պ�
	public String getNum() {
		
		if(getAvg()>=80){
			return "�հ�";
		}else{
			return "���հ�";
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String[] scoName = {"�̸� : ","���� : ","���� : ","���� : ","���� : "};

		System.out.print("��� �Է�?");
		int n = sc.nextInt();

		ArrScore[] print = new ArrScore[n];	// �迭 ����
		
		for(int i = 0; i<n; i++){
			
			print[i] = new ArrScore();	// ��ü ����
			
			System.out.print("�̸� "); 
			print[i].setName(sc.next());
			System.out.println("����");

			for(int j=0; j<4; j++){
				print[i].setScore(j,sc.nextInt()); 
			}
		}
		for(int i = 0; i<n; i++){
			System.out.print(scoName[0]+print[i].getName()+"|");
			
			for(int j = 0; j<4; j++){
				System.out.print(scoName[j+1]+print[i].getScore(j)+"|");
			}
			System.out.println(print[i].getNum()+"|");
		}
	}
}	