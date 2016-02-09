
public class College {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.name = "Velizar Ivanov Andonov";
		stud1.subject = "Geografiq";
		stud1.age = 21;
		Student stud2 = new Student("Ivan Angelov Hristomirov","Geografiq",23);
		Student stud3 = new Student("Georgi Vasilov Penchev","Matematika",20);
		Student stud4 = new Student("Ivan Georgiev Hristomirov","Geografiq",23);
		Student stud5 = new Student("Ivailo Kamenov Arsov","Geografiq",23);
		Student stud6 = new Student("Kristiqn Dragomirov Dragov","Geografiq",22);
		Student stud7 = new Student("Kamen Hristov Hristov","Geografiq",23);
		stud2.grade = 4.6;
		stud1.recieveScholarship(3, 300);
		stud1.upYear();
		StudentGroup group1 = new StudentGroup("geografiq");
		group1.addStudent(stud1);
		group1.addStudent(stud2);
		group1.addStudent(stud4);
		group1.addStudent(stud5);
		group1.addStudent(stud6);
		group1.addStudent(stud7);
		System.out.println(group1.theBestStudent());
		group1.printStudentsInGroup();


	}

}

