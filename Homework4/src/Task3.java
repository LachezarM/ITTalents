import java.util.Scanner;

/*
 * ������ 3:
����� �������� ����� �� �����, ����� ��������� �� ��������
�������������. �� �� ��������� ������ �� ���������� �� ������,
����� � ������������������� �� ���� �����.

 */
public class Task3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int counter = 0;
		System.out.println("Input length: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] array = new int[x][y];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "]");
				array[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < array.length;i++){
			
			for(int j = 0;j < array[i].length;j++){
				
				sum+=array[i][j];
				counter++;
			}
		}
		System.out.println("Sum is: " + sum + "\n Average is: " + sum/counter);
		sc.close();

	}

}
