/*
 * ������ 5:
�������� ��������, ����� ������� ����� � 10 �������� �
������������ ����� �� ���������� ��� ��������, ����� �� ������� ��
��������, ������� �� 3.
�� �� ������� ���������� �� ������.

 */
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=i*3;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array[" + i + "] = " + array[i]);
		}
	}

}
