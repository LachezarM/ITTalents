/*
 * ������ 10:
�� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
��������� �����.
���������� �� ������ �������, ����� � ���-������ �� ��������
�������� �� ���������� �����.
������: 1,2,3,4,5,6,7
�����: ������ �������� 4, ���-������ �������� 4

 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input Array[" + i + "]");
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		double avrg = sum/7;
		double distToAvrg = array[0] - avrg;
		int indexOfClosest = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] - avrg < distToAvrg){
				distToAvrg = avrg- array[i];
				indexOfClosest = i;
			}
		}
		System.out.println("LessDiference" + distToAvrg + "   index  "  + indexOfClosest + "Average" + avrg);

	}

}
