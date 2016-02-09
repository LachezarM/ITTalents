/*Задача 2:
Въведете 2 различни целочислени числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
*/
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Vuvedete 2 celi chisla ");
		a=sc.nextInt();
		b=sc.nextInt();
		int sum,diff,mod,dev;
		sum=a+b;
		diff=a-b;
		mod=a%b;
		dev=a/b;
		System.out.println("Suma: " + sum + " \n Razlika : " + diff + "\n Delenie s ostatuk " + mod + "\n Celochisleno delenie " + dev);
		sc.close();

	}

}

