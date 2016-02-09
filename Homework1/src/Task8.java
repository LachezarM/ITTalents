
/*������ 8:
�� �� ������� ��������, ����� ���� �� ��������� 4-������o
���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
������: 3332 �����: ��-����� (32<33)
������: 1144 �����: ����� (14=14)
������: 9875 �����: ��-������ (95>87)
*/

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, firstNum, secondNum;
		System.out.println("Input 4 digits number : ");
		a = sc.nextInt();
		if (a / 1000 == 0 || a / 10000 >= 1) {
			System.out.println("Wrong Number!!!");
		} else {

			firstNum = (a / 1000) * 10 + (a % 10);
			secondNum = ((a % 1000) / 100) * 10 + ((a % 100) / 10);
			// System.out.println(firstNum + " " + secondNum);
			System.out.print("The first number is : ");
			if (firstNum < secondNum) {
				System.out.println("smaller than the second one");
			} else if (firstNum == secondNum) {
				System.out.println("equal to the second one ");
			} else {
				System.out.println(" Bigger than the second one ");
			}
		}
		sc.close();
	}

}
