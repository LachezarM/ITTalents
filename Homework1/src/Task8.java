
/*Задача 8:
Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
Пример: 3332 Изход: по-малко (32<33)
Пример: 1144 Изход: равни (14=14)
Пример: 9875 Изход: по-голямо (95>87)
*/

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, firstNum, secondNum;
		System.out.println("Input 4 digits number : ");
		a = sc.nextInt();
		if (a / 1000 == 0 || a / 10000 >= 1) {
			System.out.println("Wrong Number!!!");
		} else {

			firstNum = (a / 1000) * 10 + (a % 10);
			secondNum = ((a % 1000) / 100) * 10 + ((a % 100) / 10);
			// System.out.println(firstNum + " " + secondNum);
			System.out.print("The first number is : ");
			if (firstNum < secondNum) {
				System.out.println("smaller than the second one");
			} else if (firstNum == secondNum) {
				System.out.println("equal to the second one ");
			} else {
				System.out.println(" Bigger than the second one ");
			}
		}
		sc.close();
	}

}
