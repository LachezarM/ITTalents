/*Задача 15:
Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
Пример: 10
Изход: Добър ден
*/
import java.util.Scanner;

public class Task15 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int currTime;
		System.out.println("Input round off time");
		currTime=sc.nextInt();
		if((currTime>=18 && currTime<=24) || (currTime<=4 && currTime>=0)){
			System.out.println("Good Evening");
		}
		else if(currTime>4 && currTime<=9){
			System.out.println("Good Morning");
		}
		else{
			System.out.println("Good Day");
		}
		sc.close();
	}

}
