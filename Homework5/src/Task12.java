/*
 * ������ 12:
�� �� ������� �����, ����� ������ �� ������ ����� ����� N �
����� ����� �� ����� � ������� N, ����� ������� ������ �����
�� 1 �� N.

 */
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt();
		print((constructArray(n)));
		sc.close();
	}
	static int[] constructArray(int length){
		int[] array = new int[length];
		for(int i = 0;i < length;i++){
			array[i] = i+1;
		}
		return array;
	}
	static void print(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print("[" + arr[i] + "]");
		}
	}
	

}
