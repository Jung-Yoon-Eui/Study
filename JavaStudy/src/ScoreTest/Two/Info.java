package ScoreTest.Two;

public class Info {

	private String name;
	private int[] score;
	private int sum;
	private double avg;
	
	public Info() {
		name = "NoName";
		score = new int[3];
		sum = 0;
		avg = 0.0;
	}
	
	public Info(String name, int[] score, int sum, double avg) {
		
		this.name = name;
		this.score = score;
		this.sum = sum;
		this.avg = avg;
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

//	����
	public int getScore(int i) {
		return score[i];
	}
	public void setScore(int i, int score) {
		this.score[i] = score;
	}
	
//	�հ�
	public int getSum() {
			sum = score[0]+score[1]+score[2];
		return sum;
	}
	
//	���
	public double getAvg() {
		return sum/3.0;
	}
}
