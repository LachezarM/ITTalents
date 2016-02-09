/*Задача 9:
Да се състави програма, която чете от конзолата 2 естествени
двуцифрени числа a,b.
Програмата да изведе в конзолата дали последната цифра от
произведението на двете числа е четна, както и самата цифра.
Входни данни: a,b - естествени числа от интервала [10..99].
Пример: 15, 25
Изход: 375, 5 нечетна
*/

import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Input 2 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print(a*b + ", " + (a%10)*(b%10)%10);
		if(a*b%2==0){
			System.out.println(" even");
		}
		else {
			System.out.println(" odd");
		}
		sc.close();
	}

}