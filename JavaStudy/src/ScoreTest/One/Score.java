package ScoreTest.One;

import java.util.Scanner;

public class Score {

	String name;// 이름
	int[] score;// 국, 영, 수, 합
	float avg;	// 평균

	//생성자
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

	//메소드

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

	//score getter/setter 오버로딩
	public int getScore(int a) {
		return score[a];
	}
	public int[] getScore() {
		return score;
	}

	//score가 값을 입력 받았을 때 총 합
	public float getTotal() {
		return score[3] = score[0]+score[1]+score[2];
	}
	//평균
	public float getAvg() {
		return getTotal()/3.f;
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 데이터 수 : ");
		int n = sc.nextInt();

		Score[] ye = new Score[n];	// 배열의 크기가 n인 배열 생성

		
		// 입력
		
		for(int j=0; j<ye.length; j++) {

			// 반복마다 배열에 객체 생성.
			ye[j] = new Score();

			System.out.println("----정보 입력-----");
			// 이름 입력
			ye[j].setName(sc.next());	

			// 배열에 점수 입력
			for(int i=0; i<3; i++) {
				ye[j].setScore(i, sc.nextInt());	
			}

		}
		
		System.out.println("---------------");
		
		
		// 출력
		for(int j=0; j<ye.length; j++) {
			
			// 이름 출력
			System.out.println("이름 : " + ye[j].getName());	

			// 점수 출력
			for(int i=0; i<3; i++) {
				switch(i) {
				case 0:
					System.out.print("국어 : ");
					break;
				case 1:
					System.out.print("수학 : ");
					break;
				case 2:
					System.out.print("영어 : ");
					break;
				}
				
				System.out.println(ye[j].getScore(i));
				
			}
			
			// 총점, 평균 출력
			System.out.println("합계 : " + ye[j].getTotal());	
			System.out.println("평균 : " + ye[j].getAvg());
			
			System.out.println("---------------");
		}
	}
}

