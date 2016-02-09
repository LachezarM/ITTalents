import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int len1 = sc.nextInt();
		int[] array1 = new int[len1];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextInt();
		}
		if (array1.length % 2 == 1) {

			for (int i = 1; i < array1.length - 1; i += 2) {
				if (array1[i] <= array1[i - 1] || array1[i] <= array1[i + 1]) {
					flag = false;
					break;
				}
			}
		} else {
			for (int i = 1; i < array1.length; i += 2) {
				if (i == array1.length - 1) {
					if (array1[i] <= array1[i - 1]) {
						flag = false;
						break;
					} else {
						continue;
					}
				} else if (array1[i] <= array1[i - 1] || array1[i] <= array1[i + 1]) {
					flag = false;
					break;
				}
			}

		}

		System.out.println("Masivat e zigzagoobrazen nagore   " + flag);
		sc.close();

	}

}
