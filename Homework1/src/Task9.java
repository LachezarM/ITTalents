/*������ 9:
�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
���������� ����� a,b.
���������� �� ������ � ��������� ���� ���������� ����� ��
�������������� �� ����� ����� � �����, ����� � ������ �����.
������ �����: a,b - ���������� ����� �� ��������� [10..99].
������: 15, 25
�����: 375, 5 �������
*/

import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Input 2 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print(a*b + ", " + (a%10)*(b%10)%10);
		if(a*b%2==0){
			System.out.println(" even");
		}
		else {
			System.out.println(" odd");
		}
		sc.close();
	}

}