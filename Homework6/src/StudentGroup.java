
public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	StudentGroup(){
		students = new Student[5];
		freePlaces = 5;
	}
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	void addStudent(Student s){
		for(int i = 0;i < freePlaces;i++){
			if(students[i] != null){
				if(students[i].name.equalsIgnoreCase(s.name)){
					System.out.println("Student already in this group");
					return;
				}
			}
		}
		if(s.subject.equalsIgnoreCase(this.groupSubject) && this.freePlaces > 0){
			students[students.length - freePlaces] = s;
			freePlaces--;
		}	else {
			System.out.println("Student different subject or no places");
		}
	}
	void emptyGroup(){
		students = null;
		freePlaces = 5;
	}
	String theBestStudent(){
		double maxGrade = 0;
		int currInd = 0;
		if(students[0] != null){
			maxGrade = students[0].grade;
			currInd = 0;
		}	else {
			System.out.println("Sorry no students in group");
			return null;
		}
		for(int i = 1;i < students.length;i++){
			if(students[i] != null){
				if(students[i].grade > maxGrade){
					maxGrade = students[i].grade;
					currInd = i;
				}
			}
		}
		return students[currInd].name;
	}
	void printStudentsInGroup(){
		if(students[0] == null){
			System.out.println("Sorry no students in group");
		}
		for(int i = 0;i < students.length;i++){
			if(students[i] != null){
				System.out.println("Name: " + students[i].name + "\n Grade: " + students[i].grade
						+ "\n Subject: " + students[i].subject + "\n Year in college " + students[i].yearInCollege
						+ "\n Age: " + students[i].age + "\n Money: " + students[i].money);
				if(students[i].isDegree){
					System.out.println("Student has graduated");
				}	else {
					System.out.println("Student hasnt graduated");
				}
			}
		}
	}
	
}
