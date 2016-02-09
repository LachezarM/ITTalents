package work;

public class Employee extends Person{
	private int daySalary;
	
	Employee(String name, int age, boolean isMale,int daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	public double calculateOvertime(double hours){
		if(super.age < 18){
			return 0;
		}	else {
			return 1.5 * hours * (daySalary / 8);
		}
	}
	private void showEmployeeInfo(){
		super.getShow();
		System.out.println("Day Salary: " + this.daySalary);
	}
	void getShow(){
		showEmployeeInfo();
	}
}
