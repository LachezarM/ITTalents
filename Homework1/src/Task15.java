/*������ 15:
�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
[0..24].
���������� �� ������ ������������� ��������� ��������� ���������
���.
��������� ��:
[18..4] - ����� �����;
[4..9] - ����� ����;
[9..18] - ����� ���
������: 10
�����: ����� ���
*/
import java.util.Scanner;

public class Task15 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int currTime;
		System.out.println("Input round off time");
		currTime=sc.nextInt();
		if((currTime>=18 && currTime<=24) || (currTime<=4 && currTime>=0)){
			System.out.println("Good Evening");
		}
		else if(currTime>4 && currTime<=9){
			System.out.println("Good Morning");
		}
		else{
			System.out.println("Good Day");
		}
		sc.close();
	}

}
