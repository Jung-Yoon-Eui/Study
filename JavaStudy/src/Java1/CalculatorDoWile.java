package Java1;

import java.util.Scanner;

public class CalculatorDoWile {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); // Ű���� �Է� ��ü ����

	int a,b;   // �� �� �Է� ���� ���� 
	String x; // ������ �Է� ���� ����
	String start; // ��� ���� ���� ����
	String k;

	do {
		start ="";
		System.out.println("����Ͻðڽ��ϱ�? [Y/N]");	
		start = sc.nextLine();

		if (start.equalsIgnoreCase("y")) {

			System.out.println("������ �Է��ϼ���.");

			a = sc.nextInt();
			x = sc.next();
			b = sc.nextInt();	

			switch(x){
			
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
				
			default : System.out.println("�߸��� ��û�Դϴ�.");
			}

		}else if(start!="y") {
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		System.out.println("�����?[Y/N]");
		k= sc.next();

	}while(k.equalsIgnoreCase("y"));
}
}
