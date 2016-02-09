import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[7];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextInt();
		}
		int tmp = array1[0];
		array1[0] = array1[1];
		array1[1] = tmp;
		
		array1[2]+=array1[3];
		array1[3] = array1[2] - array1[3];
		array1[2] = array1[2] - array1[3];
		
		array1[4]*=array1[5];
		array1[5] = array1[4] / array1[5];
		array1[4] = array1[4] / array1[5];
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(" Array[" + i + "]= " + array1[i]);
		}
		sc.close();
	}


}
