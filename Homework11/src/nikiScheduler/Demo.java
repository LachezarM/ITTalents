package nikiScheduler;

public class Demo {

	public static void main(String[] args) throws InterruptedException{
		Thread m = Thread.currentThread();
		Scheduler one = new Scheduler();
		 one.push(() -> {
			 System.out.println("Start working on task one.");
				m.sleep(1500);
	
			 System.out.println("Work, work.....");
			 	m.sleep(1500);
			 System.out.println("Finished task one! ");
			 	m.sleep(1500);
			 System.out.println();
		 });
		 
		 one.push(new Task() {
			
			@Override
			public void doWork() throws InterruptedException {
				System.out.println("Start working on task two.");
				m.sleep(2500);
				 System.out.println("Work, work.....");
				 m.sleep(2500); 
				 System.out.println("Work, work.....");
				 m.sleep(2500); 
				 System.out.println("Finished task two! ");
				 m.sleep(2500); 
				 System.out.println();
			}
		});
		
		 one.push(() -> {
			 System.out.println("Start working on task tree.");
			 
			 System.out.println("Work, work.....");
			 
			 System.out.println("Finished task tree! ");
			 
			 System.out.println();
		 });
		 
		 one.push(new Task() {
			
			@Override
			public void doWork() throws InterruptedException {
				System.out.println("Start working on task four.");
				m.sleep(1000);
				 System.out.println("Work, work.....");
				 m.sleep(1000);
				 System.out.println("Work, work.....");
				 m.sleep(1000);
				 System.out.println("Finished task four! ");
				 
				 System.out.println();
			}
		});
		
		 
			 
		 
		 one.main();
	}

}
