/*
 * ������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
������ ����� �� 1 �� �������� ����� N.
������: 5
�����: 15
����������� ����� do-while.

 */
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Input a num: ");
		int num = sc.nextInt();
		do{
			
			sum+=num;
			num--;
		}while(num > 0);
		System.out.println("The sum of all numbers is: " + sum);
		sc.close();
	}

}
