/*
 * Задача 2:
Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход:
1 9 1 5
3 7 8 2

 */
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int len = sc.nextInt();
		int[][] array = new int [len][len];
		for(int i = 0;i < array.length;i++){
			
			for(int j = 0;j < array[i].length;j++){
				
				System.out.print("array [" + i + "][" + j + "]: ");
				array[i][j] = sc.nextInt();
				
			}
		}
		for(int i=0;i < array.length;i++){
			
			System.out.print(array[i][i] + " ");
		}
		System.out.println();
		for(int i=0;i < array.length;i++){
			
			System.out.print(array[i][array.length-1-i] + " ");
		}
		sc.close();

	}

}
