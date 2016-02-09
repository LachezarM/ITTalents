
/*
 * ������ 21:
������ � �������� ����� �����.
��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
���, ���.
��������� �� ���� �� ������� �: ������, ����, ����, ����.
�� �� ������� ��������, ���� ����� �� ������� N - ����� ��
��������� [1..51] � �� �������� ��������� ����� ����� �
���������� ��-������ ����� �� �������.
������: 47.
�����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
����

 */
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of the card: ");
		int num = sc.nextInt();
		for (int i = num - 1; i < 52; i++) {

			switch (i / 4) {

			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8: {

				System.out.print(((i / 4) + 2) + " ");
				break;
			}
			case 9: {

				System.out.print(" Jack ");
				break;
			}
			case 10: {

				System.out.print(" Queen ");
				break;
			}
			case 11: {

				System.out.print(" King ");
				break;
			}
			default: {

				System.out.print(" Ace ");
				break;
			}

			}

			switch (i % 4) {

			case 0: {

				if(i==51){
					
				System.out.print("of clubs ");
				}
				else {
					
					System.out.print("of clubs, ");
				}
				break;
			}
			case 1: {

				if(i==51){
					
				System.out.print("of diamonds ");
				}
				else {
					
					System.out.print("of diamonds, ");
				}
				break;
			}
			case 2: {

				if(i==51){
					
				System.out.print("of hearts ");
				}
				else {
					
					System.out.print("of hearts, ");
				}
				break;
			}
			default: {

				if(i==51){
					
				System.out.print("of spades ");
				}
				else {
					
					System.out.print("of spades,  ");
				}
				break;

			}
			
			}
			

		}
		sc.close();
	}

}
