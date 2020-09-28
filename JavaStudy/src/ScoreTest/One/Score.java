package ScoreTest.One;

import java.util.Scanner;

public class Score {

	String name;// �̸�
	int[] score;// ��, ��, ��, ��
	float avg;	// ���

	//������
	public Score() {

		name = "noname";
		score = new int [4];
		avg = 0;
	}
	public Score(String a, int[] b, float c) {

		name = a;
		score = b;
		avg = c;
	}

	//�޼ҵ�

	//name getter/setter
	public void setName(String a) {
		this.name = a;
	}
	public String getName() {
		return name;
	}

	//score getter/setter
	public void setScore(int a, int score) {
		this.score[a] = score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}

	//score getter/setter �����ε�
	public int getScore(int a) {
		return score[a];
	}
	public int[] getScore() {
		return score;
	}

	//score�� ���� �Է� �޾��� �� �� ��
	public float getTotal() {
		return score[3] = score[0]+score[1]+score[2];
	}
	//���
	public float getAvg() {
		return getTotal()/3.f;
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�Է��� ������ �� : ");
		int n = sc.nextInt();

		Score[] ye = new Score[n];	// �迭�� ũ�Ⱑ n�� �迭 ����

		
		// �Է�
		
		for(int j=0; j<ye.length; j++) {

			// �ݺ����� �迭�� ��ü ����.
			ye[j] = new Score();

			System.out.println("----���� �Է�-----");
			// �̸� �Է�
			ye[j].setName(sc.next());	

			// �迭�� ���� �Է�
			for(int i=0; i<3; i++) {
				ye[j].setScore(i, sc.nextInt());	
			}

		}
		
		System.out.println("---------------");
		
		
		// ���
		for(int j=0; j<ye.length; j++) {
			
			// �̸� ���
			System.out.println("�̸� : " + ye[j].getName());	

			// ���� ���
			for(int i=0; i<3; i++) {
				switch(i) {
				case 0:
					System.out.print("���� : ");
					break;
				case 1:
					System.out.print("���� : ");
					break;
				case 2:
					System.out.print("���� : ");
					break;
				}
				
				System.out.println(ye[j].getScore(i));
				
			}
			
			// ����, ��� ���
			System.out.println("�հ� : " + ye[j].getTotal());	
			System.out.println("��� : " + ye[j].getAvg());
			
			System.out.println("---------------");
		}
	}
}

