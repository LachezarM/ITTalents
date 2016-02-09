/*
 * Задача 4:
Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
 */
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 names: ");
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		int sumName1 = 0;
		int sumName2 = 0;
		for(int i = 0;i < name1.length();i++){
			if(name1.charAt(i) != ' '){
				sumName1 += name1.charAt(i);
			}
		}
		for(int i = 0;i < name2.length();i++){
			if(name2.charAt(i) != ' '){
				sumName2 += name2.charAt(i);
			}
		}
		if(sumName1 > sumName2){
			System.out.println(name1);
		}
		else{
			System.out.println(name2);
		}
		sc.close();
	}

}
