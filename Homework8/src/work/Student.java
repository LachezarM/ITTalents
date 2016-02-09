package work;

public class Student extends Person{
	private double score;
	
	Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		this.score = score;
	}
	
	private void showStudentInfo() {
		super.getShow();
		System.out.println("Score: " + this.score);
	}
	void getShow(){
		showStudentInfo();
	}
	

}
