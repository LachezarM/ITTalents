/*Задача 16:
Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
Пример: 345
Изход: възходящ ред.*/

import java.util.Scanner;

public class Task16 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Input 3 digit number");
		num=sc.nextInt();
		if(num%111==0){
			System.out.println("Digits are equal");
		}
		else if((num%10 > (num/10)%10) && ((num/10)%10 > num/100)){
			
			System.out.println("Digits are in ascending order");//ако a<b<c цифрите са в низходящ ред;
		}
		else if((num%10 < (num/10)%10) && ((num/10)%10 < num/100)){
			System.out.println("Digits are in descending order"); //ако a>b>c - Изход: цифрите са във възходящ ред;
		}
		else{
			System.out.println("Digits are in no order Or Invalid Number");
		}
		sc.close();
	}

}
