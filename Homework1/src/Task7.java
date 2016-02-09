/*Задача 7:
Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
 - ако съм болен, няма да излизам
 - ако имам пари, ще си купя лекарства
 - ако нямам – ще стоя вкъщи и ще пия чай
 - ако съм здрав, ще отида на кино с приятели
 - ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.*/

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		int currTime;
		double amountOfMoney;
		boolean amIHealthy;
		System.out.println("What time it is");
		currTime=sc.nextInt();
		System.out.println("How much money I have : ");
		amountOfMoney=sc.nextDouble();
		System.out.println("Im Healthy  ? (true  or false answer) :");
		amIHealthy=sc.nextBoolean();
		if (!(amIHealthy)){
			System.out.println("No going out");
			if(amountOfMoney>0){
				System.out.println("I'll buy medicine");
			}
			else{
				System.out.println("I'll stay home and drink tea");
			}
		}
		else{
			if(amountOfMoney<10){
				System.out.println("I'll go at a cafe");
			}
			else{
				System.out.println("I'll go to a cinema");
			}
		}
		
		
		sc.close();
	}

}
