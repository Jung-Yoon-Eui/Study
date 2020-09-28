package SalProgram;

import java.util.Scanner;

public class Manager { // 관리자 모드

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

//	코드 확인
	public boolean check() {

		if (this.password.equals(sc.next())) { // 입력한 값이 지정된 password와 동일할 때
			System.out.println("관리자모드로 접속하셨습니다.");
			return true;
		} else {
			System.out.println("잘못된 코드 입니다. 다시 입력해 주세요.");
			return false;
		}
	}

	
//	 정보 입력
	public void add(Main[] main) {

		for (int i = 0; i < 500; i++) {

			main[i] = new Main();
			System.out.print("등록 번호 : ");
			main[i].setNum(sc.nextInt());
			System.out.print("이름 : ");
			main[i].setName(sc.next());
			System.out.print("부서 코드 : ");
			main[i].setDept(sc.nextByte());
			System.out.print("직급 코드 : ");
			main[i].setRank(sc.nextByte());
			System.out.print("계약 형태 코드 : ");
			main[i].setCont(sc.nextByte());
			System.out.print("인센티브 : ");
			main[i].setIncen(sc.nextLong());
			System.out.print("사번 : ");
			main[i].getEmp();
			System.out.println(main[i].getEmp());

			System.out.println("계속 입력하시겠습니까? [y/n]");

			String a = sc.next();

			if (a.equals("y") || a.equals("Y")) {
				continue;
			} else {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}
	}

//	정보 조회
	public void search(Main[] main) {

		int i;

		go: while(true) {

			System.out.println("사번을 입력하세요.");
			String a = sc.next();

			for (i = 0; i < main.length; i++) {

				if (main[i].getEmp().equals(a)) { // 입력 받은 사번이 main에 저장된 사번과 같을 때

					System.out.println("사번\t이름\t부서\t직급\t계약 형태\t인센티브\t급여");

					System.out.print(main[i].getEmp() + "\t"); // 사번
					System.out.print(main[i].getName() + "\t"); // 이름
					System.out.print(main[i].getDeptN() + "\t"); // 부서 명
					System.out.print(main[i].getRankN() + "\t"); // 부서 명
					System.out.print(main[i].getContN() + "\t"); // 계약 형태
					System.out.print(main[i].getIncen() + "\t"); // 인센티브
					System.out.println(main[i].getSal() + "\t"); // 급여

				}

				if (main[i].getEmp().equals(a)) {
					System.out.println("계속 조회하시겠습니까? [y/n]");

					String b = sc.next();

					if (b.equals("y") || b.equals("Y")) {
						i = 0;
						continue go;
					} else {
						System.out.println("입력을 종료합니다.");
						break go;
					}
				}
			}
		}
	}
}
