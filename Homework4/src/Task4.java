import java.util.Scanner;

/*
 * \Задача 4:
Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4

 */
public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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
			
			for(int j = array.length-1;j >= 0;j--){
				
				if(j == 0){
					
					System.out.print(array[j][i]);
				}
				else{
					
					System.out.print(array[j][i] + ",");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}


