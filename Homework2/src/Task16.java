
/*
 * ������ 16:
�� �� ������� ��������, ���� ����� �� �������� 2 ����������
����� N, M �� ��������� [10..5555].
����������, ���� ����� for, �� ������� ������ ����� ��
���������, ����� �� ������ �� 50 � �������� ���.
������: 25,249
�����: 200,150,100, 50.

 */
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 numbers N: ");
		int N = sc.nextInt();
		System.out.println("M: ");
		int M = sc.nextInt();
		if(N > M){
			
			int tmp=N;
			N=M;
			M=tmp;
		}
		for(int i=M;i>=N;i--){
			
			if(i % 50 == 0){
				
				System.out.println(i);
			}
		}
		sc.close();
	}

}
