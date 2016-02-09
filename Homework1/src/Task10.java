
/*Задача 10:
Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
Пример: 107
Изход: 21 пъти по 2 литра,
 21 пъти по 3 литра
 допълнително кофа от 2 литра
*/
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int litres;
		System.out.println("Input the amount of water that can fill the tank  ");
		litres=sc.nextInt();
		int amountof2litres=litres/5;
		int amountof3litres=litres/5;
		if(litres%5==4){
			amountof2litres+=2;
		}
		else if(litres%5==3){
			amountof3litres++;
		}
		else if(litres%5==2){
			amountof2litres++;
		}
		else if(litres%5==1){
			amountof2litres--;
			amountof3litres++;
		}
		System.out.println(amountof2litres + " пъти по  2 литра " + " \n" + amountof3litres + " пъти по 3 литра ");
		sc.close();
	}
}