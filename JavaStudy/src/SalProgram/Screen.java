package SalProgram;

import java.util.Scanner;

public class Screen {	// ����� ȭ��

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Manager ma = new Manager();	// ������ ���
		User user  = new User();	// ����� ���

		Main[] main = new Main[500];	// �ִ� ��� ���� �ο� �� 500.. �޸� ����...

		while(true){

			System.out.println("1. ������ ��� | 2. ����� ��� | 3. ����");

			int a = sc.nextInt();

			if(a == 1){
				System.out.println("������ �ڵ带 �Է����ּ���.");

				if(ma.check()){


					while(true){

						System.out.println("1. ��� ���� ��� | 2. ��� ���� ��ȸ | 3. ����");

						int b = sc.nextInt();

						if(b == 1){

							ma.add(main);

						}else if(b == 2){

							ma.search(main);

						}else if(b == 3){

							System.out.println("������ ��带 �����մϴ�.");
							break;

						}else{
							System.out.println("�߸��� ��û�Դϴ�.");
						}
					}

				}else{
					System.out.println("�߸��� ��û�Դϴ�.");
					continue;
				}

			}else if(a == 2){

				if(user.check()){

					System.out.println("��� ��ȣ�� �Է����ּ���.");

					if(user.check()){
						user.search(main);
					}
				}

			}else{
				System.out.println("System�� �����մϴ�.");
				break;
			}
		}
	}
}
