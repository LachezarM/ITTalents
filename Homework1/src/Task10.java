
/*������ 10:
������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
3 ����� � �� �������� ������������.
�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
������. ������ �� ����� �� �� ������� � �������� ���������� ����.
������ �����: ���������� ����� �� ��������� [10..9999].
������: 107
�����: 21 ���� �� 2 �����,
 21 ���� �� 3 �����
 ������������ ���� �� 2 �����
*/
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int litres;
		System.out.println("Input the amount of water that can fill the tank  ");
		litres=sc.nextInt();
		int amountof2litres=litres/5;
		int amountof3litres=litres/5;
		if(litres%5==4){
			amountof2litres+=2;
		}
		else if(litres%5==3){
			amountof3litres++;
		}
		else if(litres%5==2){
			amountof2litres++;
		}
		else if(litres%5==1){
			amountof2litres--;
			amountof3litres++;
		}
		System.out.println(amountof2litres + " ���� ��  2 ����� " + " \n" + amountof3litres + " ���� �� 3 ����� ");
		sc.close();
	}
}