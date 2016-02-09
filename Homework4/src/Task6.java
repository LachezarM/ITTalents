
/*
 * ������ 6:
����� ������������� �������� ��������� �� ���������� �����.
������� �� �������� � ��������� ������� � ������� 6 ���� � 6
������.
�� �� ������� ��������, ���� ����� �� ������ ������ �� ������
�������� �� �������� � ����� ������: 2,4 � 6.
���������� �� ������� � ������ �� ����� ������� ���.
������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
21,22,23,24,25,26 ���� 141
41,42,43,44,45,46 ���� 261
61,62,63,64,65,66 ���� 381
���� �� ���������� 783
 */
public class Task6 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int currRowSum;
		int sum = 0;
		for(int i = 1 ;i < array.length;i+=2){
			
			currRowSum = 0;
			for(int j = 0;j < array[i].length;j++){
				
				if(j == array[i].length-1){
					System.out.print(array[i][j]);
				}
				else{
					
					System.out.print(array[i][j] + ",");
				}
				currRowSum+=array[i][j];
			}
			System.out.println(" sum " + currRowSum);
			sum += currRowSum;
		}
		System.out.println("Sum of elements: " + sum);

	}

}
