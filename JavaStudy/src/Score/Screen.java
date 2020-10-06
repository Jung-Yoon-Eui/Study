package Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Screen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Info> list = new ArrayList<Info>();
		
		
		String[] infoArr = { "이름 : ", "국어 : ", "수학 : ", "영어 : ", "총점 : ", "평균 : " };
		
		boolean whi = true;
		while(whi){
			System.out.println("1.정보 등록 | 2.정보 수정 | 3.정보 삭제 | 4.개인 정보 조회 | 5.전체 정보 조회 | 6.종료");
			int check = sc.nextInt();

			switch(check){
				case 1:	// 정보 등록
					
					Info info = new Info();
					System.out.println("정보 등록을 시작합니다.");
					System.out.print("이름 : ");
					info.setName(sc.next());
	
					System.out.println("점수");
					System.out.print(infoArr[1]);info.setKor(sc.nextInt());
					System.out.print(infoArr[2]);info.setMat(sc.nextInt());
					System.out.print(infoArr[3]);info.setEng(sc.nextInt());
					list.add(info);
					
					System.out.println("등록되었습니다.");
					break;
	
				case 2:	// 정보 수정
					
					System.out.println("정보 수정을 시작합니다.");
					System.out.println("누구의 정보를 수정하시겠습니까?");
					String name = sc.next();

					for(int j=0; j<list.size(); j++){
						if(list.get(j).getName().equals(name)){
							while(true){
								System.out.println("어떤 정보를 수정하시겠습니까?");
								System.out.println("1.이름 | 2.점수 | 3. 취소");
								int change = sc.nextInt();

								switch(change){
								case 1: System.out.print(infoArr[0]);
								list.get(j).setName(sc.next());
								System.out.println("수정되었습니다."); break;

								case 2:
									System.out.print(infoArr[1]);list.get(j).setKor(sc.nextInt());
									System.out.print(infoArr[2]);list.get(j).setMat(sc.nextInt());
									System.out.print(infoArr[3]);list.get(j).setEng(sc.nextInt());
									System.out.println("수정되었습니다."); break;
								default : break;
								}break;
							}
						}
					}
					break;

				case 3:	// 정보 삭제

					System.out.println("정보 삭제를 시작합니다.");
					System.out.println("누구의 정보를 삭제하시겠습니까?");
					String nameDel = sc.next();

					for(int j=0; j<list.size(); j++){
						list.remove(j).equals(nameDel);
						System.out.println("삭제되었습니다.");
					}
					break;

				case 4:	// 개인 정보 조회
					System.out.println("정보 조회를 시작합니다.");
					System.out.println("누구의 정보를 조회하시겠습니까?");
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

				case 5:	// 전체 정보 조회
					System.out.println("정보 조회를 시작합니다.");

					for(int j=0; j<list.size(); j++){

						System.out.print(infoArr[0]+list.get(j).getName()+"\t");

						System.out.print(infoArr[1]+" : "+list.get(j).getKor());
						System.out.print(infoArr[2]+" : "+list.get(j).getMat());
						System.out.print(infoArr[3]+" : "+list.get(j).getEng());

						System.out.print(infoArr[4]+list.get(j).getSum()+"\t");
						System.out.println(infoArr[5]+list.get(j).getAvg()+"\t");

					} break;

				default : System.out.println("종료되었습니다.");
				whi = false;	// 종료

			}
		}
	}
}
