import java.util.Scanner;

/*
 * Задача 7:
Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
 */
public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the array length: ");
		int len = sc.nextInt();
		int[] array1 = new int[len];
		int[] array2 = new int[len];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array 1 [" + i + "] ");
			array1[i] = sc.nextInt();
		}
		array2[0] = array1[0];
		array2[len-1] = array1[len-1];
		for (int i = 1; i < array2.length - 1; i++) {
			array2[i] = array1[i-1] + array1[i+1];
		}
		System.out.println("Array2 : ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print("  [" + i + "] = " + array2[i]);
		}
		sc.close();
	}

}
