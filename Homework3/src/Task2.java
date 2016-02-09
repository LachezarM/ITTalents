import java.util.Scanner;

/*
 * Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.

 */
public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("input array[" + i + "]: ");
			array[i] = sc.nextInt();

		}
		int[] array2 = new int[2 * array.length];
		for(int i = 0;i < array2.length/2;i++){
			array2[i]=array[i];
			array2[array2.length - (1+i)]=array[i];	
		} 
		for(int i = 0;i < array2.length;i++){
			
			System.out.print(array2[i] + " ");
		}
		sc.close();
		
	}

}
