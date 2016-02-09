import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num = sc.nextInt();
		int[] array1 = new int[8];
		int stopIndex = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = num % 2;
			num /= 2;
			if (num == 0) {
				stopIndex = i;
				break;
			}
		}
		for (int i = stopIndex; i > -1; i--) {
			System.out.print(array1[i]);
		}
		sc.close();
	}
}
