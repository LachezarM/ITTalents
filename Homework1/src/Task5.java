/*Задача 5:
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
ред.
*/
import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Input 2 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b){
			System.out.println("Descending order : " + b + "  "+ a);
		}
		else{
			System.out.println("Descending order : " + a + "  " + b);
		}
		sc.close();
	}

}