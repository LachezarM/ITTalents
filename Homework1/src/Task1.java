
/*������ 1:
�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
������������ A � B (���� �� �� � ������� ������� � double).
����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.*/
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double A, B, C;
		System.out.print("���� �������� 3 ����� \n A: ");
		A = sc.nextDouble();
		System.out.print(" B: ");
		B = sc.nextDouble();
		System.out.print(" C: ");
		C = sc.nextDouble();
		if (((C > A) && (C < B)) || ((C < A) && (C > B))) {
			System.out.println("������� " + C + " � ����� " + A + " � " + B);
		} else {
			System.out.println("������� " + C + " �� � ����� " + A + " � " + B);
		}
		sc.close();

	}

}
