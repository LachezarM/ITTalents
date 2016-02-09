import java.util.Scanner;

/*
 * Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string with words,numbers and '-' : ");
		String text = sc.nextLine();
		int power = 1;
		int sum = 0;
		int sumAll = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				int numCounter = i;
				do {                                
					if (text.charAt(numCounter + 1) >= '0' && text.charAt(numCounter + 1) <= '9') {
						numCounter++;

					} else {
						break;
					}
				} while (numCounter != text.length() - 1);
				for (int k = numCounter; k >= i; k--) {
					int curr = text.charAt(k) - 48;//converting the 'char' numbers into numbers;
					sum += curr * power;
					power *= 10;
				}
				if(i != 0 && text.charAt(i-1) == '-'){//check for negative number (first we have 
					sum *= -1;						  //'i != 0' in the if statement so we don't
					                                  //try to reach '-1' index
				}
				System.out.println(sum);
				sumAll += sum;
				sum = 0;
				power = 1;
				i = numCounter;                     
			}
		}
		System.out.println("The sum of all numbers is: " + sumAll);
		sc.close();
	}

}
