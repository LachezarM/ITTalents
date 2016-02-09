/*
 * Задача 10:
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4

 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input Array[" + i + "]");
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		double avrg = sum/7;
		double distToAvrg = array[0] - avrg;
		int indexOfClosest = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] - avrg < distToAvrg){
				distToAvrg = avrg- array[i];
				indexOfClosest = i;
			}
		}
		System.out.println("LessDiference" + distToAvrg + "   index  "  + indexOfClosest + "Average" + avrg);

	}

}
