import java.util.Scanner;

/*
 * ������ 2:
���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
�������� �� ����� ���� �� �����������, � ������� �� �� ����
��������, �� � ������� ���. ��������, �� �� ������ ����� �����
�� ������.

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
