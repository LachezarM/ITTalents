/*
  Задача 9:
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.

 */
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Input Array length: ");
		int len = sc.nextInt();
		int[] array1 = new int[len];
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Input Array[" + i + "]: ");
			array1[i] = sc.nextInt();
		}
		for(int i = 0;i < array1.length/2;i++){//Using Temporary Variable
			int tmp = array1[i];
			array1[i] = array1[array1.length-(i+1)];
			array1[array1.length-(i+1)] = tmp;
		}
		for (int i = array1.length-1; i > -1; i--) {
			System.out.println("Array[" + (array2.length-(i+1)) + "] = " + array1[i]);
		}

		/*for (int i = 0; i < array1.length; i++) { //USING 2ND ARRAY
			array2[i] = array1[array2.length-(i+1)];
		}
		for (int i = array2.length - 1; i > -1; i--) {
			System.out.println("Array[" + (array2.length-(i+1)) + "] = " + array2[i]);
		}*/
		sc.close();
		
	}

}
