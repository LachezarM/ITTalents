/*
 * Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
Пример: 2 2
Изход:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;

 */
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 numbers [1;9]: ");
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		for(int i=1;i<=firstNum;i++){
			
			for(int j=1;j<=secondNum;j++){
				
				System.out.println(i + " * " + j + " = " + i*j + ";");
			}
		}
		sc.close();

	}

}
