import java.util.Scanner;

/*
 * Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
 */
public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		boolean isSim = true;
		for (int i = 0; i < array.length; i++) {
			System.out.println("input array[" + i + "]: ");
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < array.length/2; i++) {
			
			if(array[i] != array[array.length - (i+1)]){
				isSim = false;
				break;
			}
		}
		System.out.println("The array is simetric  -  " + isSim);
		sc.close();
	}

}
