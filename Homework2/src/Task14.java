/*
 Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.

 */
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Input number: ");
		int N = sc.nextInt();
		for(int i = N-1;i >= 7;i--){
			
			if(i % 7 == 0){
				
				System.out.println(i);
			}
		}
		sc.close();
	}

}
