package SalProgram;

public class Main {	// ���� ���� program

	private Name name;			// �̸�
	private Dept dept;			// �μ� �ڵ�
	private Rank rank;			// ���� �ڵ�
	private Cont cont;			// ��� ���� �ڵ�
	private Incentive incen;	// �μ�Ƽ��
	
	private String deptN;		// �μ� �̸�
	private String rankN;		// ���� �̸�
	private String contN;		// ��� ���� �̸�
	
	private long sal;			// �޿�
	private String emp;			// ���
	private int num;			// ��� ����
	
	
	public Main() {
		name	= new Name();
		dept	= new Dept();
		rank	= new Rank();
		cont	= new Cont();
		incen	= new Incentive();
		
		String deptN = "noDept";
		String rankN = "noRank";
		String contN = "noCont";
		
		long 	sal = 0L;
		String 	emp = "000000";
		int 	num = 0;
	}

//	�̸�
	public String getName() {
		return name.getName();
	}

	public void setName(String name) {
		this.name.setName(name);
	}

//	�μ� �ڵ�
	public byte getDept() {
		return dept.getDept();
	}

	public void setDept(byte dept) {
		this.dept.setDept(dept);
	}

//	���� �ڵ�
	public byte getRank() {
		return rank.getRank();
	}

	public void setRank(byte rank) {
		this.rank.setRank(rank);
	}

//	��� ���� �ڵ�
	public byte getCont() {
		return cont.getCont();
	}

	public void setCont(byte cont) {
		this.cont.setCont(cont);
	}

//	�μ�Ƽ��
	public long getIncen() {
		return incen.getIncen();
	}

	public void setIncen(long incen) {
		this.incen.setIncen(incen);
	}


//	�μ� �̸�
	public String getDeptN() {
		
		switch (dept.getDept()){
			case 10: deptN = "����";	break;
			case 20: deptN = "����";	break;
			case 30: deptN = "ǰ��";	break;
		default : deptN = "x";
		}
		 return deptN;
	}

	
//	����
	public String getRankN() {
		
		switch (rank.getRank()){
			case 1: rankN = "���";	break;
			case 2: rankN = "�븮";	break;
			case 3: rankN = "����";	break;
			case 4: rankN = "����";	break;
			case 5: rankN = "����";	break;
		default : rankN = "x";
		}
		 return rankN;
	}

//	��� ����
	public String getContN() {
		
		switch (cont.getCont()){
			case 1: contN = "������";	break;
			case 2: contN = "��������";	break;
		default : contN = "x"; 
		}
		 return contN;
	}

//	�޿�
	public long getSal() {
		long sum = 2000000;
		
		switch (this.dept.getDept()){
			case 10: sum = 300000;	break;	// ����
			case 20: sum = 500000;	break;	// ����
			case 30: sum = 0; 		break;	// ǰ��
		}
		switch (this.rank.getRank()){
			case 5: sum += 300000;			// ����
			case 4: sum += 300000;			// ����
			case 3: sum += 300000;			// ����
			case 2: sum += 300000;			// �븮
			case 1: sum += 0	 ;	break;	// ���
		}
		switch (this.cont.getCont()){
			case 1: sum += 500000; 	break;	// ������
			case 2: sum += 0; 		break;	// ��������
		}
		
		return sum = 2000000 + this.incen.getIncen();// �⺻��  + ���ǿ� ���� �߰��� + �μ�Ƽ��
	}


//	��� ����
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
//	��� ��ȣ
		
	public String getEmp() {
		return ""+dept.getDept()+rank.getRank()+cont.getCont()+num;
	}
}

