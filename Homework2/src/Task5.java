import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете първото число: ");
		int a=sc.nextInt();
		System.out.println("Въведете второто число: ");
		int b=sc.nextInt();
		if(a>b){
			for(int i=b;i<=a;i++){
				System.out.println(i);
			}
		}
		else{
			for(int i=a;i<=b;i++){
				System.out.println(i);
			}
		}
		sc.close();
	}
	
}
