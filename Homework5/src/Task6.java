import java.util.Scanner;

/*
 * ������ 6:
�� �� ������� ��������, ���� ����� �� ������� ��������� � �������
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������

 */
public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Sentence: ");
		String text = sc.nextLine();
		System.out.print(text.toUpperCase().charAt(0));
		for(int i = 1; i <text.length();i++){
			if(text.charAt(i-1) == ' '){
				System.out.print(text.toUpperCase().charAt(i));
			}
			else{
				System.out.print(text.toLowerCase().charAt(i));
			}
		}
		sc.close();

	}

}
