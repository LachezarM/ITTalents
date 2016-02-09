package scheduler;

import java.util.ArrayDeque;
import java.util.Queue;

public class Scheduler {
	
		private Queue<Task> schedulerQueue;
		
		public Scheduler() {
			schedulerQueue = new ArrayDeque<>();
			}
		
		public void push(Task t) {
			if (schedulerQueue.contains(t)) {
			return;
			}
			schedulerQueue.offer(t);
		}
			
		
		public void main() throws InterruptedException {
			for(Task t : schedulerQueue) {
				if(t != null) {
					t.doWork();
				}
			}
		}
}
