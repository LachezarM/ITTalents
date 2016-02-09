
/*Задача 1:
Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double).
После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.*/
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double A, B, C;
		System.out.print("Моля въведете 3 числа \n A: ");
		A = sc.nextDouble();
		System.out.print(" B: ");
		B = sc.nextDouble();
		System.out.print(" C: ");
		C = sc.nextDouble();
		if (((C > A) && (C < B)) || ((C < A) && (C > B))) {
			System.out.println("Числото " + C + " е между " + A + " и " + B);
		} else {
			System.out.println("Числото " + C + " не е между " + A + " и " + B);
		}
		sc.close();

	}

}
