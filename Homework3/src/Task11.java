import java.util.Scanner;

/*
 * ������ 11:
�� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
� ��������� �����
���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
������: -23, -55, 17, 75, 56, 105, 134
�����: 75,105 - 2 �����
 */
public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[7];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] % 5 == 0 && array1[i] > 5){
				System.out.println(array1[i] + " ");
			}
			else{
				continue;
			}
		}
		sc.close();

	}

}
