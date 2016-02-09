/*Задача 3:
Въведете 2 различни числа от конзолата и разменете стойността им.
Разпечатайте новите стойности
*/
import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Input 2 numbers  \n A:");
		int a,b,tmp;
		a=sc.nextInt();
		System.out.print(" B:");
		b=sc.nextInt();
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("After the swap their values are A: " + a + " B: " + b);
		sc.close();
		
	}

}
