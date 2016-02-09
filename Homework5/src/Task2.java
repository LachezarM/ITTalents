import java.util.Scanner;

/*
 * Задача 2:
Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe

 */
public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do{
			System.out.println("Input two  words: (10 -20) char");
			first = sc.nextLine();
			second = sc.nextLine();
		}while(first.length() + second.length() < 10 || first .length() + second.length() >20 || second.length() < 5 || first.length() < 5);
		String newFirst = second.substring(0, 5) + first.substring(5);
		String newSecond = first.substring(0,5) + second.substring(5);
		if(newFirst.length() < newSecond.length()){
			System.out.println(newSecond.length() + " " + newSecond);
		}
		else{
			System.out.println(newFirst.length() + " " + newFirst);
		}
		sc.close();
		

	}

}
