/*����� 13:
�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
���������� ����������� t � ������ ������.
�������������� ��������� ��:
��� -20 ������ �������;
����� 0 � -20 - �������;
����� 15 � 0 - ������;
����� 25 � 15 - �����;
��� 25 � ������.
������ �����: ���� ����� �� ��������� [-100..100].
������: 12
�����: ������*/
import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the temperature");
		int a=sc.nextInt();
		if(a<-100 || a>100){
			System.out.println("Not valid");
		}
		else{
			if(a<-20){
				System.out.println("������ �������");
			}
			else if(a<0 && a>=-20){
				System.out.println("�������");
			}
			else if(a>=0 && a<15){
				System.out.println("������");
			}
			else if(a>=15 && a<25){
				System.out.println("�����");
			}
			else{
				System.out.println("������");
			}
		}
		sc.close();
	}

}
