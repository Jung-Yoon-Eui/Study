package SalProgram;

import java.util.Scanner;

public class User {	// ����� ���
	
	Scanner sc = new Scanner(System.in);
	
	private String emp = "00000";	// ��� �⺻��

	
//	�޼ҵ�
	
//	�ڵ� Ȯ��
	public boolean check(){
		
		System.out.println("����� �Է��ϼ���.");
		
		if(this.emp.equals(sc.next())){	// �Է��� ���� ����� ��
			return true;
		}else{
			System.out.println("��ϵ��� ���� �����Դϴ�.");
			return false;
		}
	}

//	���� ��ȸ
	public void search(Main[] main) {

		int i;

		go: while(true) {

			System.out.println("����� �Է��ϼ���.");
			String a = sc.next();

			for (i = 0; i < main.length; i++) {

				if (main[i].getEmp().equals(a)) { // �Է� ���� ����� main�� ����� ����� ���� ��

					System.out.println("���\t�̸�\t�μ�\t����\t��� ����\t�μ�Ƽ��\t�޿�");

					System.out.print(main[i].getEmp() + "\t"); // ���
					System.out.print(main[i].getName() + "\t"); // �̸�
					System.out.print(main[i].getDeptN() + "\t"); // �μ� ��
					System.out.print(main[i].getRankN() + "\t"); // �μ� ��
					System.out.print(main[i].getContN() + "\t"); // ��� ����
					System.out.print(main[i].getIncen() + "\t"); // �μ�Ƽ��
					System.out.println(main[i].getSal() + "\t"); // �޿�

				}

				if (main[i].getEmp().equals(a)) {
					System.out.println("��� ��ȸ�Ͻðڽ��ϱ�? [y/n]");

					String b = sc.next();

					if (b.equals("y") || b.equals("Y")) {
						i = 0;
						continue go;
					} else {
						System.out.println("�Է��� �����մϴ�.");
						break go;
					}
				}
			}
		}
	}
}
