package object_array;

public class EmpGroup {
	private Employee[] empGroup;
	
	public EmpGroup(Employee[] empGroup) {
		this.empGroup = empGroup;
	}
	
	public void displayEmployee() {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]);
		}
	}
	
	public static void displayEmployee(Employee[] empGroup) {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]);
		}
	}
	
	public Employee[] searchEmployeebyPosition(String userInputPosition) {
		int count = 0;
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getPosition().equals(userInputPosition)) {
				count++;
			}
		}
		Employee[] arraybyPosition = new Employee[count];
		int index = 0;
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getPosition().equals(userInputPosition)) {
				arraybyPosition[index] = empGroup[i];
				index++;
			}
		}
		return arraybyPosition;
	}
	
	public Employee[] searchEmployeebyDepart(String userInputDepart) {
		int count = 0;
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getDepart().equals(userInputDepart)) {
				count++;
			}
		}
		Employee[] arraybyDepart = new Employee[count];
		int index = 0;
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getDepart().equals(userInputDepart)) {
				arraybyDepart[index] = empGroup[i];
				index++;
			}
		}
		return arraybyDepart;
	}
}
