/*
 * Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13

 */
import java.util.Scanner;
public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int len1 = sc.nextInt();
		double sum = 0.0;
		double[] array1 = new double[len1];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextDouble();
			sum+=array1[i];
		}
		for (int i = 0; i < array1.length-2; i++) {
			for (int j = i+1; j < array1.length-1; j++) {
				for (int k = j+1; k < array1.length; k++) {
					if(Math.abs(array1[i]) + Math.abs(array1[j]) + Math.abs(array1[k]) == sum){
						System.out.println(array1[i] + " " + array1[j] + " " + array1[k] );
					}
				}
			}
		}
		sc.close();

	}

}
