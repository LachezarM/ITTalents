import java.util.Scanner;

/*
 * ������ 2:
�� �� ������� ��������, ���� ����� �� ������������ �� ��������
�������������� ��� ���� � ������� 10-20 �����.
���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
��-�������, ����� � ������ �� ����������.
������: uchilishe uchenik
�����: 9 uchenishe

 */
public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do{
			System.out.println("Input two  words: (10 -20) char");
			first = sc.nextLine();
			second = sc.nextLine();
		}while(first.length() + second.length() < 10 || first .length() + second.length() >20 || second.length() < 5 || first.length() < 5);
		String newFirst = second.substring(0, 5) + first.substring(5);
		String newSecond = first.substring(0,5) + second.substring(5);
		if(newFirst.length() < newSecond.length()){
			System.out.println(newSecond.length() + " " + newSecond);
		}
		else{
			System.out.println(newFirst.length() + " " + newFirst);
		}
		sc.close();
		

	}

}
