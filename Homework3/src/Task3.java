import java.util.Scanner;

/*
 * Задача 3:
Да се въведе число, след което да се създаде масив с 10
елемента по следния начин:
Първите 2 елемента на масива са въведеното число.
Всеки следващ елемент на масива е равен на сбора от
предишните 2 елемента в масива.
След това изведете масива 
 */
public class Task3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt();
		int[] array = new int[10];
		array[0] = n;
		array[1] = n;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array[" + i + "] = " + array[i]);
		}
		sc.close();
	}
}
