package Score;

public class Info {

	private String name;
	private int sum;
	private double avg;
	
	private int kor;
	private int mat;
	private int eng;
	
	public Info() {
		name = "NoName";
		sum = 0;
		avg = 0.0;
	}
	

//	�̸�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

//	����
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		
	}

	//	�հ�
	public int getSum() {
		return sum = kor + eng + mat;	
	}
	
//	���
	public double getAvg() {
		return sum/3.0;
	}
}
