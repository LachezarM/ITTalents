/*������ 16:
�������� � ���������� ���������� ����� �� ���� abc.
������ �� �� ������� ����:
��� a = b = c - �����: ������� �� �����;
��� a>b>c - �����: ������� �� ��� �������� ���;
��� a<b<c ������� �� � �������� ���;
� �����: ������� �� ����������, �� ����������� ������.
�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
������� �� ������� � �������.
������: 345
�����: �������� ���.*/

import java.util.Scanner;

public class Task16 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Input 3 digit number");
		num=sc.nextInt();
		if(num%111==0){
			System.out.println("Digits are equal");
		}
		else if((num%10 > (num/10)%10) && ((num/10)%10 > num/100)){
			
			System.out.println("Digits are in ascending order");//��� a<b<c ������� �� � �������� ���;
		}
		else if((num%10 < (num/10)%10) && ((num/10)%10 < num/100)){
			System.out.println("Digits are in descending order"); //��� a>b>c - �����: ������� �� ��� �������� ���;
		}
		else{
			System.out.println("Digits are in no order Or Invalid Number");
		}
		sc.close();
	}

}
