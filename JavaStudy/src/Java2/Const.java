package Java2;

public class Const {

	//field
	private int money;
	
	// 생성자 오버로딩
	public Const(){
		System.out.println("생성자 호출1");
	}
	public Const(int m){
		System.out.println("생성자 호출2");
		money=m;
	}
	
	// 메소드 method
	public void disp() {
		
		// 이렇게 private에 우회 접근이 가능.
		System.out.println(money);  
	}
	
	public void setMoney(int m) {
		money = m;
	}
	
	public int getMoney(int m) {
		return money;
	}
	
	public static void main(String[] args) {
		
		// 객체 생성 : 생성자 함수 자동 호출.
		Const con = new Const(); 
		Const con1 = new Const(1000);
		
		con.disp();
		con1.disp();
		
		con.setMoney(5000); // 값 넣기
		con.disp();
		
	}
}
