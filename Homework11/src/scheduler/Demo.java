package scheduler;

public class Demo {
	public static void main(String[] args) {
		Scheduler sc = new Scheduler();
		Task task2 = new Task() {
			@Override
			public void doWork() throws InterruptedException {
				System.out.println("Working ot task2");
				Thread.sleep(1000);
				System.out.println("working...");
				Thread.sleep(2000);
				System.out.println("Finished task2");
				System.out.println();
				
			}
		};
		
		 class Task4 implements Task{

			@Override
			public void doWork() throws InterruptedException {
				System.out.println("Working on task4");
				Thread.sleep(1000);
				System.out.println("working...");
				Thread.sleep(2000);
				System.out.println("Finished task4");
				
				
			}
			
		}
		

		Task task4 = new Task4();
		
		
		 sc.push(()->{
			System.out.println("Working on task1");
			Thread.sleep(1000);
			System.out.println("working...");
			Thread.sleep(2000);
			System.out.println("Finished task1");
			System.out.println();
		});
		
		sc.push(task2);
		
		sc.push(new Task() {
			
			@Override
			public void doWork() throws InterruptedException {
				System.out.println("Working on task3");
				Thread.sleep(1000);
				System.out.println("working...");
				Thread.sleep(2000);
				System.out.println("Finished task3");
				System.out.println();
			}
		});
		
		sc.push(task4);
		try {
			sc.main();
		} catch (InterruptedException e) {
			Thread.interrupted();
			e.printStackTrace();
		}
		
		
			
		
	}
}
