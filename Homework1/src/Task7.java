/*������ 7:
�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
���� (����� � ������� �������), ���� ��� ����� � ����� ���.
��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
������� �����:
 - ��� ��� �����, ���� �� �������
 - ��� ���� ����, �� �� ���� ���������
 - ��� ����� � �� ���� ����� � �� ��� ���
 - ��� ��� �����, �� ����� �� ���� � ��������
 - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
���������� ������� �������� ���� ��������� � ���������.*/

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		int currTime;
		double amountOfMoney;
		boolean amIHealthy;
		System.out.println("What time it is");
		currTime=sc.nextInt();
		System.out.println("How much money I have : ");
		amountOfMoney=sc.nextDouble();
		System.out.println("Im Healthy  ? (true  or false answer) :");
		amIHealthy=sc.nextBoolean();
		if (!(amIHealthy)){
			System.out.println("No going out");
			if(amountOfMoney>0){
				System.out.println("I'll buy medicine");
			}
			else{
				System.out.println("I'll stay home and drink tea");
			}
		}
		else{
			if(amountOfMoney<10){
				System.out.println("I'll go at a cafe");
			}
			else{
				System.out.println("I'll go to a cinema");
			}
		}
		
		
		sc.close();
	}

}
