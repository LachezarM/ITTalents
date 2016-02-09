/*Задача 4:
Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.
*/

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Input 2 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b){
			System.out.println("Ascending order : " + b + "  "+ a);
		}
		else{
			System.out.println("Ascending order : " + a + "  " + b);
		}
		sc.close();
	}

}