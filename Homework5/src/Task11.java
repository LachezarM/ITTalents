/*Задача 11:
Да се създаде метод, който отпечатва масив в конзолата.
*/
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input array length:");
		int len = sc.nextInt();
		int[] array = new int[len];
		for(int i = 0;i < array.length;i++){
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		print(array);
		sc.close();

	}
	static void print(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print("[" + arr[i] + "]");
		}
	}

}
