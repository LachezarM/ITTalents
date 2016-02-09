/*
 * Задача 24:
Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.

 */
import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num=sc.nextInt();
		int saveNum=num;
		int newNum=0;
		do{
			
			newNum=newNum*10 + (num % 10);
			num/=10;
		}while(num!=0);
		if(newNum==saveNum){
			
			System.out.println("Palindrom");
		}
		else{
			
			System.out.println("Ne e palindrom");
		}
		sc.close();
	}

}
