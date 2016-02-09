import java.util.Scanner;

/*
 * Задача 13:
Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array lengths: ");
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();
		int[] array1 = new int[len1];
		int[] array2 = new int[len2];
		for(int i = 0;i < array1.length;i++){
			System.out.print("array[" + i + "] = ");
			array1[i] = sc.nextInt();
		}
		System.out.println("Input second array: ");
		for(int i = 0;i < array2.length;i++){
			System.out.print("array[" + i + "] = ");
			array2[i] = sc.nextInt();
		}
		print(mergeArrays(array1,array2));
		sc.close();
		

	}
	static int[] mergeArrays(int[] arr1,int[] arr2){
		int[] newArr = new int[arr1.length + arr2.length];
		for(int i = 0;i < newArr.length;i++){
			if(i < arr1.length){
				newArr[i] = arr1[i];
			}
			else{
				newArr[i] = arr2[i - arr1.length];
			}
		}
		return newArr;
	}
	static void print(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print("[" + arr[i] + "]");
		}
	}

}
