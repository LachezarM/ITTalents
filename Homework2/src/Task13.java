/*Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
*/

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sum:  ");
		int sum = sc.nextInt();
		int currSum = 0;
		for(int i = 100;i <= 999;i++){
			
			currSum=i/100 + i % 10 + (i/10) % 10;
			if(sum==currSum){
				
				System.out.println(i);
			}
		}
		sc.close();
	}

}
