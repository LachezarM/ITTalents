import java.util.Scanner;

/*
 * Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.

10, 3, 5, 8, 6, -3, 7
Най-малкото число кратно на 3 е -3
 */
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] array2 = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("input array[" + i + "]: ");
			array[i] = sc.nextInt();

		}
		int counter = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				array2[counter++] = array[i];
			}
		}
		sc.close();
		int min = array2[0];
		
		for (int i = 0; i < array2.length; i++) {
			if(min > array[i]){
				min = array[i];
			}
		}
		System.out.println("The least devidabe by 3: " + min);
		

	}

}
