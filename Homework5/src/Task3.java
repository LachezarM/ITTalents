/*
 * Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к

 */
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do{
			System.out.println("Input 2 words without spaces");
			first = sc.nextLine();
			second = sc.nextLine();
		}while(first.contains(" ") || second.contains(" "));
		if(first.length() == second.length()){
			System.out.println("Both strings are with equal lengths");
		}
		for(int i = 0;i < first.length();i++){
			if(first.charAt(i) != second.charAt(i) ){
				System.out.println(i + " " + first.charAt(i) + "-" + second.charAt(i));	
			}
		}
		sc.close();
	
	}
}
