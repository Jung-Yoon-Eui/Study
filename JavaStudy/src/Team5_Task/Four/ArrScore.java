package Team5_Task.Four;

import java.util.Scanner;

public class ArrScore {

	private String name;	// 이름
	private int[] score;	// 점수
	private double avg;		// 평균
	private int num;		// 합불
	
	
	public ArrScore(){
		this.name = "noName";
		score = new int [4];
		this.avg = 0.0;
		this.num = 0;
	}
	
//	이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	점수
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

//	평균
	public double getAvg() {
		for(int i = 0; i<score.length; i++){
			avg += score[i];
		}
		return avg/(score.length);
	}
	
//	합불
	public String getNum() {
		
		if(getAvg()>=80){
			return "합격";
		}else{
			return "불합격";
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String[] scoName = {"이름 : ","국어 : ","영어 : ","수학 : ","과학 : "};

		System.out.print("몇명 입력?");
		int n = sc.nextInt();

		ArrScore[] print = new ArrScore[n];	// 배열 선언
		
		for(int i = 0; i<n; i++){
			
			print[i] = new ArrScore();	// 객체 생성
			
			System.out.print("이름 "); 
			print[i].setName(sc.next());
			System.out.println("성적");

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