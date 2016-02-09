/*
 * ������ 22:
�� �� ������� ��������, ����� ������� ������� 10 ���-�����
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
����������� ����� while.

 */
import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num=sc.nextInt();
		int counter=0;
		while(counter<10){
			
			if((num+1) % 2 == 0 || (num+1) % 3 == 0 || (num+1) % 5 == 0){
				
				System.out.print(counter+1 + ":" + (num+1) + ";  ");
				counter++;
			}
			num++;
			
		}
		sc.close();

	}

}
