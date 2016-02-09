/*
 * Задача 15: Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
Използвайте цикъл do-while.

 */
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Input a num: ");
		int num = sc.nextInt();
		do{
			
			sum+=num;
			num--;
		}while(num > 0);
		System.out.println("The sum of all numbers is: " + sum);
		sc.close();
	}

}
