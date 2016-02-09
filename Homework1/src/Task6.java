/*Задача 6:
Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
а3 да има старата стойност на а1.*/

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a1,a2,a3,tmp;
		System.out.print("Моля въведете 3 числа \n a1: ");
		a1 = sc.nextInt();
		System.out.print(" a2: ");
		a2 = sc.nextInt();
		System.out.print(" a3: ");
		a3 = sc.nextInt();
		tmp=a1;
		a1=a2;
		a2=a3;
		a3=tmp;
		System.out.print("After the swap \n a1 :" + a1 +" \n a2 : " + a2 + "\n a3 : " + a3);
		sc.close();
	}

}
