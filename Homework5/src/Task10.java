import java.util.Scanner;

/*
 * ������ 10:
�� �� ������� ��������, ����� �� ����� ��� ����� ����,
���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
�� ASCII ��������� � ���������� ������� 5 � � �������
������������� ������.
������ :
����: Hello
�����: Mjqqt

 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String text = sc.nextLine();
		for(int i = 0;i < text.length();i++){
			System.out.print((char)(text.charAt(i) + 5));
		}
		sc.close();
	}

}
