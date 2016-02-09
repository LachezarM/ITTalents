import java.util.Scanner;

/*
 * Задача 5:
Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход:
най-голяма сума по редове 58
най-голяма сума по колони 40
Максималната сума по редове е > от максималната сума по колони
 */
public class Task5 {

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
		int currMaxRow = 0;
		int currMaxCol = 0;
		int maxbyRow;
		int maxbyCol = 0;
		for (int i = 0; i < array.length; i++) {

			maxbyRow = 0;
			maxbyCol = 0;
			for (int j = 0; j < array[i].length; j++) {// използвам 2 вградени
														// for-a с различни
														// коефициенти
				// за да обходя масива само 1 път,като съответно намирам макса
				// по колони и редове.

				maxbyRow += array[i][j];
			}
			if (maxbyRow > currMaxRow) {

				currMaxRow = maxbyRow;
			}
			for (int k = 0; k < array.length; k++) {

				maxbyCol += array[k][i];
			}
			if (maxbyCol > currMaxCol) {

				currMaxCol = maxbyCol;
			}
		}
		System.out.println("maximum sum by rows is: " + currMaxRow);
		System.out.println("maximum sum by cols is: " + currMaxCol);
		System.out.print("maxbyRow is ");
		if (currMaxRow > currMaxCol) {

			System.out.print("> ");
		} else if (currMaxRow < currMaxCol) {

			System.out.print("< ");
		} else {

			System.out.print("= ");
		}
		System.out.println("maxbyCol");
		sc.close();
	}

}
