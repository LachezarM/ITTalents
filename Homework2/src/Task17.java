/*
 * Задача 17:
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for.
Пример: 4 +
Изход:
****
*++*
*++*
****
*
 */
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a character : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("Input a number: ");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++){
			
			if(i == 1 || i == b){
				
				for(int k=1;k<=b;k++){
					
					System.out.print("*");
				}
			}
			else{
				
				for(int j=1;j<=b;j++){
					
					if(j == 1 || j == b){
						
						System.out.print("*");
					}
					else{
						
						System.out.print(c);
					}
				}
				
			}
			System.out.println();
		}
		sc.close();

	}

}
