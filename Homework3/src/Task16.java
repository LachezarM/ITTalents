import java.util.Scanner;

/*
 * ������ 16:
�� �� ������� ��������, ���� ����� ������������� �������� 10
������ ����� �� ��������� �� ���������� �� ������� �����:
1. ������� �������������� �����.
2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ��� 
������ �� �������� �� �������� �� ����� + ������� 41.25, � ������
�������� �������� �� ������� � �������������� ����� ����� �������
� �������� ������� �����. ��������� ����� �� ������� ������� � 1.
3. �� �� ������� ���������� �� �������� � ��������������� �����.
������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
�����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

 */
public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] array2 = new double[10];
		double[] array1 = new double[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array[" + i + "]");
			array1[i] = sc.nextDouble();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("  Array[" + i + "]=" + array1[i]);
		}
		System.out.println("Second array: ");
		for (int i = 0; i < array2.length; i++) {
			if(array1[i] < -0.231){
				array2[i] = (i+1)*(i+1) + 41.25;
			}
			else{
				array2[i] = (i+1) * array1[i];
			}
			System.out.println("  Array[" + i + "]= " + array2[i]);
		}
		sc.close();
	}

}
