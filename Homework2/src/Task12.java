/*������ 12: �� �� ������� ��������, ����� ������� ������
���������� ���������� �����, ����� ����� ������� ����� �.�.
100,101, 606 � �.�. �� �� ��������.*/

public class Task12 {

	public static void main(String[] args) {

		boolean firstEQsecond, firstEQthird, secondEQthird;
		for (int i = 100; i <= 999; i++) {

			firstEQsecond = (i / 100 == (i / 10) % 10);
			firstEQthird = (i / 100 == i % 10);
			secondEQthird = (i % 10 == (i / 10) % 10);
			if (!(firstEQsecond || firstEQthird || secondEQthird)) {

				System.out.println(i);
			}

		}
		
	}

}
