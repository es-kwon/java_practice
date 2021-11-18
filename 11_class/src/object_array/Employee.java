package object_array;

public class Employee {
	private int eno; // 사원 번호
	private String name; // 사원 이름
	private String position; // 직급
	private String depart; // 부서
	private static int count = 0; // 사원수 (객체수)
	private static final String COMPANY = "Goott Academy";
	
	
	// 생성자
	public Employee() {
		count++;
	}
	
	public Employee(int eno) {
		this.eno = eno;
		count++;
	}
	
	public Employee(int eno, String name, String position, String depart) {
		this.eno = eno;
		this.name = name;
		this.position = position;
		this.depart = depart;
		count++;
	}

	// getter, setter
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public static int getCount() {
		return count;
	}

	public static String getCompany() {
		return COMPANY;
	}

	@Override
	public String toString() {
		return String.format("eno : %d, name : %s, position : %s, depart : %s", 
				eno, name, position, depart);
	}
	
	@Override
	public boolean equals(Object c) {
		if ((this.eno == ((Employee) c).eno)
				&& this.name.equals(((Employee) c).name)
				&& this.position.equals(((Employee) c).position)
				&& this.depart.equals(((Employee) c).depart)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
