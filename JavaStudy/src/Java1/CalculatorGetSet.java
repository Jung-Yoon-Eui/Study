package Java1;

public class CalculatorGetSet {

	//�ʵ� ���� ����
	private int equals; // ��� ��
	private int a,b;	// ��� �� ��
	private String x; 	// ������ ��ȣ
	
	
	//setter
	public void setA(int a) {
		this.a = a;
	}
	
	public void setX(String x) {
		this.x = x;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	

	//getter
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public String getX() {
		return x;
	}
	
	
	//method
	public int Equals() {
		
		switch(x){
			case "+":	// ���ϱ�
				equals = (getA()+getB());
			break;
			case "-":	//����
				equals = (getA()-getB());
			break;
			case "*":	//���ϱ�
				equals = (getA()*getB());
			break;
			case "/":	//������
				equals = (getA()/getB());
			break;
		default : System.out.println("�߸��� ��û�Դϴ�.");
			System.exit(0);	//����
		}
			return equals;	// ���� ��� ����
	}
}

