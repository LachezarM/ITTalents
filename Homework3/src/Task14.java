import java.util.Scanner;

/*
 * Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2


 */
public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length: ");
		int len = sc.nextInt();
		double[] array1 = new double[len];
		double[] array2 = new double[len];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextDouble();
		}
		int counter = 0;
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] >= -2.99 && array1[i] <= 2.99){
				array2[counter] = array1[i];
				counter++;
			}
		}
		for (int i = 0; i < counter;i++) {
			System.out.println("  Array[" + i + "]= " + array2[i]);
			
		}
		sc.close();
	}

}
