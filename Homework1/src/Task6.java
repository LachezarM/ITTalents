/*������ 6:
�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
�3 �� ��� ������� �������� �� �1.*/

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a1,a2,a3,tmp;
		System.out.print("���� �������� 3 ����� \n a1: ");
		a1 = sc.nextInt();
		System.out.print(" a2: ");
		a2 = sc.nextInt();
		System.out.print(" a3: ");
		a3 = sc.nextInt();
		tmp=a1;
		a1=a2;
		a2=a3;
		a3=tmp;
		System.out.print("After the swap \n a1 :" + a1 +" \n a2 : " + a2 + "\n a3 : " + a3);
		sc.close();
	}

}
