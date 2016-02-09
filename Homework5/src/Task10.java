import java.util.Scanner;

/*
 * Задача 10:
Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt

 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String text = sc.nextLine();
		for(int i = 0;i < text.length();i++){
			System.out.print((char)(text.charAt(i) + 5));
		}
		sc.close();
	}

}
