/*
 * ������ 20:
�� �� ������� ��������, ���� ����� �� ������� ������� ��
�����. ������ �� ���������� �� ���������� ��� ��� ����� ��
����� �� 45.
������:
1 2 3 4 5 6 7 8 9 0
2 3 4 5 6 7 8 9 0 1
3 4 5 6 7 8 9 0 1 2
4 5 6 7 8 9 0 1 2 3
5 6 7 8 9 0 1 2 3 4
6 7 8 9 0 1 2 3 4 5
7 8 9 0 1 2 3 4 5 6
8 9 0 1 2 3 4 5 6 7
9 0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9

 */
public class Task20 {

	public static void main(String[] args) {
		
		for(int i=0;i<=9;i++){
			
			for(int j=1;j<=10;j++){
				
				if(j+i>9){
					
					System.out.print(j+i-10);
				}
				else{
					
					System.out.print(j+i);
				}
			}
			System.out.println();
		}

	}
}
