
/*
 * Задача 16:
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249
Изход: 200,150,100, 50.

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
