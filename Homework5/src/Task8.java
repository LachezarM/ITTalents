/*
 * ������ 8:
�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������,
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: �����
�����: ��.
����: ��������
�����: ��.
 */
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		System.out.println("Input string: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		boolean isPalindrom = true;
		for(int i = 0;i < text.length();i++){
			if(text.charAt(i) != text.charAt(text.length()-(i+1))){
				isPalindrom = false;
				break;
			}
		}
		System.out.println("The string is Palindrom " + isPalindrom);
		sc.close();
	}

}
