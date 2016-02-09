
/*
 * ������ 19: �� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1.
������: 11
�����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

 */
import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num=sc.nextInt();
		while(num > 1){
			if((num - 1) % 2 == 1){
				
				num*=0.5;
			}
			else{
				
				num=num*3+1;
			}
			System.out.println(num + " ");
		}
		sc.close();

	}

}
