package work;

public class Person {
	protected String name;
	protected int age;
	protected boolean isMale;
	Person(String name,int age,boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	private void showPersonInfo(){
		System.out.println("Name: " + this.name + "\n age: " + this.age);
		if(this.isMale){
			System.out.println("Sex: Male");
		}	else {
			System.out.println("Sex: Female");
		}
	}
	void getShow(){
		showPersonInfo();
	}
}
