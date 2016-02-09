import java.util.Scanner;

/*
 * Задача 7:
Имате предварително въведени стойности от естествени числа,
въведени в квадратна таблица с размери 6 реда и 6 колони.
Да се състави програма , чрез която се намира сумата на всички
елементи, чиято сума на индекси за ред и колона е четно число.
Програмата да извежда формираните суми за всеки отделен ред на
квадратната таблица, както и общата сума от тези елементи.
Да се използва само един цикъл.
Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
Изход:
11, ,13, ,15, , сума от елементите за реда: 39
22, ,24, ,26, сума от елементите за реда: 72
31, ,33, ,35, , сума от елементите за реда: 99
42, ,44, ,46, сума от елементите за реда: 132
51, ,53, ,55, , сума от елементите за реда: 159
62, ,64, ,66 сума от елементите за реда: 192
Сума на елементите: 693


 */
public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] array = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "]");
				array[i][j] = sc.nextInt();
			}
		}
		int currRowSum = 0;
		int rowSum = 0;
		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0){
				currRowSum = array[i][0] + array[i][2] + array[i][4];
				System.out.println(array[i][0] + ", " + array[i][2] + ", " + array[i][4] + "  summ of current row elements: " + currRowSum);
			}
			else{
				currRowSum = array[i][1] + array[i][3] + array[i][5];
				System.out.println(array[i][1] + ", " + array[i][3] + ", " + array[i][5] + "  summ of current row elements: " + currRowSum);
			}
			rowSum+=currRowSum;
			
		}
		System.out.println("Sum of elements: " + rowSum);
		sc.close();
	}

}
