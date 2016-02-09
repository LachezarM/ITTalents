import java.util.Scanner;

/*
 * Задача 6:
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
 */
public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the array lengths: ");
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();
		int[] array1 = new int[len1];
		int[] array2 = new int[len2];
		boolean areEqual = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array 1 [" + i + "] ");
			array1[i] = sc.nextInt();
		}
		System.out.println("Inputting 2nd array: ...");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Array 2 [" + i + "] ");
			array2[i] = sc.nextInt();
		}
		if(len1 != len2){
			
			System.out.println("Different lengths  => not equal arrays");
		}
		else{
			for(int i = 0;i < array1.length;i++){
				if(array1[i] != array2[i]){
					areEqual = false;
				}
			}
			if(areEqual){
				System.out.println("Equal arrays");
			}
			else{
				System.out.println("Not equal ");
			}
		}
		sc.close();

	}

}
