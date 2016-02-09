package nikiScheduler;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	
	private Queue<Task> tasks;
	
	public Scheduler() {
		this.tasks = new LinkedList<Task>();
	}
	
	protected void push(Task c){
		this.tasks.offer(c);
	}
	
	protected void main() throws InterruptedException{
		System.out.println("Start work on tasks: ");
		for(Iterator it = this.tasks.iterator(); it.hasNext();){
			((Task)it.next()).doWork();
		}
		System.out.println("Finished all task.");
	}
	
}
