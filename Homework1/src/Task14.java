/*������ 14:
�� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
�� ���������� ����� ������� ������� ���� �� �������� � ������� ���
�������� ����.
���������� ����� � ���������.
�������� �� ��� ������ ����� �� ��������� [1..8].
������: 2 2 3 2
�����: ��������� �� � �������� ����
*/
import java.util.Scanner;

public class Task14 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2;
		System.out.println("Input the first coordinates");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Input the second coordinates");
		x2=sc.nextInt();
		y2=sc.nextInt();
		if((x1%2==0 && x2%2==0) || (x1%2==1 && x2%2==1)){
			if((y1%2==0 && y2%2==0) || (y1%2==1 && y2%2==1)){
				System.out.println("Both Positions are with same color");
			}
			else{
				System.out.println("Both Positions are with different color ");
			}
		}
		else {//if((x1%2==0 && x2%2==1) || (x1%2==1 && x2%2==0)){
			if((y1%2==0 && y2%2==1) || (y1%2==1 && y2%2==0)){
				System.out.println("Both Positions are with same color");
			}
			else{
				System.out.println("Both Positions are with different color");
			}
		}
		sc.close();
	}

}
