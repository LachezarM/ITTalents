/*
 * Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh

 */
 import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do{
			System.out.println("Input first string(both strings max 40 char)");
			first = sc.nextLine();	
			System.out.println("Input second string");
			second = sc.nextLine();
		}while(first.length() >= 40 || second.length() >= 40);
		System.out.println("First string lowwer: " + first.toLowerCase() + "\n	upper: " + first.toUpperCase());
		System.out.println("Second string lowwer: " + second.toLowerCase() + "\n	upper: " + second.toUpperCase());
		sc.close();
	}

}
