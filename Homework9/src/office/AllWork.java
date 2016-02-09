package office;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork(){
		tasks = new Task[10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}
	void addTask(Task task){
		if(freePlacesForTasks == 0) {
			System.out.println("No free places for tasks");
		} else {
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
		}
	}
	Task getNextTask(){
		currentUnassignedTask--;
		return tasks[currentUnassignedTask];
		
	}
	boolean isAllWorkDone(){
		for(int i = 0; i < tasks.length; i++) {
			if(tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}
	
}
