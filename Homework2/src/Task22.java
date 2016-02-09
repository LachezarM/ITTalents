/*
 * Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.

 */
import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num=sc.nextInt();
		int counter=0;
		while(counter<10){
			
			if((num+1) % 2 == 0 || (num+1) % 3 == 0 || (num+1) % 5 == 0){
				
				System.out.print(counter+1 + ":" + (num+1) + ";  ");
				counter++;
			}
			num++;
			
		}
		sc.close();

	}

}
