import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number: ");
		int num=sc.nextInt();
		boolean flag=true;
		if(num==1){
			
			flag=false;
		}
		else{
			for(int i=2;i<num;i++){
				
				if(num%i==0){
					
					flag=false;
					break;
				}
			}
		}
		 if(flag){
			 
			 System.out.println("Its Prime");
		 }
		 else{
			 
			 System.out.println("It isn't Prime ");
		 }
		 sc.close();

	}

}
