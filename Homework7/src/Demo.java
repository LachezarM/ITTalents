
public class Demo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ivan");
		employee1.setHoursLeft(4);
		Task task1 = new Task("Clean toilet",12);
		employee1.work();
		employee1.setCurrentTask(task1);
		employee1.work();
		
	}

}
