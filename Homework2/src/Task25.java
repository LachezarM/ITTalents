import java.util.Scanner;

public class Task25
{
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number");
		int num=sc.nextInt();
		int fact=1;
		do{
			
			fact*=num;
			num--;
		}while(num>1);
		System.out.println("Factoriel is: " + fact);
		
	}
}
