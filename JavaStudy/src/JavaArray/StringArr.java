package JavaArray;

public class StringArr {

	public static void main(String[] args) {

		String str = "Superman";
		System.out.println(str);
		
		String str22 = new String("Superman");
		System.out.println(str22);
		
		System.out.print("���� �ּҴ� ");
		if(str == str22) { // ���� �ּ�
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		System.out.print("���� ");
		if(str.equals(str22)) { // ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
}
