package Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Screen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Info> list = new ArrayList<Info>();
		
		
		String[] infoArr = { "�̸� : ", "���� : ", "���� : ", "���� : ", "���� : ", "��� : " };
		
		boolean whi = true;
		while(whi){
			System.out.println("1.���� ��� | 2.���� ���� | 3.���� ���� | 4.���� ���� ��ȸ | 5.��ü ���� ��ȸ | 6.����");
			int check = sc.nextInt();

			switch(check){
				case 1:	// ���� ���
					
					Info info = new Info();
					System.out.println("���� ����� �����մϴ�.");
					System.out.print("�̸� : ");
					info.setName(sc.next());
	
					System.out.println("����");
					System.out.print(infoArr[1]);info.setKor(sc.nextInt());
					System.out.print(infoArr[2]);info.setMat(sc.nextInt());
					System.out.print(infoArr[3]);info.setEng(sc.nextInt());
					list.add(info);
					
					System.out.println("��ϵǾ����ϴ�.");
					break;
	
				case 2:	// ���� ����
					
					System.out.println("���� ������ �����մϴ�.");
					System.out.println("������ ������ �����Ͻðڽ��ϱ�?");
					String name = sc.next();

					for(int j=0; j<list.size(); j++){
						if(list.get(j).getName().equals(name)){
							while(true){
								System.out.println("� ������ �����Ͻðڽ��ϱ�?");
								System.out.println("1.�̸� | 2.���� | 3. ���");
								int change = sc.nextInt();

								switch(change){
								case 1: System.out.print(infoArr[0]);
								list.get(j).setName(sc.next());
								System.out.println("�����Ǿ����ϴ�."); break;

								case 2:
									System.out.print(infoArr[1]);list.get(j).setKor(sc.nextInt());
									System.out.print(infoArr[2]);list.get(j).setMat(sc.nextInt());
									System.out.print(infoArr[3]);list.get(j).setEng(sc.nextInt());
									System.out.println("�����Ǿ����ϴ�."); break;
								default : break;
								}break;
							}
						}
					}
					break;

				case 3:	// ���� ����

					System.out.println("���� ������ �����մϴ�.");
					System.out.println("������ ������ �����Ͻðڽ��ϱ�?");
					String nameDel = sc.next();

					for(int j=0; j<list.size(); j++){
						list.remove(j).equals(nameDel);
						System.out.println("�����Ǿ����ϴ�.");
					}
					break;

				case 4:	// ���� ���� ��ȸ
					System.out.println("���� ��ȸ�� �����մϴ�.");
					System.out.println("������ ������ ��ȸ�Ͻðڽ��ϱ�?");
					String nameSer = sc.next();

					for(int j=0; j<list.size(); j++){

						if (list.get(j).getName().equals(nameSer)) {

							System.out.print(infoArr[0]+list.get(j).getName()+"\t");

							System.out.print(infoArr[1]+" : "+list.get(j).getKor());
							System.out.print(infoArr[2]+" : "+list.get(j).getMat());
							System.out.print(infoArr[3]+" : "+list.get(j).getEng());

							System.out.print(infoArr[4]+list.get(j).getSum()+"\t");
							System.out.println(infoArr[5]+list.get(j).getAvg()+"\t");

						}
					} break;

				case 5:	// ��ü ���� ��ȸ
					System.out.println("���� ��ȸ�� �����մϴ�.");

					for(int j=0; j<list.size(); j++){

						System.out.print(infoArr[0]+list.get(j).getName()+"\t");

						System.out.print(infoArr[1]+" : "+list.get(j).getKor());
						System.out.print(infoArr[2]+" : "+list.get(j).getMat());
						System.out.print(infoArr[3]+" : "+list.get(j).getEng());

						System.out.print(infoArr[4]+list.get(j).getSum()+"\t");
						System.out.println(infoArr[5]+list.get(j).getAvg()+"\t");

					} break;

				default : System.out.println("����Ǿ����ϴ�.");
				whi = false;	// ����

			}
		}
	}
}
