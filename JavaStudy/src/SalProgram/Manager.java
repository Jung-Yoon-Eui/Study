package SalProgram;

import java.util.Scanner;

public class Manager { // ������ ���

	Scanner sc = new Scanner(System.in);

	private Main main;
	private String password;

	public Manager() {
		main = new Main();
		this.password = "admin";
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Main getMain() {
		return main;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

//	�ڵ� Ȯ��
	public boolean check() {

		if (this.password.equals(sc.next())) { // �Է��� ���� ������ password�� ������ ��
			System.out.println("�����ڸ��� �����ϼ̽��ϴ�.");
			return true;
		} else {
			System.out.println("�߸��� �ڵ� �Դϴ�. �ٽ� �Է��� �ּ���.");
			return false;
		}
	}

	
//	 ���� �Է�
	public void add(Main[] main) {

		for (int i = 0; i < 500; i++) {

			main[i] = new Main();
			System.out.print("��� ��ȣ : ");
			main[i].setNum(sc.nextInt());
			System.out.print("�̸� : ");
			main[i].setName(sc.next());
			System.out.print("�μ� �ڵ� : ");
			main[i].setDept(sc.nextByte());
			System.out.print("���� �ڵ� : ");
			main[i].setRank(sc.nextByte());
			System.out.print("��� ���� �ڵ� : ");
			main[i].setCont(sc.nextByte());
			System.out.print("�μ�Ƽ�� : ");
			main[i].setIncen(sc.nextLong());
			System.out.print("��� : ");
			main[i].getEmp();
			System.out.println(main[i].getEmp());

			System.out.println("��� �Է��Ͻðڽ��ϱ�? [y/n]");

			String a = sc.next();

			if (a.equals("y") || a.equals("Y")) {
				continue;
			} else {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
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
