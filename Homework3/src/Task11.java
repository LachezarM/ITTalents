import java.util.Scanner;

/*
 * Задача 11:
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
 */
public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[7];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] % 5 == 0 && array1[i] > 5){
				System.out.println(array1[i] + " ");
			}
			else{
				continue;
			}
		}
		sc.close();

	}

}
