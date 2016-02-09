/*
 * ������ 24:
���� ����� X � ���������, a�� �� ���� ������� ������ ����� �
����� ������.
�� �� ������� ��������, ����� ��������� ���� �������� ����� �
���������.
������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
������: 17571
�����: ������� � ���������
����������� ����� do-while.

 */
import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num=sc.nextInt();
		int saveNum=num;
		int newNum=0;
		do{
			
			newNum=newNum*10 + (num % 10);
			num/=10;
		}while(num!=0);
		if(newNum==saveNum){
			
			System.out.println("Palindrom");
		}
		else{
			
			System.out.println("Ne e palindrom");
		}
		sc.close();
	}

}
