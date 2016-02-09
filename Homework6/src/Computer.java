
public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook = false;
		operationSystem = "Win Xp";
	}
	Computer(int year,double price,double hardDiskMemory,double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory =  freeMemory;
	}
	Computer(int year,double price,boolean isNotebook,double hardDiskMemory,double freeMemory,
			String operationSystem){
		this(year,price,hardDiskMemory,freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	int comparePrice(Computer c){
		if(this.price > c.price){
			return -1;
		}	else if (this.price < c.price){
			return 1;
		}	else {
			return 0;
		}
	}
	void changeOpearitonSystem(String newOperationSystem){
		this.operationSystem = newOperationSystem;
	}
	void useMemory(int memory){
		if(memory > this.freeMemory){
			System.out.println("Not enought free memory");
		}	else{
			this.freeMemory -= memory;
		}
	}
	
	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		Computer comp2 = new Computer(1999,499,128,128);
		Computer comp3 = new Computer(2010,689,false,1024,500,"Windows 8.1");
		comp1.price = 535;
		if(comp1.comparePrice(comp2) == -1){
			System.out.println("Computer 1 is more expensive than Computer 2");
		}	else if(comp1.comparePrice(comp2) == 1) {
			System.out.println("Computer 1 is cheaper than Computer 2");
		}	else {
			System.out.println("Both computers have the same price ");
		}
		if(comp2.comparePrice(comp3) == -1){
			System.out.println("Computer 2 is more expensive than Computer 3");
		}	else if(comp2.comparePrice(comp3) == 1) {
			System.out.println("Computer 2 is cheaper than Computer 3");
		}	else {
			System.out.println("Both computers have the same price ");
		}
		
		
	}

}
