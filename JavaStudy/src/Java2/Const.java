package Java2;

public class Const {

	//field
	private int money;
	
	// ������ �����ε�
	public Const(){
		System.out.println("������ ȣ��1");
	}
	public Const(int m){
		System.out.println("������ ȣ��2");
		money=m;
	}
	
	// �޼ҵ� method
	public void disp() {
		
		// �̷��� private�� ��ȸ ������ ����.
		System.out.println(money);  
	}
	
	public void setMoney(int m) {
		money = m;
	}
	
	public int getMoney(int m) {
		return money;
	}
	
	public static void main(String[] args) {
		
		// ��ü ���� : ������ �Լ� �ڵ� ȣ��.
		Const con = new Const(); 
		Const con1 = new Const(1000);
		
		con.disp();
		con1.disp();
		
		con.setMoney(5000); // �� �ֱ�
		con.disp();
		
	}
}
